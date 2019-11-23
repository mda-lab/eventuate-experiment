package org.swfactory.acceleo.module.ddd.eventuate.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.io.Writer;

import org.eclipse.acceleo.engine.AcceleoEnginePlugin;
import org.eclipse.acceleo.engine.generation.writers.AbstractAcceleoWriter;

public class DDDAcceleoFileWriter extends AbstractAcceleoWriter {
	/** If using JMerge, this will be used as the charset for the file created with the merged content. */
	private String selectedCharset;

	/**
	 * If this is set to <code>true</code>, closing this buffer will first attempt to merge the previous file
	 * content with the to-be-generated content.
	 */
	private boolean shouldMerge;

	/** Keeps a reference to the target file's absolute path. */
	private final String targetPath;

	/**
	 * Constructs a buffered file writer around the given file. The file will be created with the default
	 * System encoding.
	 * 
	 * @param target
	 *            File in which this writer will append text.
	 * @param appendMode
	 *            Tells us wether the former content of the file should be deleted.
	 * @throws IOException
	 *             Thrown if the target file doesn't exist and cannot be created.
	 */
	public DDDAcceleoFileWriter(File target, boolean appendMode) throws IOException {
		delegate = new BufferedWriter(new FileWriter(target, appendMode));
		targetPath = target.getAbsolutePath();
		shouldMerge = false;
	}

	/**
	 * Constructs a buffered file writer around the given file and tells which encoding should be used to
	 * generate the file.
	 * 
	 * @param target
	 *            File in which this writer will append text.
	 * @param appendMode
	 *            Tells us wether the former content of the file should be deleted.
	 * @param charset
	 *            Encoding that should be used to create the target file.
	 * @throws IOException
	 *             Thrown if the target file doesn't exist and cannot be created.
	 */
	public DDDAcceleoFileWriter(File target, boolean appendMode, String charset) throws IOException {
		final OutputStream fileOutputStream = new FileOutputStream(target, appendMode);
		final OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutputStream, charset);
		delegate = new BufferedWriter(fileWriter);
		targetPath = target.getAbsolutePath();
		shouldMerge = false;
	}

	/**
	 * Constructs a writer that will use JMerge to merge the content of the file existing at path
	 * <em>filePath</em> with its new content. Note that the file will be written with the default System
	 * encoding if using this.
	 * 
	 * @param filePath
	 *            Path of the file this writer will contain the content of.
	 */
	public DDDAcceleoFileWriter(String filePath) {
		delegate = new StringWriter(DEFAULT_BUFFER_SIZE);
		targetPath = filePath;
		shouldMerge = true;
	}

	/**
	 * Constructs a writer that will use JMerge to merge the content of the file existing at path
	 * <em>filePath</em> with its new content.
	 * 
	 * @param filePath
	 *            Path of the file this writer will contain the content of.
	 * @param charset
	 *            Encoding that's to be used to create the file with the merged content.
	 */
	public DDDAcceleoFileWriter(String filePath, String charset) {
		this(filePath);
		selectedCharset = charset;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.acceleo.engine.generation.writers.AbstractAcceleoWriter#close()
	 */
	@Override
	public void close() throws IOException {
		if (!shouldMerge) {
			delegate.close();
		} else {
			// The decorated writer is a StringWriter. Closing has no effect on it
			flush();
			try {
				Class.forName("org.eclipse.emf.codegen.merge.java.JMerger"); //$NON-NLS-1$
				final String mergedContent = DDDJMergeUtil.mergeFileContent(new File(targetPath), toString(),
						selectedCharset);
				// Write the new file on disk
				Writer writer = null;
				try {
					if (selectedCharset == null) {
						writer = new BufferedWriter(new FileWriter(new File(targetPath)));
					} else {
						final OutputStream fileOutputStream = new FileOutputStream(new File(targetPath));
						final OutputStreamWriter fileWriter = new OutputStreamWriter(fileOutputStream,
								selectedCharset);
						writer = new BufferedWriter(fileWriter);
					}
					writer.append(mergedContent);
				} finally {
					if (writer != null) {
						writer.close();
					}
				}
			} catch (ClassNotFoundException e) {
				/*
				 * shouldn't happen. This would mean we are in eclipse yet org.eclipse.emf.codegen cannot be
				 * found as a dependency of the generator plugin. This shouldn't happen since it is a
				 * reexported dependency of the engine.
				 */
				AcceleoEnginePlugin.log(e, true);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.acceleo.engine.generation.writers.AbstractAcceleoWriter#getTargetPath()
	 */
	@Override
	public String getTargetPath() {
		return targetPath;
	}
}

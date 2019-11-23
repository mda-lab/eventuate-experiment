package org.swfactory.acceleo.module.ddd.eventuate.main;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.codegen.merge.java.JControlModel;
import org.eclipse.emf.codegen.merge.java.JMerger;
import org.eclipse.emf.codegen.merge.java.facade.ast.ASTFacadeHelper;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.formatter.DefaultCodeFormatterConstants;

public class DDDASTFacadeHelper extends ASTFacadeHelper {
	  /**
	   * Debug output setting
	   */
	  protected final static boolean DEBUG = JMerger.DEBUG;

	  /**
	   * Gets JavaCore options from JavaCore and updates tab and indentation settings from ControlModel.
	   * 
	   * @return map of options
	   * 
	   * @see #getJavaCoreOptions()
	   * @see JavaCore#getOptions()
	   * @see JControlModel#getLeadingTabReplacement()
	   */
	  public Map<?, ?> getJavaCoreOptions()
	  {
	    Map<Object, String> javaCoreOptions = new HashMap<Object, String>(JavaCore.getOptions());

	    // Set of options that we want to copy from the current definition or use defaults
	    //
	    if (compilerCompliance != null)
	    {
	      javaCoreOptions.put(JavaCore.COMPILER_COMPLIANCE, compilerCompliance);
	      javaCoreOptions.put(JavaCore.COMPILER_SOURCE, compilerCompliance);
	      javaCoreOptions.put(JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, compilerCompliance);
	    }
	    else
	    {
	      useOption(javaCoreOptions, JavaCore.COMPILER_COMPLIANCE, "1.8");
	      useOption(javaCoreOptions, JavaCore.COMPILER_SOURCE, "1.8");
	      useOption(javaCoreOptions, JavaCore.COMPILER_CODEGEN_TARGET_PLATFORM, "1.8");
	    }
	    useOption(javaCoreOptions, DefaultCodeFormatterConstants.FORMATTER_TAB_CHAR, JavaCore.SPACE);
	    useOption(javaCoreOptions, DefaultCodeFormatterConstants.FORMATTER_TAB_SIZE, "2");
	    useOption(javaCoreOptions, DefaultCodeFormatterConstants.FORMATTER_INDENTATION_SIZE, "2");

	    javaCoreOptions.put(JavaCore.COMPILER_DOC_COMMENT_SUPPORT, "enabled");

	    if (getControlModel() != null)
	    {
	      String indent = getControlModel().getLeadingTabReplacement();
	      if (indent != null && indent.length() > 0)
	      {
	        String size = Integer.toString(indent.length());
	        if (indent.charAt(0) == '\t') 
	        {
	          javaCoreOptions.put(DefaultCodeFormatterConstants.FORMATTER_TAB_CHAR, JavaCore.TAB);
	          javaCoreOptions.put(DefaultCodeFormatterConstants.FORMATTER_TAB_SIZE, size);
	          javaCoreOptions.put(DefaultCodeFormatterConstants.FORMATTER_INDENTATION_SIZE, size);                
	        }
	        else if (indent.charAt(0) == ' ')
	        {
	          javaCoreOptions.put(DefaultCodeFormatterConstants.FORMATTER_TAB_CHAR, JavaCore.SPACE);
	          javaCoreOptions.put(DefaultCodeFormatterConstants.FORMATTER_TAB_SIZE, size);
	          javaCoreOptions.put(DefaultCodeFormatterConstants.FORMATTER_INDENTATION_SIZE, size);                
	        }
	        else
	        {
	          if (DEBUG)
	          {
	            logInfo("Unable to recognize indent string, using java core options.");
	          }
	        }
	      }
	      else
	      {
	        if (DEBUG)
	        {
	          logInfo("Indent is not set, using java core options.");
	        }
	      }
	    }

	    if (DEBUG)
	    {
	      logInfo("Tab char: " + javaCoreOptions.get(DefaultCodeFormatterConstants.FORMATTER_TAB_CHAR) + ", Indent size: "
	        + javaCoreOptions.get(DefaultCodeFormatterConstants.FORMATTER_TAB_SIZE) + ", Tab size: "
	        + javaCoreOptions.get(DefaultCodeFormatterConstants.FORMATTER_INDENTATION_SIZE));
	    }

	    // Set of options that we want to control
	    javaCoreOptions.put("org.eclipse.jdt.core.incompleteClasspath", "warning");
	    javaCoreOptions.put("org.eclipse.jdt.core.circularClasspath", "warning");
	    //
	    javaCoreOptions.put(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_ENUM_DECLARATION, DefaultCodeFormatterConstants.NEXT_LINE);
	    javaCoreOptions.put(DefaultCodeFormatterConstants.FORMATTER_BRACE_POSITION_FOR_TYPE_DECLARATION, DefaultCodeFormatterConstants.NEXT_LINE);
	    
	    // separate fields with an empty line
	    javaCoreOptions.put(DefaultCodeFormatterConstants.FORMATTER_BLANK_LINES_BEFORE_FIELD, "1");
	    
	    // make all enum constants to be on separate lines
	    javaCoreOptions.put(DefaultCodeFormatterConstants.FORMATTER_ALIGNMENT_FOR_ENUM_CONSTANTS, DefaultCodeFormatterConstants.createAlignmentValue(true, DefaultCodeFormatterConstants.WRAP_ONE_PER_LINE, DefaultCodeFormatterConstants.INDENT_DEFAULT));
	    
	    return javaCoreOptions;
	  }
	  
	  
	  protected void useOption(Map<Object, String> options, String option)
	  {
	    useOption(options, option, null); 
	  }

	  /**
	   * @since 2.8
	   * @param options
	   * @param option
	   * @param defaultValue
	   */
	  protected void useOption(Map<Object, String> options, String option, String defaultValue)
	  {
	    String value = JavaCore.getOption(option);
	    if (value != null)
	    {
	      options.put(option, value);
	    }
	    else if (defaultValue != null)
	    {
	      options.put(option, defaultValue);
	    }
	  }
	  
}

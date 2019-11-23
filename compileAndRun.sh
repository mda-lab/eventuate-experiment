pushd org.swfactory.acceleo.module.ddd.eventuate.parent && \
  mvn clean install && \
popd && \
pushd org.swfactory.ddd.restaurant/restaurant && \
  rm -rf app/src be/src public/src rest/src && \
popd && \
pushd org.swfactory.acceleo.module.ddd.eventuate && \
  ./run.sh && \
popd
pushd org.swfactory.ddd.restaurant/restaurant && \
  mvn clean install && \
  ./dockerBuild.sh && \
popd


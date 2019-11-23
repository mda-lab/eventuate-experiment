This is a simple microservice code generation experiment with Acceleo using UML.
I used 'eventuate' (from Chris Richardson) as a microservice architecture.


1) I created a basic UML profile for DDD modeling (org.swfactory.ddd.profile and org.swfactory.ddd.profile.plugin)
2) I created a class diagram that uses the UML DDD profile to represent the domain. (org.swfactory.ddd.restaurant.model)
3) I created some simple Acceleo rules to generate the code starting from the model (org.swfactory.acceleo.module.ddd.eventuate)
4) The generated code will be found in the org.swfactory.ddd.restaurant project

To run the whole build and build process, run the compileAndRun.sh script.
This script will end with the creation of a docker 'restaurant: latest' image that can be executed using

`
  org.swfactory.ddd.restaurant/restaurant/docker/docker-compose.yml up -d
`

Attention: the code is absolutely experimental. Please check the scripts before launching them.

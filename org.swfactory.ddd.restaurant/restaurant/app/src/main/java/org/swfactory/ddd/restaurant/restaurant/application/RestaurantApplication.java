package org.swfactory.ddd.restaurant.restaurant.application;

import io.eventuate.javaclient.driver.EventuateDriverConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.swfactory.ddd.restaurant.restaurant.rest.RestaurantWebConfiguration;
import org.swfactory.ddd.restaurant.restaurant.rest.RestaurantSwaggerConfiguration;


/**
* @generated
*/
@Configuration
@Import({RestaurantWebConfiguration.class,
        EventuateDriverConfiguration.class,
        RestaurantSwaggerConfiguration.class})
@EnableAutoConfiguration
@ComponentScan
public class RestaurantApplication {

  /**
  * @generated
  */
  public static void main(String[ ] args) {
    SpringApplication.run(RestaurantApplication.class, args);
  }
}


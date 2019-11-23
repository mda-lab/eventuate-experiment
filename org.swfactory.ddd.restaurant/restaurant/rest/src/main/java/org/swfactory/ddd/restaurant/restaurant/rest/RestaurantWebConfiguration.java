package org.swfactory.ddd.restaurant.restaurant.rest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.swfactory.ddd.restaurant.restaurant.configurations.RestaurantAggregateConfiguration;
import org.swfactory.ddd.restaurant.restaurant.rest.WebConfiguration;


/**
* @generated
*/
@Configuration
@ComponentScan
@Import({RestaurantAggregateConfiguration.class, WebConfiguration.class})
public class RestaurantWebConfiguration {
}

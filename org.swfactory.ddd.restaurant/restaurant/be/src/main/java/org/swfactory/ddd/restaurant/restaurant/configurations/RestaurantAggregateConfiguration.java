package org.swfactory.ddd.restaurant.restaurant.configurations;

import io.eventuate.AggregateRepository;
import io.eventuate.EventuateAggregateStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.swfactory.ddd.restaurant.restaurant.infos.RestaurantInfo;
import org.swfactory.ddd.restaurant.restaurant.commands.RestaurantCommand;
import org.swfactory.ddd.restaurant.restaurant.aggregates.RestaurantAggregate;
import org.swfactory.ddd.restaurant.restaurant.services.RestaurantService;


/**
* @generated
*/
@Configuration
@ComponentScan
public class RestaurantAggregateConfiguration {
    /**
    * @generated
    */
    @Bean
    public AggregateRepository<RestaurantAggregate, RestaurantCommand> restaurantAggregateRepository(EventuateAggregateStore eventStore) {
        return new AggregateRepository<>(RestaurantAggregate.class, eventStore);
    }

    /**
    * @generated
    */
    @Bean
    public RestaurantService restaurantService(AggregateRepository<RestaurantAggregate, RestaurantCommand> restaurantAggregateRepository) {
        return new RestaurantService(restaurantAggregateRepository);
    }
}

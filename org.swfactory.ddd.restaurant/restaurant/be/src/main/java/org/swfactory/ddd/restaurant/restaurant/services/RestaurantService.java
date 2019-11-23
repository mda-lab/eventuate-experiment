package org.swfactory.ddd.restaurant.restaurant.services;

import io.eventuate.AggregateRepository;
import io.eventuate.EntityWithIdAndVersion;
import java.util.concurrent.CompletableFuture;

import org.swfactory.ddd.restaurant.restaurant.infos.RestaurantInfo;
import org.swfactory.ddd.restaurant.restaurant.commands.CreateRestaurantCommand;
import org.swfactory.ddd.restaurant.restaurant.commands.UpdateRestaurantCommand;
import org.swfactory.ddd.restaurant.restaurant.commands.DeleteRestaurantCommand;
import org.swfactory.ddd.restaurant.restaurant.commands.RestaurantCommand;
import org.swfactory.ddd.restaurant.restaurant.aggregates.RestaurantAggregate;


/**
* @generated
*/
public class RestaurantService {
    /**
    * @generated
    */
    private final AggregateRepository<RestaurantAggregate, RestaurantCommand> repository;

    /**
    * @generated
    */
    public RestaurantService(AggregateRepository<RestaurantAggregate, RestaurantCommand> repository) {
        this.repository = repository;
    }

    /**
    * @generated
    */
    public CompletableFuture<EntityWithIdAndVersion<RestaurantAggregate>> createRestaurant(RestaurantInfo restaurantInfo) {
        return repository.save(new CreateRestaurantCommand(restaurantInfo));
    }

    /**
    * @generated
    */
    public CompletableFuture<EntityWithIdAndVersion<RestaurantAggregate>> updateRestaurant(String id, RestaurantInfo restaurantInfo) {
        return repository.update(id, new UpdateRestaurantCommand(restaurantInfo));
    }

    /**
    * @generated
    */
    public CompletableFuture<EntityWithIdAndVersion<RestaurantAggregate>> deleteRestaurant(String id) {
        return repository.update(id, new DeleteRestaurantCommand());
    }
}

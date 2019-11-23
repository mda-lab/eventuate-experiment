package org.swfactory.ddd.restaurant.restaurant.events;

import io.eventuate.Event;
import io.eventuate.EventEntity;

@EventEntity(entity="org.swfactory.ddd.restaurant.restaurant.aggregates.RestaurantAggregate")
/**
* @generated
*/
public abstract class RestaurantEvent implements Event {
}

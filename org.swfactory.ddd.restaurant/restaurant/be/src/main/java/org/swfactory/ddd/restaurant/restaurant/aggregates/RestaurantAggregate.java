package org.swfactory.ddd.restaurant.restaurant.aggregates;

import io.eventuate.Event;
import io.eventuate.EventUtil;
import io.eventuate.ReflectiveMutableCommandProcessingAggregate;
import org.swfactory.ddd.restaurant.restaurant.infos.RestaurantInfo;
import org.swfactory.ddd.restaurant.restaurant.commands.CreateRestaurantCommand;
import org.swfactory.ddd.restaurant.restaurant.commands.UpdateRestaurantCommand;
import org.swfactory.ddd.restaurant.restaurant.commands.DeleteRestaurantCommand;
import org.swfactory.ddd.restaurant.restaurant.commands.RestaurantCommand;
import org.swfactory.ddd.restaurant.restaurant.events.CreatedRestaurantEvent;
import org.swfactory.ddd.restaurant.restaurant.events.UpdatedRestaurantEvent;
import org.swfactory.ddd.restaurant.restaurant.events.DeletedRestaurantEvent;
import org.swfactory.ddd.restaurant.restaurant.events.RestaurantEvent;


import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
* @generated
*/
public class RestaurantAggregate  extends ReflectiveMutableCommandProcessingAggregate<RestaurantAggregate, RestaurantCommand> {
	private static Log logger = LogFactory.getLog(RestaurantAggregate.class);
    private boolean deleted = false;
    /**
    * @generated
    */
    private RestaurantInfo restaurantInfo;
    
    /**
    * @generated
    */
    public RestaurantInfo getRestaurantInfo() {
      logger.info("Get Restaurant: " + (this.restaurantInfo == null ? "null" : this.restaurantInfo.toString()));
      return restaurantInfo;
    }
    
    /**
    * @generated
    */
    public void setRestaurantInfo(RestaurantInfo restaurantInfo) {
      this.restaurantInfo = restaurantInfo;
    }
    /**
    * @generated
    */
    public List<Event> process(CreateRestaurantCommand cmd) {
    	logger.info("Process: " + cmd.getClass().getSimpleName());
        return EventUtil.events(new CreatedRestaurantEvent(cmd.getRestaurantInfo()));
    }

    /**
    * @generated
    */
    public List<Event> process(UpdateRestaurantCommand cmd) {
    	logger.info("Process: " + cmd.getClass().getSimpleName());
        if(!this.deleted) {
            return EventUtil.events(new UpdatedRestaurantEvent(cmd.getRestaurantInfo()));
        }
        return new ArrayList<>();
    }

    /**
    * @generated
    */
    public List<Event> process(DeleteRestaurantCommand cmd) {
    	logger.info("Process: " + cmd.getClass().getSimpleName());
        if(!this.deleted) {
            return EventUtil.events(new DeletedRestaurantEvent());
        }
        return new ArrayList<>();
    }

    /**
    * @generated
    */
    public void apply(CreatedRestaurantEvent event) {
    	logger.info("Apply: " + event.getClass().getSimpleName());
        this.restaurantInfo = event.getRestaurantInfo();
    }

    /**
    * @generated
    */
    public void apply(UpdatedRestaurantEvent event) {
    	logger.info("Apply: " + event.getClass().getSimpleName());
        this.restaurantInfo = event.getRestaurantInfo();
    }

    /**
    * @generated
    */
    public void apply(DeletedRestaurantEvent event) {
    	logger.info("Apply: " + event.getClass().getSimpleName());
        this.deleted = true;
    }

}

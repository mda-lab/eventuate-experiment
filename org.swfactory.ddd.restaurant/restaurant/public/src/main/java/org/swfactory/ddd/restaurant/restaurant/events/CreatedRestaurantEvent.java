package org.swfactory.ddd.restaurant.restaurant.events;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.swfactory.ddd.restaurant.restaurant.infos.RestaurantInfo;

/**
* @generated
*/
public class CreatedRestaurantEvent  extends RestaurantEvent {
    /**
    * @generated
    */
    public CreatedRestaurantEvent() {
    }
    /**
    * @generated
    */
    private RestaurantInfo restaurantInfo;
    
    /**
    * @generated
    */
    public CreatedRestaurantEvent(RestaurantInfo restaurantInfo) {
      this.restaurantInfo = restaurantInfo;
    }
    
    /**
    * @generated
    */
    public RestaurantInfo getRestaurantInfo() {
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
    @Override
    public String toString() {
      return ToStringBuilder.reflectionToString(this);
    }
}

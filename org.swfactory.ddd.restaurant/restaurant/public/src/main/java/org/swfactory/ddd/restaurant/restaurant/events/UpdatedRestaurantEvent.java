package org.swfactory.ddd.restaurant.restaurant.events;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.swfactory.ddd.restaurant.restaurant.infos.RestaurantInfo;

/**
* @generated
*/
public class UpdatedRestaurantEvent  extends RestaurantEvent {
	/**
	* @generated
	*/
    public UpdatedRestaurantEvent() {
    }
    /**
    * @generated
    */
    private RestaurantInfo restaurantInfo;
    
    /**
    * @generated
    */
    public UpdatedRestaurantEvent(RestaurantInfo restaurantInfo) {
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

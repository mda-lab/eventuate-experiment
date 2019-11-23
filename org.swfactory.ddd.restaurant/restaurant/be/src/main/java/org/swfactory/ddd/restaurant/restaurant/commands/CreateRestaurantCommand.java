package org.swfactory.ddd.restaurant.restaurant.commands;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.swfactory.ddd.restaurant.restaurant.infos.RestaurantInfo;

/**
* @generated
*/
public class CreateRestaurantCommand  implements RestaurantCommand {
    /**
    * @generated
    */
    public CreateRestaurantCommand() {
    }
    /**
    * @generated
    */
    private RestaurantInfo restaurantInfo;
    
    /**
    * @generated
    */
    public CreateRestaurantCommand(RestaurantInfo restaurantInfo) {
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

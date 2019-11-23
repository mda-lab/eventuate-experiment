package org.swfactory.ddd.restaurant.restaurant.responses;

public class CreateRestaurantResponse {
  private String restaurantId;

  public CreateRestaurantResponse() {
  }

  public CreateRestaurantResponse(String restaurantId) {
    this.restaurantId = restaurantId;
  }

  public String getRestaurantId() {
    return restaurantId;
  }

  public void setRestaurantId(String restaurantId) {
    this.restaurantId = restaurantId;
  }
}

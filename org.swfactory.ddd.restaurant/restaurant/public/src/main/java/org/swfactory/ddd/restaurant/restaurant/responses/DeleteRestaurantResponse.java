package org.swfactory.ddd.restaurant.restaurant.responses;

public class DeleteRestaurantResponse {
  private String version;

  public DeleteRestaurantResponse() {
  }

  public DeleteRestaurantResponse(String version) {
    this.version = version;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }
}

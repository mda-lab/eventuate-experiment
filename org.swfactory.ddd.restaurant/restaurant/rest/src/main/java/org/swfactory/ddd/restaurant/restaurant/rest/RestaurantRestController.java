package org.swfactory.ddd.restaurant.restaurant.rest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.concurrent.CompletableFuture;
import org.swfactory.ddd.restaurant.restaurant.responses.CreateRestaurantResponse;
import org.swfactory.ddd.restaurant.restaurant.responses.DeleteRestaurantResponse;
import org.swfactory.ddd.restaurant.restaurant.responses.UpdateRestaurantResponse;
import org.swfactory.ddd.restaurant.restaurant.services.RestaurantService;
import org.swfactory.ddd.restaurant.restaurant.infos.RestaurantInfo;

/**
* @generated
*/
@RestController
@RequestMapping("/restaurants")
public class RestaurantRestController {
  private Log logger = LogFactory.getLog(RestaurantRestController.class);
  /**
  * @generated
  */
  private RestaurantService restaurantService;

  /**
  * @generated
  */
  @Autowired
  public RestaurantRestController(RestaurantService restaurantService) {
    this.restaurantService = restaurantService;
  }

  /**
  * @generated
  */
  @RequestMapping(method = RequestMethod.POST)
  public CompletableFuture<CreateRestaurantResponse> createRestaurant(@RequestBody @Valid RestaurantInfo request) {
	logger.info("##################################### CREATE RESTAURANT ############################");
    return restaurantService.createRestaurant(request)
            .thenApply(entityAndEventInfo -> new CreateRestaurantResponse(entityAndEventInfo.getEntityId()));
  }

  /**
  * @generated
  */
  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public CompletableFuture<UpdateRestaurantResponse> updateRestaurant(@PathVariable("id") String restaurantId,
                                                                      @RequestBody  @Valid RestaurantInfo request) {
	  logger.info("##################################### UPDATE RESTAURANT ############################");
    return restaurantService.updateRestaurant(restaurantId, request)
            .thenApply(entityAndEventInfo -> new UpdateRestaurantResponse(entityAndEventInfo.getEntityVersion().asString()));
  }

  /**
  * @generated
  */
  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public CompletableFuture<DeleteRestaurantResponse> deleteRestaurant(@PathVariable("id") String restaurantId) {
	  logger.info("##################################### DELETE RESTAURANT ############################");
    return restaurantService.deleteRestaurant(restaurantId).thenApply(entityAndEventInfo -> new DeleteRestaurantResponse(entityAndEventInfo.getEntityVersion().asString()));
  }
}

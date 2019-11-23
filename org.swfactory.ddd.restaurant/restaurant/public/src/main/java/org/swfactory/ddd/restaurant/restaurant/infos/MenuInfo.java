package org.swfactory.ddd.restaurant.restaurant.infos;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;
import java.util.Set;
import org.swfactory.ddd.restaurant.restaurant.infos.MenuItemInfo;


/**
* @generated
*/
public class MenuInfo {
  /**
  * @generated
  */
  private String id;
  /**
  * @generated
  */
  public String getId() {
    return this.id;
  }
  /**
  * @generated
  */
  public void setId(String id) {
    this.id = id;
  }
  
  /**
  * @generated
  */
  private String name;
  /**
  * @generated
  */
  public String getName() {
    return this.name;
  }
  /**
  * @generated
  */
  public void setName(String name) {
    this.name = name;
  }
  

  /**
  * @generated
  */
  private List<MenuItemInfo> items;
  /**
  * @generated
  */
  public List<MenuItemInfo> getItems() {
    return this.items;
  }
  /**
  * @generated
  */
  public void setItems(List<MenuItemInfo> items) {
    this.items = items;
  }
  

  /**
  * @generated
  */
  @Override
  public boolean equals(Object o) {
    return EqualsBuilder.reflectionEquals(this, o);
  }

  /**
  * @generated
  */
  @Override
  public int hashCode() {
    return HashCodeBuilder.reflectionHashCode(this);
  }
}

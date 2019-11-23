package org.swfactory.ddd.restaurant.restaurant.infos;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;
import java.util.Set;
import org.swfactory.ddd.restaurant.restaurant.infos.TableInfo;
import org.swfactory.ddd.restaurant.restaurant.infos.MenuInfo;


/**
* @generated
*/
public class RestaurantInfo {
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
  private List<String> logoUri;
  /**
  * @generated
  */
  public List<String> getLogoUri() {
    return this.logoUri;
  }
  /**
  * @generated
  */
  public void setLogoUri(List<String> logoUri) {
    this.logoUri = logoUri;
  }
  

  /**
  * @generated
  */
  private List<MenuInfo> menu;
  /**
  * @generated
  */
  public List<MenuInfo> getMenu() {
    return this.menu;
  }
  /**
  * @generated
  */
  public void setMenu(List<MenuInfo> menu) {
    this.menu = menu;
  }
  
  /**
  * @generated
  */
  private List<TableInfo> tables;
  /**
  * @generated
  */
  public List<TableInfo> getTables() {
    return this.tables;
  }
  /**
  * @generated
  */
  public void setTables(List<TableInfo> tables) {
    this.tables = tables;
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

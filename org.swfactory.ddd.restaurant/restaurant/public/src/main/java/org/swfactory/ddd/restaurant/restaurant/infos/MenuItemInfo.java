package org.swfactory.ddd.restaurant.restaurant.infos;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;
import java.util.Set;



/**
* @generated
*/
public class MenuItemInfo {
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
  private String description;
  /**
  * @generated
  */
  public String getDescription() {
    return this.description;
  }
  /**
  * @generated
  */
  public void setDescription(String description) {
    this.description = description;
  }
  
  /**
  * @generated
  */
  private Double price;
  /**
  * @generated
  */
  public Double getPrice() {
    return this.price;
  }
  /**
  * @generated
  */
  public void setPrice(Double price) {
    this.price = price;
  }
  
  /**
  * @generated
  */
  private List<String> notes;
  /**
  * @generated
  */
  public List<String> getNotes() {
    return this.notes;
  }
  /**
  * @generated
  */
  public void setNotes(List<String> notes) {
    this.notes = notes;
  }
  
  /**
  * @generated
  */
  private List<String> photoUrl;
  /**
  * @generated
  */
  public List<String> getPhotoUrl() {
    return this.photoUrl;
  }
  /**
  * @generated
  */
  public void setPhotoUrl(List<String> photoUrl) {
    this.photoUrl = photoUrl;
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

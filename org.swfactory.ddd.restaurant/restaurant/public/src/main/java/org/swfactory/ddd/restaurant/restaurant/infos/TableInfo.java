package org.swfactory.ddd.restaurant.restaurant.infos;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.NotEmpty;

import java.util.List;
import java.util.Set;


/**
* @generated
*/
public class TableInfo {
  /**
  * @generated
  */
  private Integer id;
  /**
  * @generated
  */
  public Integer getId() {
    return this.id;
  }
  /**
  * @generated
  */
  public void setId(Integer id) {
    this.id = id;
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

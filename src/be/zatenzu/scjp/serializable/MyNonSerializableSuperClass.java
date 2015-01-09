// $Id$
package be.zatenzu.scjp.serializable;

public class MyNonSerializableSuperClass
{
  public String field;
  
  public MyNonSerializableSuperClass(){
    this.field = "ValueFromMySuperConstructor";
  }

  public String getField()
  {
    return field;
  }

  public void setField(String field)
  {
    this.field = field;
  }
  
  
}

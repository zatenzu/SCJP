// $Id$
package be.zatenzu.scjp.serializable;

public class MyNonSerializableSuperClass
{
  public String field;
  
  public MyNonSerializableSuperClass(){
    System.out.println("Default constructor called");
    this.field = "ValueFromMySuperConstructor";
  }

  public MyNonSerializableSuperClass(String test){
    System.out.println("Constructor String called");
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

// $Id$
package be.zatenzu.scjp.collections.set.linkedhashset;

public class MyClass
{
  protected String s;
  
  public MyClass(String s)
  {
    this.s = s;
  }
  
  @Override
  public int hashCode()
  {
    return this.s.hashCode();
  }



  @Override
  public boolean equals(Object obj)
  {
    boolean isEquals = false;
    
    if(obj != null){
      if(this == obj){
        isEquals = true;
      }
      else if(obj instanceof MyClass){
        MyClass m = (MyClass)obj;
        isEquals = this.s.equals(m.s);
      }
    }
    
    return isEquals;
  }
  
  
  
}

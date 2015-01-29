// $Id$
package be.zatenzu.scjp.collections.map.hashmap;

public class MyClass
{
  String s;

  public MyClass(String s){
    this.s = s;
  }

  @Override
  public String toString()
  {
    // TODO Auto-generated method stub
    return s;
  }
  
  @Override
  public int hashCode()
  {
    return this.s.hashCode();
  }



  @Override
  public boolean equals(Object obj)
  {
    return true;
  }
}

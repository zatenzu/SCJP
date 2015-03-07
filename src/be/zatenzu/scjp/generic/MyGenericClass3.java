// $Id$
package be.zatenzu.scjp.generic;

public class MyGenericClass3 
{
//  protected T myGenericVar; //required MyGenericClass3<T>
  
  //but with a constructor you can do that
  public <T> MyGenericClass3(T t){
  }
}

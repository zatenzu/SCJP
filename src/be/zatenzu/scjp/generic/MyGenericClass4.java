// $Id$
package be.zatenzu.scjp.generic;

public class MyGenericClass4<T extends Exception>
{
  protected T myVar;
  
  public MyGenericClass4(T t){
    myVar = t;
  }
  
  //same erasure as MyGenericClass4(T t){
//  public MyGenericClass4(Exception ex){
//    myVar = ex;//NOK
//  }
  
  public MyGenericClass4(Throwable t){
//    myVar = t;//NOK
  }
  
  
}

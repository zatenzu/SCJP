// $Id$
package be.zatenzu.scjp.keywords._super;

public class MySuperClass
{
  private int myVar;
  
  public MySuperClass(){
    System.out.println("MySuperClass constructor");
  }
  
  public MySuperClass(int i){
    System.out.println("MySuperClass constructor with 1 int parameter");
  }
  
  public void myMethod(){
    System.out.println("MySuperClass method");
  }
}

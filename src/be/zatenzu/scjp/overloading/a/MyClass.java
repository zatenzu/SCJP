// $Id$
package be.zatenzu.scjp.overloading.a;

import java.io.FileNotFoundException;

import be.zatenzu.scjp.overloading.b.Mother;
import be.zatenzu.scjp.overloading.b.SubClass;

public class MyClass
{
  public void methodToOverload(String s, int i, float a){};
  public void methodToOverload(String s, int i){};
  public String methodToOverload(String s, float a){return new String();};
  public void methodToOverload(float a, int i) throws FileNotFoundException{};

  public void a(Mother m){
    System.out.println("Mother");
  }
  public void a(SubClass m){
    System.out.println("SubClass");
  }
  
  public static void main(String[] args)
  {
    Mother a = new Mother();
    Mother b = new SubClass();
    SubClass c = new SubClass();
    
    //which method is called?
    MyClass myClass = new MyClass();
    myClass.a(a);
    myClass.a(b);
    myClass.a(c);
    // ====> The reference type(NOT the object type) decide which overloaded method is invoke !!!!
    //It's decided at compiler time, not runtime
  }
}

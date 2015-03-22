// $Id$
package be.zatenzu.scjp.polymorphism.overridding.a;

public class SubClass extends Mother
{

  //not overriding, argument type is different
  public void a(String s){}
  
  //You cannot reduce the visibility with overridding (public -> private)
//  private void a(String s){}; --> forbidden

  //The return type can be a subclass of the return type of the overridded method .
  public String b(String s){return new String();} //->yes it's overridding
  //  /!\ only for return type, not for parameters

  /** ok I'm the same package and it's a non final method**/
  void c(){}

  /** ok I'm a subclass and it's a non final method**/
  protected void d(){}
  
  /** I can't overridde e method because it's private **/
  private void e(){}//-> It's a new method
  
  /** cannot be overridde because it's final **/
//  public void f(){};//It's final
  
  /** cannot overridde a static method **/
  public static void g(){}// -> It's a new method!

  //TODO exception
  public void h(){}
  public void i() throws NumberFormatException{}
  public void j() throws RuntimeException{}
  /** I' can't but why? (wating for chapter 5) **/
//  public void k() throws Exception{}
  
  /** the same exception ok**/
  public void l() throws Exception{}
  /** A subclass of Exception, ok**/
  public void m() throws RuntimeException{}
  /** cannot be a Super class of Exception**/
//  public void n() throws Throwable{}
  public void o(){};//override ok
  //===
  
  public void myMethodToOverridde(){
    System.out.println("SubClass");
  }
  
  public static void main(String[] args)
  {
    Mother m = new Mother();
    Mother m2 = new SubClass();
    SubClass m3 = new SubClass();
    
    //which method is called?
    m.myMethodToOverridde();
    m2.myMethodToOverridde();
    m3.myMethodToOverridde();
    //==> It's defined by the object type at runtime!!!!
  }
  
}

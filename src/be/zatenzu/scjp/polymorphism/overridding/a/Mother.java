// $Id$
package be.zatenzu.scjp.polymorphism.overridding.a;

public class Mother
{
  public void a(Object s){}
  public Object b(String s){return new Object();}
  void c(){}
  protected void d(){}
  private void e(){}
  public final void f(){}
  public static void g(){}
  
  public void h() throws IllegalArgumentException{}
  public void i() throws IllegalArgumentException{}
  public void j() throws IllegalArgumentException{}
  public void k() throws IllegalArgumentException{}
  
  public void l() throws Exception{}
  public void m() throws Exception{}
  public void n() throws Exception{}
  public void o() throws Exception{}
  
  public void myMethodToOverridde(){
    System.out.println("Mother");
  }
}

// $Id$
package be.zatenzu.scjp.polymorphism.overridding.a;

public class Mother
{
  public void a(Object s){System.out.println("Mother");}
  public Object b(String s){System.out.println("Mother");return new Object();}
  void c(){System.out.println("Mother");}
  protected void d(){System.out.println("Mother");}
  private void e(){System.out.println("Mother");}
  public final void f(){System.out.println("Mother");}
  public static void g(){System.out.println("Mother");}
  
  public void h() throws IllegalArgumentException{System.out.println("Mother");}
  public void i() throws IllegalArgumentException{System.out.println("Mother");}
  public void j() throws IllegalArgumentException{System.out.println("Mother");}
  public void k() throws IllegalArgumentException{System.out.println("Mother");}
  
  public void l() throws Exception{System.out.println("Mother");}
  public void m() throws Exception{System.out.println("Mother");}
  public void n() throws Exception{System.out.println("Mother");}
  public void o() throws Exception{System.out.println("Mother");}
  
  public void myMethodToOverridde(){
    System.out.println("Mother");
  }
}

// $Id$
package be.zatenzu.scjp.keywords._retrurn;

public class _Return
{
  //return type follow wrapper et primitive type rules
  public void myVoidMethod(){
    return;//exit the method
  }
  
  public Mother myReturnMotherMethod(){
    return new SubClass();//IS-A test ok
  }
  
  public SubClass myReturnSubClassMethod(){
//    return new Mother();//cannot without casting
    return new SubClass();
  }
  
  public int myReturnIntMethod(){
    return new Integer(1);//Can return the wrapper
  }
  
  public Integer myReturnWrapperClass(){
    int i = 2;
    return i;//Can return the primitive type
  }
  
  public int myReturnWithWideningMethod(){
    byte b = 1;
    return b;//widening ok
  }
  
  //cannont return var args
  /*public String... myVarArgsMethod(){
    return "";
  }*/
  
}

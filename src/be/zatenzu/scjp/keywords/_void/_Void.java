// $Id$
package be.zatenzu.scjp.keywords._void;


public abstract class _Void<T>
{
  
  public void myMethod(){//return nothing;
    return;
  }
  
  public abstract T myOperationA();
  
  
  public static void main(String[] args)
  {
    Void v;
//    v = new Object(); Void isn't Object!
    
    
    new _Void<Void>(){

      @Override
      public Void myOperationA()
      {
        return null;
      }
      
    };
  }
}

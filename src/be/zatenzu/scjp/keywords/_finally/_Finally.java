// $Id$
package be.zatenzu.scjp.keywords._finally;

public class _Finally
{
  public static void main(String[] args)
  {
    // finally can be used without catch block
    try{
      System.out.println("");
    }finally{}
    
    // If catch block exists, finally must be after the last catch block.
    try{
      System.out.println("");
    }
    catch(Exception ex){
      
    }
    catch(Throwable t){}
    finally{}
    
    //See try and catch keywords
  }
}

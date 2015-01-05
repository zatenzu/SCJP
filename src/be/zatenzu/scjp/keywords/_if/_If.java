// $Id$
package be.zatenzu.scjp.keywords._if;

public class _If
{
 
  public static void main(String[] args)
  {
    if(true)
      System.out.println("Without braces");

    if(true)
      System.out.println("Without braces");
    else
      System.out.println("Without braces");
    
    if(true){
      System.out.println("With braces");
    }
    
    if(true){
      System.out.println("With braces");
    }else{
      System.out.println("With braces");
    }
    
    if(true){
      System.out.println("With braces");
    }else{
      System.out.println("With braces");
    }
    
    /* ternary operator  */
    boolean b = true ? true : false;// boolean expression ? if the expression is true : if the expression is false
  }
}

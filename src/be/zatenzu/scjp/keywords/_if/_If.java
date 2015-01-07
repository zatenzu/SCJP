// $Id$
package be.zatenzu.scjp.keywords._if;

public class _If
{
 
  public static void main(String[] args)
  {
    if(true);//without body
    
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
    
    //awful exemple
    if(printSomething())
    if(!printSomething())
    System.out.println("HERE !");
    else
    System.out.println("THERE !");
    
    //an other one
    if(printSomething())
      if(!printSomething())
        System.out.println("HERE !");
    else
    System.out.println("THERE !");    
    //==> else goes always with the first if statement above
    
    /* ternary operator  */
    boolean b = true ? true : false;// boolean expression ? if the expression is true : if the expression is false
  }
  
  public static boolean printSomething(){
    System.out.println("AZERTY");
    return true;
  }
}

// $Id$
package be.zatenzu.scjp.string;

public class Strings
{
  int i;
  
  public static void main(String[] args)
  {
    Strings a = new Strings();
    Strings b = a;
    
    System.out.println(b.i);
    a.i = 1;
    System.out.println(b.i);
    //a and b refere to the same object
//    ============================
//    But String is immutable !!!!
//    ============================
    String f = new String("AZERTY");
    String g = f;
    
    System.out.println(g);
    f = f + "G";
    System.out.println(g);
    //f and g refere to own objet.
    //It's impossible to have two reference variables who refere to the same String!!!
    //It's impossible to change a instance of String, a new instance is create each time.
    
    /*************************************/
   /** Concatenation                   **/
  /*************************************/
    int r = 4;
    int ff = 4;
    System.out.println("String" + r + ff);
    System.out.println("String" + ( r + ff ));
    //If the left or the rigth operator is a String, + will be a String concatenation
    //If both operands are numeric, + will be an addition operator
  }
}

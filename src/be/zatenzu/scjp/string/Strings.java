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
  }
}

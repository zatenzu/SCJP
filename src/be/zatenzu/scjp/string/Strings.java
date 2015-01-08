// $Id$
package be.zatenzu.scjp.string;

public class Strings
{
  int i;
  
  public static void main(String[] args)
  {
    String myString  = "abc";//better be cause 1 object
    myString = new String("abc");
    //Create 1 String instance, give the instance to the constructor
    //and build a new instance again --> 2 objects are created.
    
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
    
    String stringR = "aze";
    stringR += "rty";//create new String, reference lost!
    System.out.println(stringR);
    
      /*************************************/
     /**  Main String methods            **/
    /*************************************/
    String mainString = "azerty";
    /** public char charAt(int index) **/
    System.out.println(mainString.charAt(2));//e
    
    /** public String concat(String s) **/
    System.out.println(mainString.concat("HoHo!"));//azertyHoHo!
    
    /** public boolean equalsIgnorCase(String s1) **/
    String mainString2 = "AZERTY";
    System.out.println(mainString.equalsIgnoreCase(mainString2));//true
    
    /** public int length() **/
    System.out.println(mainString.length());//6
    // /!\ ==> mainString.length() and myArray.length !!
    
    /** public String replace(char old, char new) **/
    System.out.println(mainString.replace('z', 'Z'));//aZerty
    
    /** public String substring(int begin) and  **/
    /** public String substring(int begin, int end) **/
    System.out.println(mainString.substring(2));//erty begin index included at the end
    System.out.println(mainString.substring(2,4));//er begin index included at the end index excluded
    
    /** public String toLowerCase() **/
    System.out.println("AZERTY".toLowerCase());//azerty
    
    /** public String toString() **/
    System.out.println(mainString.toString());//azerty
    
    /** public String toUpperCase() **/
    System.out.println(mainString.toUpperCase());//AZERTY
    
    /** public String trim() **/
    System.out.println("  a z e r t y  \n \r \t".trim());//azerty
    
    
  }
}

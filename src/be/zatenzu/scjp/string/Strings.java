// $Id$
package be.zatenzu.scjp.string;

public class Strings
{
  int i;
  
  class MyInnerClass{
    int myInnerVar = i;

    @Override
    public int hashCode()
    {
      return 1;
    }
    
  }
  
  public static void main(String[] args)
  {
    //default toString method -> package.Class@XXXX (XXXX = hashCode())
    System.out.println("Default to String:" + new Object());
    
    //Inner class package.Class.InnerClass@XXX (xxxx = hashCode of innerclass)
    System.out.println("Default to String:" + new Strings().new MyInnerClass());
    
    
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
    System.out.println(g == f);//true
    System.out.println(g);
    f = f + "G";
    System.out.println(g);
    //f and g refere to own objet.
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
    // /!\ Only leading and trailing whitespaces !
    System.out.println("  a z e r t y  \n \r \t".trim());//a z e r t y
    System.out.println("  a z e \n r t y  \n \r \t".trim());//a z e
    //rty
    
    /** public String[] split(String regex) **/
    String[] stringArray = "a2*54z*aea*zr*54*".split("\\*");
    for(String s : stringArray){
      System.out.println(s);
    }
    //see Regex package
    
    
    /** Format **/
//    System.out.printf("String to format", args);
    //%[arg_index$][flag][width][.precision]conversion char
    //arg_index = position of the argument in the string
    // Flags:
    //  - = Left justitfy this argument
    //  + = Include a sign with argument
    //  0 = Pad this argument with zero
    //  , = Use local specific grouping separators
    //  ( = Enclose negative numbers in ()
    // Width = Minimum number of char to print
    // precision = floating point precision
    // conversion:
    //    b = boolean
    //    c = char
    //    d = integer
    //    f = floating point
    //    s = string
    
    System.out.printf("%1$b | %2$c | %3$d | %4$f | %5$s", true, '#', -6, 34.4, "String");
    System.out.println("\n");
    //true | # | -6 | 34,400000 | String
    System.out.printf("%1$b | %2$c | %3$+(d | %4$+1f | %5$s", true, '#', -6, 34.4, "String");
    System.out.println("\n");
    //=> if error IllegalFormatConversionException
    //TODO: I don't understand :'(
  }
}

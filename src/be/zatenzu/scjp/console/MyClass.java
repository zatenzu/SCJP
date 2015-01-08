// $Id$
package be.zatenzu.scjp.console;

import java.io.Console;

public class MyClass
{
  public static void main(String[] args)
  {
    Console c = System.console();
//    Console c = new Console();//Forbidden !!!!
    //constructor is private!
    
    //TODO read, readline, readpassword format etc ...
    //%s = string %c = char !!!
  }
}

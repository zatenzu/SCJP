// $Id$
package be.zatenzu.scjp.console;

import java.io.Console;
import java.io.Reader;

public class MyClass
{
  public static void main(String[] args)
  {
    /** Constructor **/
//  Console c = new Console();//Forbidden !!!!
  //constructor is private!
    Console c = System.console();//ok
    
    /** format(String stringToFormat, Object args) throw IllegalFormatException **/
    /** printlf(String stringToFormat, Object args) throw IllegalFormatException **/
    //put the formated string to this console
    
    /** Reader c.reader();  **/
    Reader reader = c.reader();
    
    /** String readLine() throw IOError **/
    c.readLine();
    //read a line from console
    
    /** String readLine(String format, Object... args) throw IllegalFormatException **/
    //provided e formated prompt and reade line
    
    /** char[] readPassword() throw IOError **/
    
    /** char[] readPassword(String format, Object... args) throw IOError **/
    //provided formated prompt and read password
    
    /** PrintWriter writer() **/
    c.writer();
    
    
    //%s = string %c = char !!!
  }
}

// $Id$
package be.zatenzu.scjp.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex
{
  public static void main(String[] args)
  {
    //Pattern.compile(String pattern) throws PatternSyntaxException (Runtime exception)
    Pattern pattern = Pattern.compile("aba");
    Matcher m = pattern.matcher("abababa");
    //boolean find()//return true if found the pattern and go to the next sub sequence
    while(m.find()){
      System.out.print(m.start());//0 and 4 but not 2!
      System.out.print(m.end());//3 and 7 (return the position of the last char matched + 1)
      System.out.print(m.group());// = s.substring(m.start(), m.end());
      System.out.print("\n");
    }
    //what's append?
    //first occurence starts at 0, ends at 2 and aba
    //search for the second occurence from 3
    //second occurence starts at 4, ends at 6 and aba
    //search for the thrid occurence from 7
    
    System.out.print("========\n");
    
    //0-length matches
    Pattern pattern2 = Pattern.compile("a?");
    Matcher m2 = pattern2.matcher("aba");
    while(m2.find()){
      System.out.print(m2.start());//the char a is or not is at position 0,1,2 and 3
      System.out.print(m2.end());//1,1,3,3 ==> ?? @see page 500
      System.out.print("\n");
    }
    
    /** Expressions **/
    // \d digit
    // \s whitespace
    // \w letters, digits or _
    // [abc] searching for a, b or c
    // [a-f] searching for a letter to f lettre included
    // [A-F] searching for A letter to F lettre included
    // [a-fA-F] search for a letter to f or A letter to F lettre included
    // 0 [x-X] search for 0 followed by x or X
    /** quantifiers **/
    //? Zero or one
    //* Zero or more
    //+ One or more
//    0[x-X]+ => 0 followed by one x or one X
//    (0[x-X])+ => 0 followed by x or X one time
    
    //. = any char (whitespace is a char)
    //Escaping special char !!! . = any char, \. = compilator error, \\. = .
  }
}

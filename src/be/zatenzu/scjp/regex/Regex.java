// $Id$
package be.zatenzu.scjp.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex
{
  public static void main(String[] args)
  {
    Pattern pattern = Pattern.compile("ab");
    Matcher m = pattern.matcher("abababababa");
    while(m.find()){
      System.out.println(m.start());
    }
    
    /** Expressions **/
    // \d digit
    // \s whitespace
    // \w letters, digits or _
    // [abc] searching for a, b or c
    // [a-f] searching for a letter to f lettre included
    // [A-F] searching for A letter to F lettre included
    // [a-fA-F] search
    // 0 [x-X]
    //TODO// next
    //quantifier ?,*,+
    //. = any char
    //Escaping special char !!! . = any char, \. = compilator error, \\. = .
  }
}

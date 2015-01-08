// $Id$
package be.zatenzu.scjp.string;

public class StringBuilders
{
  public static void main(String[] args)
  {
    /** StringBuilder and StringBuffer are the same excepted StringBuilder isn't thread safe!!! **/
    //So the API is the same
    
      /*************************************/
     /**Main StringBuilder/Buffer methods**/
    /*************************************/
    StringBuilder mainString = new StringBuilder("azerty");
    
    /** public void StringBuilder append(String s) **/
    mainString.append("ui");
    System.out.println(mainString);//azertyui
    
    /** public StringBuilder delete(int start, int end)**/
    System.out.println(mainString.delete(2, 5));//azyui
    //beging index is included
    //end index is excluded
    
    /** public StringBuilder insert(int offset, String s) **/
    System.out.println(mainString.insert(3, "poiu"));//azypoiuui
    
    /** public StringBuffer reverse() **/
    System.out.println(mainString.reverse());//iuuiopyza
    
    // All methods return the reference to this object
  }
}

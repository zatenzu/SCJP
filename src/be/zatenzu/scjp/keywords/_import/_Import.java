// $Id$
package be.zatenzu.scjp.keywords._import;

/** All java.lang public classes are implicitly imported in all classes **/
import java.lang.*; // -> useless
import java.awt.color.ColorSpace; //import 1 class
import java.awt.color.*;//import package content
import static java.lang.System.*; 
/** You don't need to import classes who are in the same package!**/
import be.zatenzu.scjp.keywords._import.DontNeedToImportClass; //-> useless

public class _Import
{
  public DontNeedToImportClass dontNeedToImportClass;
  /**
   * Import statement must be located between package statement and class or interface
   */
  public static void main(String[] args)
  {
    System.out.println("Without static import");
    out.println("With static import");
  }
}

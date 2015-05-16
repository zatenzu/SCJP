// $Id$
package be.zatenzu.scjp.locale;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class LocaleClass
{
  public static void main(String[] args)
  {
    /** Constructors **/
    //Locale(String language)
    //Locale(String language, String country)
    
    /** Methodes **/
    Locale localeBE = new Locale("fr", "BE");
    Locale localeUS = new Locale("en", "US");
    
    //getDisplayLanguage()//get the name of the locale language
    System.out.println(localeBE.getDisplayLanguage());//français
    
    //getDisplayLanguage(Locale locale)////get the name of the locale language format with the locale parameter
    System.out.println(localeBE.getDisplayLanguage(localeUS));//French
    
//    getDisplayCountry()
    System.out.println(localeBE.getDisplayCountry());//Belgique
//    getDisplayCountry(Locale locale)
    System.out.println(localeBE.getDisplayCountry(localeUS));//Belgium
    
    /** With DateFormat **/
    DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeBE);
    System.out.println(df.format(new Date()));
    /** With NumberFormat **/
    double value = 3.4;
    NumberFormat nf = NumberFormat.getInstance(localeBE);
    System.out.println(nf.format(value));//3,4
    NumberFormat nnf = NumberFormat.getNumberInstance(localeBE);//getNumberInstance and getInstance are the same!
    System.out.println(nnf.format(value));//3,4 €
    NumberFormat ncf = NumberFormat.getCurrencyInstance(localeBE);
    System.out.println(ncf.format(value));//3,4 €
  }
}

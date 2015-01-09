// $Id$
package be.zatenzu.scjp.dates;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

public class Dates
{
  public static void main(String[] args)
  {
      /*************************************/
     /**  java.util.Date                 **/
    /*************************************/
    Date now = new Date();
    Date date = new Date(0L);//01/01/1970
    System.out.println(now);
    System.out.println(date);
    System.out.println(now.getTime());//get Date as milliseconds from 01/01/1970 
    
      /*************************************/
     /**  java.util.Calendar             **/
    /*************************************/ 
    Calendar cNow = Calendar.getInstance();//now
//    Calendar cNow = new Calendar();//Abstract !
    cNow.getTime();;
    cNow.roll(Calendar.DAY_OF_WEEK, 4);//add 4 days without incr weeks if needed
    cNow.roll(Calendar.DAY_OF_WEEK, 4);//add 4 days with incr weeks if needed
    
     /*************************************/
    /**  java.util.DateFormat           **/
   /*************************************/
    DateFormat df = DateFormat.getInstance();
    System.out.println(df.format(now));
    try
    {
      Date d = df.parse("9/01/15 16:35");
    }
    catch (ParseException e)
    {
      e.printStackTrace();
    }
  }
}

// $Id$
package be.zatenzu.scjp.scanner;

import java.util.Scanner;

public class ScanIn
{
  public static void main(String[] args)
  {
    
    /*************************************/
   /**  java.util.Scanner              **/
  /*************************************/
    /** Constructors **/
//    new Scanner(File f)
//    new Scanner(File source, String charsetName)
//    new Scanner(InputStream is)
//    new Scanner(InputStream is, String charsetName)
//    new Scanner(Path source)
//    new Scanner(Path source, String charsetName)
//    new Scanner(String s)

    
    /** Methodes **/
//    findInLine(String pattern)
//    findInLine(Pattern pattern)
    System.out.print("in:");
    System.out.flush();
    try{
      Scanner s = new Scanner(System.in);
      String token;
      do{
        token = s.findInLine("aba?");
        System.out.println("found:" + token);
      }while(token != null);
    }
    catch(Exception ex){
      ex.printStackTrace();
    }
    
    //hasNext();
    
    System.out.print("input:");
    System.out.flush();
    try{
//      Scanner scanner2 = new Scanner("bla blab 4 lab 5L la true 45");
      Scanner scanner2 = new Scanner("45");
      while(scanner2.hasNext()){
        System.out.println(scanner2.next());
        System.out.println(scanner2.nextInt());
        System.out.println(scanner2.nextLong());
        System.out.println(scanner2.nextBoolean());
      }
    }catch(Exception ex){ex.printStackTrace();}
    
  }
}

// $Id$
package be.zatenzu.scjp.scanner;

import java.util.Scanner;

public class ScanIn
{
  public static void main(String[] args)
  {
    //read the input line in the Console and search for 'e'
    System.out.print("input:");
    System.out.flush();
    try{
      Scanner scanner = new Scanner(System.in);
      String token;
      do{
        token = scanner.findInLine("e");
        System.out.println("found=" + token);
      }while(token != null);
    }catch(Exception ex){}
    
    System.out.print("input:");
    System.out.flush();
    try{
      Scanner scanner2 = new Scanner("My String");
      while(scanner2.hasNext()){
        System.out.println(scanner2.next());
      }
    }catch(Exception ex){}
    
  }
}

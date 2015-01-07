// $Id$
package be.zatenzu.scjp.keywords._break;

public class _Break
{
  public static void main(String[] args)
  {
    /**
     * Break is use to terminate a statement
     */
    //switch statement
    System.out.println("Switch with break");
    int i = 1;
    
    switch(i){
      case 0:
        System.out.println("Take 0 break!");
        break;
      case 1:
        System.out.println("Take 1 break!");
        break;
      case 2:
        System.out.println("Take 2 break!");
        break;
    }
    
    System.out.println("Switch without break");
    
    int j = 1;
    
    switch(j){
      case 0:
        System.out.println("Take 0 break!");
      case 1:
        System.out.println("Take 1 break!");
      case 2:
        System.out.println("Take 2 break!");
      default:
        System.out.println("Take default break!");
    }
  
    switch(j){
      case 0:{System.out.println("Take 0 break!");break;}//inside the braces
      case 1:{System.out.println("Take 1 break!");}break;//outside the braces
      case 2:{System.out.println("Take 2 break!");break;}
      default:{System.out.println("Take default break!");break;}
    }    
    
  //loop statements
  ////for, while and do while
  System.out.println("For loop with break");
  
  for(int cpt = 0; cpt < 10; cpt++){
    System.out.println("cpt=" + cpt);
  }
  
  System.out.println("For loop without break");
  
  for(int cpt = 0; cpt < 10; cpt++){
    if(cpt == 4)
      break;
    System.out.println("cpt=" + cpt);
  }
  
  //loop statements with label
  System.out.println("For loop with break and label");
  firstLoop:
  for(int cpt = 0; cpt < 2; cpt++){
    secondLoop:
    for(int cptt = 0; cptt < 3; cptt++){
      thridLoop:
      for(int cpttt = 0; cpttt < 10; cpttt++){
        if(cpttt == 4 && cptt == 2)
          break secondLoop;
        System.out.println("cpt=" + cpt + " cptt=" + cptt + " cpttt=" + cpttt);
      }
    }   
  }
}
  
}

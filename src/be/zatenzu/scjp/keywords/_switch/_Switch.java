// $Id$
package be.zatenzu.scjp.keywords._switch;

public class _Switch
{
  public static void main(String[] args)
  {
    byte b = (byte)0;
    switch(b){
      case 0:{}//with braces
        break;
      case 1://without braces
        break;
//      case 2// : is requiered!
//      break;
//      case 2:
//        break// ; is requiered!
      case 3:
        break;
//       default://isn't requiered
//        break;
    }
    
    switch(b){
      case 0:{}//with braces
        break;
      case 1://without braces
        break;
      default://default can be here!
        break;
      case 3:
        break;
    }    
    
    //Only with char,  byte, short, int and enum!!
    int i = 1;
    switch(i){
      case 0:
        break;
      case 1:
        break;
    }
    //ok
    //but
    long l = 1L;
//    switch(l){
//      case 0:
//        break;
//      case 1:
//        break;
//    }
    //long ! Forbidden long, float, double
    
    //Case value must be constant or final and compile time constant!
//    int finalInt = 4;
//    switch(i){
//      case 0:
//        break;
//      case finalInt:
//        break;
//    }
    //finalInt isn't final
    //but
    final int finalInt = 4;
    switch(i){
    case 0:
      break;
    case finalInt:
      break;
    } 
    //OK
    //but
    final int finalIntBis;
    finalIntBis = 2;
    switch(i){
    case 0:
      break;
//    case finalIntBis://Forbidden!
//      break;
    }
    //Compilator error, not a compile time constant!!
    
    /** Cannot have 2 same case statements**/
    short s  = 4;
//    switch(s){
//      case 3:
//        break;
//      case 4:
//        break;
//      case 4:
//        break;
//    }
    //Forbidden
    
    /** See also to the break keyword package !**/
  }
}

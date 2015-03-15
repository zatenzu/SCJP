// $Id$
package be.zatenzu.scjp.arrays;

public class Arrays
{
  /** Arrays are objects !!!**/
  int[] tab;
  int[] tabA[];//two dimensional array
  int tabB[];
  int[][] tabC;//two dimensional array
  int tabD[][];//two dimensional array
  int[][][] tabE;//tree dimensional array
  static float[] myTab = new float[5];
//  int[5] tabF = new int[5]; Never initialize with size at the variable type
  
  //arrays construction need always a size for the first dimension!!
  //like this
  int[] ia = new int[]{1,2,3};
  //or like this
  int[] ib = new int[3];
  //or like this
  int[] ic = {1,2,3};
  
  int[][] twoDimensionsTab = new int[2][];//size for the second dimension is not required!!!!
  
  int i = new int[]{1,2,3}[1];
  
  public static void main(String[] args)
  {
    //Array elements are always given the default value
    //myTab->[0.0,0.0,0.0,0.0,0.0]
    for(int i = 0; i < myTab.length; i++){
      System.out.println(myTab[i]); 
    }
    
    // /!\ ArrayOutOfBondsException
//    myTab size = 5
    System.out.println(myTab[5]);//Runtime exception!
    
    Mother[] motherArray = new Mother[2];
    MyInterface[] myInterfaceArray = new MyInterface[2];
    SubClass[] subClassArray = new SubClass[2];
    
    motherArray = subClassArray;//ok, subclass is a sub class of mother
    myInterfaceArray = subClassArray;//ok, subclass implements MyInterface
  }
}

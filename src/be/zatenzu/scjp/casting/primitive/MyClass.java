// $Id$
package be.zatenzu.scjp.casting.primitive;

public class MyClass
{
  public static void main(String[] args)
  {
    /** implicit casting **/
    //We put a smaller value in a bigger or the same container.
    int i = 1;
    long l = i;//implicit because a int value fits always in a long container.
    
    long ll = 3l;
    double db = ll;//double container can contain any long value.
    
    // /!\ It doesn't work with array!
//    long[] myTab = new int[2];
    
    /** explicit casting **/
    //We put a bigger value in a smaller container.
    //It means, possible error when you do that, do casting yourself!
    long lll = 2l;
    int iii = (int)lll;// need explicit casting
    
    double ddb = 2345.23432;
    long lllll = (long)ddb;// need explicit casting
    
    float f = 100.1f;
    int fi = (int)f;//could loss information -> explicit casting
    
    //default floating values are double
    int fpValue = (int)3842.2591;//double to int -> explicit casting
    //legal but all values after . are lost
    
    long l9 = 3999999999999994L;
    byte b9 = (byte)l9;
    //   /!\ No runtime error, values after 8 bits are simply lost
    
    float flooooat = 45.45f;
    short s = (short) flooooat;
    System.out.println(s);
    //legal but all values after . are lost
    
    byte maximum = 127;
    byte moreAsMax = (byte)128;//legal with casting
    System.out.println(moreAsMax);//-->result is -128

    // /!\ It doesn't work with array!
    //Arrays are objects!!!
//    long[] myTaba = (long[])new int[2];
    
    /** expressions **/
    //expression with int or smaller than an int reslting always on in an integer.
    int ia = 1;
    int ib = 2;
    long ic = ia + ib;
    //expression result is int, put int in long, no probleme, implicit casting
    
    
    byte ba = 1;
    byte bb = 2;
    //byte bc = ba + bb; //compiler error
    
    //byte is smaller than int, but byte expression result in an integer
    //so, we put bigger in a smaller container -> explicit casting!
    byte bc = (byte) (ba + bb);//() around expression are required
    
    /** compound assignment **/
    //all compound assignments can be used with implicit casting!
    // +=, -=, *=, /=
    byte b = 3;
    b = (byte) (b + 7);//result is int -> explicit casting
    //but
    byte bbb = 3;
    bbb += 7;//implicit casting!!
  }
}

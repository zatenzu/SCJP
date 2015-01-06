// $Id$
package be.zatenzu.scjp.wrapper;

public class Wrapper
{
  public static void main(String[] args)
  { 
    //primitive -> Primitive(Wrapper class) -> Primitive(primitive) ou Primitive("primitive")
    //exemple:
    int i = 0;//primitive
    Integer wrapper;//Primitive (Wrapper)
    new Integer(i);//constructor with primitive
    new Integer("0");//constructor with String
    
    //exception -> Char doesn't have String constructor!
//    Character c = new Character("String");
    //exception Double has a float constructor
    Double d = new Double(34.0f);
    
    //=> No default constructor
//    Integer g = new Integer();//doesn't exist!!
    
    //String contructor can throw NumberFormatException!!
    
    /** WRAPPER OBJECTS ARE IMMUTABLE !!! **/
    System.out.println("=======IMMUTABLE=======");
    Integer myIntWrapper = new Integer(1234);
    Integer myIntWrapperBis = myIntWrapper;
    System.out.println(myIntWrapperBis);
    myIntWrapper += 2;
    System.out.println(myIntWrapperBis);
    
    //other exemple
    myIntWrapper = new Integer(1234);
    myIntWrapperBis = myIntWrapper;
    System.out.println(myIntWrapper == myIntWrapperBis);//true, it's the same object
    myIntWrapperBis ++;
    System.out.println(myIntWrapper == myIntWrapperBis);//false!!!
    //because myIntWrapperBis ++ --> unwrap it, increment it and rewrap it (new instance).
    System.out.println("=======   =======");
    
    //equals() method compare the primitive value of the wrapper object
    
    /** unwrapping a null wrapper object never return the default value of the primitive!!! **/
    
    //==
    Integer integer1 = 128;
    Integer integer2 = 128;
    System.out.println(integer1 == integer2);//false!
    //Wrapper == Wrappper compare the reference not the primitive value!!
    Integer i9 = 10;
    Integer i8 = 10;
    System.out.println(i9 == i8);//true!
    //Because == return always true for primitive values who are the same if:
    // - they are boolean
    // - they are Byte
    // - they are Character from \u0000 to \u007f (0 to 127)
    // - they are Short or Integer from -128 to 127
    // ===> BIG TRAP!
    
    /** Wrapper methods **/    

    //valueOf
    ////radix parameter define the 'base' 2 = binary 010101
    
////    Boolean has valueOf(String s) and valueOf(Boolean b)
    Boolean.valueOf("true");
    Boolean.valueOf(false);
    
////    Byte has valueOf(Byte byte),valueOf(String s) and valueOf(String s, int radix)
    Byte.valueOf((byte)2);
    Byte.valueOf("2");
    Byte.valueOf("01", 2);
    
////    Character has valueOf(char c)
    Character.valueOf('c');

////    Double has valueOf(double d) and valueOf(String s)
    Double.valueOf(34.34);
    Double.valueOf("34.34");
    
////    Float has valueOf(String s) and valueOf(float f)
    Float.valueOf(34.34f);
    Float.valueOf("34.34f");
    
////    Integer has valueOf(int i) ,valueOf(String string) and valueOf(String s,int radix)
    Integer.valueOf(2);
    Integer.valueOf("2");
    Integer.valueOf("01", 2);
    
////    Long has valueOf(String), valueOf(Long long) and valueOf(String s,int radix)
    Long.valueOf(2L);
    Long.valueOf("2");//valueOf("2L") OMG!//Forbidden !!!! --> NumberFormatException
    Long.valueOf("01", 2);
    
////    Short has valueOf(String), valueOf(Short short) and valueOf(String s,int radix)
    Short.valueOf((short)2);
    Short.valueOf("2");
    Short.valueOf("01", 2);
    
    
    //xxxValue()
    ////Boolean has booleanValue() method
    Boolean b = true;
    b.booleanValue();
    
    ////Byte has byte,double,float,int,long and shortValue() methods
    Byte byt = new Byte("1");
    byt.byteValue();
    byt.doubleValue();
    byt.floatValue();
    byt.intValue();
    byt.longValue();
    byt.shortValue();
    
    ////Character has charValue()
    Character cha = new Character('C');
    cha.charValue();
    
    ////Double has byte,double,float,int,long and shortValue() methods
    Double dd = new Double(34.34);
    dd.byteValue();
    dd.doubleValue();
    dd.floatValue();
    dd.intValue();
    dd.longValue();
    dd.shortValue();
    
    ////Float has byte,double,float,int,long and shortValue() methods
    Float floa = new Float(34.34f);
    floa.byteValue();
    floa.doubleValue();
    floa.floatValue();
    floa.intValue();
    floa.longValue();
    floa.shortValue();
    
    ////Integer has byte,double,float,int,long and shortValue() methods
    Integer intege = new Integer(2);
    intege.byteValue();
    intege.doubleValue();
    intege.floatValue();
    intege.intValue();
    intege.longValue();
    intege.shortValue();
    
    ////Long has byte,double,float,int,long and shortValue() methods
    Long Lng = new Long(2);
    Lng.byteValue();
    Lng.doubleValue();
    Lng.floatValue();
    Lng.intValue();
    Lng.longValue();
    Lng.shortValue();
    
    ////Short has byte,double,float,int,long and shortValue() methods
    Short shrt = new Short((short)2);
    shrt.byteValue();
    shrt.doubleValue();
    shrt.floatValue();
    shrt.intValue();
    shrt.longValue();
    shrt.shortValue();
    
    ////All numeric type have byte,double,float,int,long and shortValue() methods
    ////boolean and char has only primitiveValue() method
    
    //parseXxx() and valueOf()
    //toString()
    /** See table at page 243 **/
  }
}

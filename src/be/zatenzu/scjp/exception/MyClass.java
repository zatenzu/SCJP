// $Id$
package be.zatenzu.scjp.exception;


public class MyClass
{
  /** See also try, catch, finally, throw and throws keywords **/
  //all error, exception, runtimeexception and throwable can be catch or throw
  
  public static void main(String[] args)
  {
    /** All Exceptions must be handle or declared by throws clause excepted RunTimeException! **/
    try{
      throwException();
      throwRuntimeException();
      throwError();
    }
    catch(MyRuntimeException mex){}//legal but unneeded
    catch(MyError err){}//legal but unneeded
    catch(MyException ex){//catch MyException is requiered
    }
    
    
//    catchMethod();// Compilator error!
    //catchMothd catch MyException but declare throws MyException, so you need to catch it
    
  }
  
  public static void throwRuntimeException() throws MyRuntimeException{//no catch and no throws!
    throw new MyRuntimeException();//RuntimeException can be throw
  }
  public static void throwException() throws MyException{ //throws MyException is needed because it isn't handled
    throw new MyException();
  }
  public static void throwError() throws MyError{ //throws MyError is useless because it is an Error
    throw new MyError();//error can be throw
  }
  public static void catchMethod() throws MyException
  {
    try{
      throwException(); 
    }catch(MyException mex){
      
    }
  }
}

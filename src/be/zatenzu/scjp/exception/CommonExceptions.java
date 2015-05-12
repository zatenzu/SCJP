// $Id$
package be.zatenzu.scjp.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CommonExceptions
{
  public static void main(String[] args)
  {
    //Error
    AssertionError assertionError;
    ExceptionInInitializerError exceptionInInitializerError;
    StackOverflowError stackOverflowError;
    //If the infinit loop doesn't put elements on the stack(local var, call method), the applcation never end
    //but no stackoverflowerror will throw.
    NoClassDefFoundError noClassDefFoundError;
    
    //Runtime
    ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException;
    ClassCastException castException;
    IllegalArgumentException argumentException;
    IllegalStateException illegalStateException;
    NullPointerException nullPointerException;
    NumberFormatException formatException;//sub classe of IllegalArgumentException 
    
    //! RuntimeException
    IOException ioException;
    FileNotFoundException fileNotFoundException;
  }
}
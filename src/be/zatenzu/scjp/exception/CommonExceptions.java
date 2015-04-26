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
    NoClassDefFoundError noClassDefFoundError;
    
    //Runtime
    ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException;
    ClassCastException castException;
    IllegalArgumentException argumentException;
    IllegalStateException illegalStateException;
    NullPointerException nullPointerException;
    NumberFormatException formatException;
    
    //! RuntimeException
    IOException ioException;
    FileNotFoundException fileNotFoundException;
  }
}
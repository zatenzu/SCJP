// $Id$
package be.zatenzu.scjp.keywords._volatile;

public class _Volatile
{
  public volatile Integer i;
  /**
  Declaring a volatile Java variable means:

    The value of this variable will never be cached thread-locally: all reads and writes will go straight to "main memory";
    Access to the variable acts as though it is enclosed in a synchronized block, synchronized on itself.
    **/ 
}

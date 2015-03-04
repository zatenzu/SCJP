// $Id$
package be.zatenzu.scjp.collections;

public class MySortedClass2 implements Comparable<MySortedClass2>
{

  //if implements Comparable is typed, then compareTo(T o)
  @Override
  public int compareTo(MySortedClass2 o)
  {
    // < 0 --> lower as
    // 0 --> same as
    // > 0 --> higher as
    return 0;
  }
  
}

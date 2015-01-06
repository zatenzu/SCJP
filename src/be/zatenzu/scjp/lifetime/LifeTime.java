// $Id$
package be.zatenzu.scjp.lifetime;

public class LifeTime
{
  static int a = 1;//static variable (class variable)
  int b = 1;//instance variable
  {
    int c = 1;//block variable
  }
  
  public static void main(String[] args)
  {
    for(int i = 0; i<10;i++){//i = block code
      int f = i;//loop variable
    }
    
    int k;
//    System.out.println(k);//compilator error
    //LOCAL variable must be initilized if you use it!
    
    Object o;
//    System.out.println(k);//compilator error
    //LOCAL refrence variable must be initilized if you use it!
    //Object o = null; -> ok
    
    /*
     * static variable still alive as long as the class is loaded in theJVM
     * instance variable still alive as long as the instance is in the heap
     * block variable still alive at the end of the block code
     * loop variable still alive at the end of the loop
     */
    
    MyClass myClass = new MyClass();
    int iiii = 1;
    
    System.out.println("Before myMethod:" + myClass.getMyVar() + " and " + iiii);
    myMethod(myClass, iiii);
    System.out.println("Before myMethod:" + myClass.getMyVar() + " and " + iiii);
  }
  
  /** Method parameters are always a copy! **/
  public static void myMethod(MyClass c, int i){
    //c is a copy of the refrence variable
    //so c is not the same variable as myClass but they refere to the same instance of MyClass
    //i is a copy of iiii
    
    /** These copies still alive until the end of the block!! **/
    i = i + 5;
    c.setMyVar(2);
    c = new MyClass();
  }
  
}

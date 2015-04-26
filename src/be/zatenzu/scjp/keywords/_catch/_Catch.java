// $Id$
package be.zatenzu.scjp.keywords._catch;


public class _Catch
{
  /**
   * nothing special, see Chapter 5 for exception management
   */
  //See try and finally keywords
  //all error, exception, runtimeexception and throwable can be catch
  
  public static void main(String[] args)
  {
    try{
      if(1 < 0){//I know, it's stupid
        throw new MotherException(); 
      }else{
        throw new SubClassException(); 
      }
    }
    catch(MotherException ex){}
//    catch(SubClassException fex){}//Forbidden, compiler error!
    //SubClassException already catch by the MothException catch block
    
    /**=> if you add catch block with exception that could be never thrown -> Compilator error**/
  }
}

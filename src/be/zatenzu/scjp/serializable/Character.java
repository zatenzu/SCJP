// $Id$
package be.zatenzu.scjp.serializable;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Character extends MyNonSerializableSuperClass implements Serializable
{
  enum CharacterState{TIRED, NORMAL, EXCITED}
  
  public int level;
  protected String nom;
  private int pv;
  int pvMax;
  public String specialType;
  List<InventoryObject> objects;
  private transient CharacterState state;
  public transient int x = 42;// ! transient 
  public static int characterCounter = 0;//will not be serialized because it's a part of the class, not the instance object!
  
  public Character(int level, String nom, int pv, int pvMax, String specialType, CharacterState state){
    this.level = 1;
    this.nom = nom;
    this.pv = pvMax;
    this.pvMax = pvMax;
    this.specialType = null;
    this.objects = new ArrayList<InventoryObject>();
    this.state = state;
    characterCounter ++;
  }
  
  public void addObject(InventoryObject object){
    this.objects.add(object);
  }

  @Override
  public String toString()
  {
    String s = "[" + this.nom + "- Level:" + this.level + " -" + "]\n";
    s+= "State:" + this.state + " <" + pv + "/" + this.pvMax + ">\n";
    s+= this.specialType + "\n";
    s+= "----- Equipment -----\n";
    for(InventoryObject o : this.objects){
      s+=  "-" + o.toString() + "\n";
    }
    s+= "x=" + this.x + "\n";
    s+= this.field + "\n";
    s+= characterCounter;
    return s;
  }
  
  /** writeObject and readObject **/
  //If you want to do some stuff during the serializable process you can with these methodes
  //The method signature must be like that!
  //access modifier, return type, method name and parameter type must be like this.
  //You can modifiy the name of the parameter and throw exception if you want but that's all.
  private void writeObject(ObjectOutputStream oos){
    try{
      System.out.println("WRITE");
      oos.defaultWriteObject();//do the default writing process
      oos.writeInt(CharacterState.TIRED.ordinal());
    }
    catch(IOException ioex){ioex.printStackTrace();}
  }
  
  private void readObject(ObjectInputStream ois){
    try{
      System.out.println("READ");
      ois.defaultReadObject();//do the default reading process
      int state = ois.readInt();
      this.state = CharacterState.values()[state];
    }
    catch(IOException ioex){ioex.printStackTrace();}
    catch(ClassNotFoundException cnfe){cnfe.printStackTrace();}
  }
  
  /** IF YOU DO defaultWriteObject before to write something else,
   * you must do the defaultReadObject before to read something else!!!
   * ==> java.io.StreamCorruptedException !
   */
  
  /** defaultWriteObject and defaultReadObject must be called in respectively writeObject and readObject **/
}

// $Id$
package be.zatenzu.scjp.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files
{
  
  public static void main(String[] args)
  {
      /*************************************/
     /**  File                           **/
    /*************************************/  
    File file = new File("deleteMe.txt");//this file doesn't exist yet
    
    /** public boolean exists() **/
    //return true if it finds the actual file
    
    /** public boolean createNewFile() **/
    //return true if the file is created
    
    /** public boolean delete() **/
    //delete the file and return true if the file is deleted
    
    /** public boolean isDirectory() **/
    //return true if the file is a directory
    
    /** public boolean isFile() **/
    //return true if the file is a file and not a directory
    
    /** public String[] list() **/
    //return a String array with names of file and directory
    
    /** public boolean mkdir() **/
    //create the directory and return true if it's created
    
    /** public boolean mkdirs() **/
    //create the directory and parents directories if needed and return true if the directory is created
    
    /** public boolean renameTo(File f) **/
    //rename the file to f and return true if it's done
    
      /*************************************/
     /**  FileWriter/Reader              **/
    /*************************************/
    FileWriter fw;
    char[] in = new char[50];
    try{
      fw = new FileWriter(file);//create the file on the disk!
      fw.write("Hello!\n How are you?\n");//write two line in the file
      fw.flush();//flush to make sure that all char are in the file before closing
      fw.close();//close stream
      FileReader fr = new FileReader(file);
      fr.read(in);//read file content to the char array
      fr.close();//close stream
    }
    catch(IOException ioe){}
    
    /** public void close() **/
    //close the stream
    
    /** public void write() **/
    
    /** public int read(char[] array) **/
    //read the file, put content to the array and return the number of read char
    
    /*************************************/
   /**  BufferredWriter                **/
  /*************************************/
    /** public void newLine() **/
    //write a line seperator

    /*************************************/
   /**  PrintWriter                    **/
  /*************************************/
    /** printf **/ //TODO
    /** format **/ //TODO
    
    /*************************************/
   /**  BufferredReader                **/
  /*************************************/
    /** public String readLine() **/
    //read to the end line caracter and return a String with the content
    
    /** See Table page 450 for constructors!!! **/
  }
}

// $Id$
package be.zatenzu.scjp.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.CharBuffer;

import com.sun.istack.internal.FragmentContentHandler;

public class Files
{
  
  public static void main(String[] args)
  {
      /*************************************/
     /**  File                           **/
    /*************************************/ 
    /** Constructors **/
    //new File(String path) throw NPE
    //new File(String parentPathnameString, String childPathnameString) throw NPE
    //new File(File parentAbstractPathnameString, String childPathnameString) throw NPE
    //new File(URI uri) throw NPE and IllegalArgumentException
    File file = new File("deleteMe.txt");//this file doesn't exist yet
    
    /** public boolean exists() **/
    file.exists();//can throw SecurityException(RuntimeException)
    //return true if it finds the actual file
    
    /** public boolean createNewFile() **/
    try
    {
      file.createNewFile();//can throw SecurityException(RuntimeException)
    }
    catch (IOException e)
    {}
    //return true if the file is created
    
    /** public boolean delete() **/
    file.delete();//can throw SecurityException(RuntimeException)
    //delete the file and return true if the file is deleted
    
    /** public boolean isDirectory() **/
    file.isDirectory();//can throw SecurityException(RuntimeException)
    //return true if the file is a directory
    
    /** public boolean isFile() **/
    file.isFile();//can throw SecurityException(RuntimeException)
    //return true if the file is a file and not a directory
    
    /** public String[] list() **/
    file.list();//can throw SecurityException(RuntimeException)
    //return a String array with names of file and directory in this directory
    
    /** public boolean mkdir() **/
    file.mkdir();//can throw SecurityException(RuntimeException)
    //create the directory and return true if it's created
    
    /** public boolean mkdirs() **/
    file.mkdirs();//can throw SecurityException(RuntimeException)
    //create the directory and parents directories if needed and return true if the directory is created
    
    /** public boolean renameTo(File f) **/
    file.renameTo(file);//can throw SecurityException(RuntimeException) and NPE
    //rename the file to f and return true if it's done
    
      /*************************************/
     /**  FileWriter/Reader              **/
    /*************************************/
    FileWriter fw;
    FileReader fr;
    char[] in = new char[50];
    try{
      fw = new FileWriter(file);//create the file on the disk!
      fw.write("Hello!\n How are you?\n");//write two line in the file
      fw.flush();//flush to make sure that all char are in the file before closing
      fw.close();//close stream
      fr = new FileReader(file);
      fr.read(in);//read file content to the char array
      fr.close();//close stream
    }
    catch(IOException ioe){}
    
    /** Constructors **/
//    new FileWriter(File file); throw IOException
//    new FileWriter(File file, boolean append); throw IOException
//    new FileWriter(String filename); throw IOException
//    new FileWriter(String filename, boolean append); throw IOException
//    new FileWriter(FileDescriptor fileDescriptor);
    
//    new FileReader(File file) throw FileNotFoundException ( extends IOException)
//    new FileReader(FileDescriptor)
//    new FileReader(String fileName) throw FileNotFoundException ( extends IOException)
    
    /** public void close() throw IOException **/
    //close the stream
    
    /** public void write() throw IOException **/
//    fw.write(char[] charBuffer);
//    fw.write(int c);
//    fw.write(String str);
//    fw.write(char[] charBuffer, int off, int len);
//    off=position to start, len number of char to write
//    fw.write(String charBuffer, int off, int len);
    
    /** public void flush() throw IOException**/
//    fw.flush();
    
    /** public int read(char[] array) **/
//    fr.read();//return the char read or -1
//    fr.read(char[] cBuf)//return number of char read or -1
//    fr.read(CharBuffer target)//return number of char read or -1
//    fr.read(char[] cbuf, int off, int len)

    //read the file, put content to the array and return the number of read char
    
    /*************************************/
   /**  BufferedWriter/BufferedReader **/
  /*************************************/
    /** Constructors **/
//    new BufferWriter(Writer w)
//    new BufferWriter(Writer w, int outBufferSize) throw IllegalArgumentException(Runtime) if int < = 0
//    new BufferedReader(Reader r)
//    new BufferedReader(Reader r, int inBufferSize) throw IllegalArgumentException(Runtime) if int < = 0
    
    /** public void newLine() **/
//    bw.newLine();//writes new line separator. Can throw IOException
    
    /** public String readLine() throw IOException**/
//    br.readLine()
    
    //read a line

    /*************************************/
   /**  PrintWriter                    **/
  /*************************************/
    /** Constructors **/
//    PrintWriter pw = new PrintWriter(File file);//FileNotFoundException, SecurityException
//    PrintWriter pw = new PrintWriter(OutputStream out)
//    PrintWriter pw = new PrintWriter(String fileName) FileNotFoundException, Security
//    PrintWriter pw = new PrintWriter(Writer out)
//    PrintWriter pw = new PrintWriter(File f, String charSet) FileNotFoundException, Security
//    PrintWriter pw = new PrintWriter(String fileName f, String charSet) FileNotFoundException, Security
//    PrintWriter pw = new PrintWriter(OutputStream out, boolean autoFlush)
//    PrintWriter pw = new PrintWriter(Writer w, boolean autoFlush)
    
    /** public PrintWriter printf **/
//    PrintWriter pw = new PrintWriter(new File("blablba"));
//    pw.printf(String format, Object... args); IllegalArgumentException and NPE if format is null
//    pw.printf(Local local, String format, Object... args) IllegalArgumentException and NPE if format is null
    /** public PrintWriter format **/
//    pw.format(String format, Object... args) IllegalArgumentException and NPE if format is null
//    pw.format(Local l, String format, Object... args) IllegalArgumentException and NPE if format is null
    /** printf and format are the same! **/
  }
}

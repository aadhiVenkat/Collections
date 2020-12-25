package File_Cocepts;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.*;

public class filecopy 
{
 public static void main(String[] args)
 {
	 int ch;
	 String file1="adi2.jpg";
	 try(FileInputStream fr=new FileInputStream(file1);
		 FileOutputStream fw=new FileOutputStream("adi4.jpg"))
	 {
		 while((ch=fr.read())!=-1)
		 {
			fw.write(ch); 
		 }
	 } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 System.out.println("File Copied");
	 /*File f=new File("adi2.gif");
	 f.delete();*/
	 
 }
}

package File_Cocepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class read {
 public static void main(String[] args) 
 {
	File f=new File("adi.txt");
	FileReader f1 = null;
	try 
	{
		f1 = new FileReader(f);
		int ch = 0;
		ch = f1.read();
		while(ch!=-1)
		{
			System.out.print((char)ch);
			ch=f1.read();
		}
	}catch (FileNotFoundException e1) 
	{e1.printStackTrace();}
	catch (IOException e) {
		e.printStackTrace();
	}
	//f1.close();
 }
}

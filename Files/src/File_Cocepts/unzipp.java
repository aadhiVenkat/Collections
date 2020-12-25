package File_Cocepts;

import java.io.*;
import java.util.zip.InflaterInputStream;

public class unzipp 
{
	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("new");
			FileOutputStream fos=new FileOutputStream("new1.txt");
				InflaterInputStream iis=new InflaterInputStream(fis))
		{
			int data;
			while((data=iis.read())!=-1)
				fos.write(data);
		}
		catch(IOException e)
		{
			
		}
      System.out.println("Unzipping Completed");
		
	}

}

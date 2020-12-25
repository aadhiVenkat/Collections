package File_Cocepts;

import java.io.*;
import java.util.zip.DeflaterOutputStream;

public class fileZipping {

	public static void main(String[] args) 
	{
		try(FileInputStream fis=new FileInputStream("adi.txt");
			FileOutputStream fos=new FileOutputStream("new");
				DeflaterOutputStream dos=new DeflaterOutputStream(fos))
		{
			int data;
			while((data=fis.read())!=-1)
				dos.write(data);
		}
		catch(IOException e)
		{
			
		}
      System.out.println("zipping Completed");
	}

}

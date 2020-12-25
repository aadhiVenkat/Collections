package File_Cocepts;

import java.io.File;
import java.io.IOException;

public class creatingDocument 
{
	public static void main(String[] args) 
	{
		File f1=new File("adi.txt");
		
		try {
			boolean result=f1.createNewFile();
			System.out.println(result);
		} 
		catch (IOException e) {
			System.out.println("Document Not Created");
		}
	
	}
}

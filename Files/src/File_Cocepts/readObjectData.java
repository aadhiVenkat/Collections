package File_Cocepts;

import java.io.*;

public class readObjectData
{
	public static void main(String[] args)
	{
		try(FileInputStream fis=new FileInputStream("example.ser");
			ObjectInputStream ois=new ObjectInputStream(fis))
		{
			employee e;
			try {
				while((e=(employee)ois.readObject())!=null)
				{
					//e.displayData();
					System.out.println(e);
				}
			} 
			catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}			
		}
		catch(IOException e)
		{
			
		}
		
	}
}

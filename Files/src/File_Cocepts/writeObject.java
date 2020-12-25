package File_Cocepts;

import java.io.*;
import java.util.Scanner;

public class writeObject {

	public static void main(String[] args)
	{		
		try(Scanner sc=new Scanner(System.in);
			FileOutputStream fos=new FileOutputStream("example.ser");
			ObjectOutputStream oos=new ObjectOutputStream(fos))
		{
			System.out.println("How Many Employee?");
			int n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				employee e=new employee();
				e.getData();
				oos.writeObject(e);
			}
			
		}
		catch(IOException e)
		{	
		}
		System.out.println("Object data Stored Succefully");
	}

}

package File_Cocepts;

import java.io.Serializable;
import java.util.Scanner;

public class employee implements Serializable
{
	int id;
	String name;
	transient double salary=250000;
	void getData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee id:");
		id=sc.nextInt();
		System.out.println("Enter the employee Name");
		name=sc.next();
		System.out.println("Enter the Salary");
		salary=sc.nextDouble();		
	}

	void displayData()
	{
		System.out.println(id+" "+name);
	}
	
}

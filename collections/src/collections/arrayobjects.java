package collections;

import java.util.Scanner;

class employee
{
	int id;
	String name;
	employee(int i, String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println("id"+id+"\tName"+name);
	}
}
public class arrayobjects
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		employee data[]=new employee[5];
		int id;
		String name;
		for(int i=0;i<5;i++)
		{
			System.out.println("enter id");
			id=sc.nextInt();
			System.out.println("enter name");
			name=sc.next();
			data[i]=new employee(id,name);			
		}
		System.out.println("Employees Data");
		data[0].id=50;
		for(int i=0;i<5;i++)
			data[i].display();
       sc.close();
	}

}

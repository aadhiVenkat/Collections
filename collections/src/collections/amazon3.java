package collections;

import java.util.Scanner;

public class amazon3 {
	public static int number(int input1,int input2,int input3)
	{
		int d=0;
		if(input1>input2)
			d=input1-input2;
		else
			d=input2-input1;
		return (input1-d)+(input3-1)*d;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		System.out.println(number(input1,input2,input3));
	}

}

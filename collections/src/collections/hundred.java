package collections;

import java.util.Arrays;
import java.util.Scanner;

public class hundred 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] array=new int[0];
		int[] number=new int[0];
		int i=0;
		while(true)
		{
			int c;
			if((c=sc.nextInt())<0)
				break;
			number[0]=c;
			array=Arrays.copyOf(number,++i);
		}
	}

}

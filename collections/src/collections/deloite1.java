package collections;

import java.util.Scanner;

public class deloite1 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		int number=sc.nextInt(),max=0,rem=0;
		while(number>0)
		{
			rem=number%10;
			if(rem>max)
				max=rem;
			number=number/10;
		}
		System.out.println(max);
		sc.close();
	}
}

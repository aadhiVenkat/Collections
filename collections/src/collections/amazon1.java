package collections;

import java.util.Scanner;

public class amazon1
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2[]=new int[input1];
		int sum=0,max=0;
		for(int i=0;i<input1;i++)
		{
			input2[i]=sc.nextInt();
			sum=sum+input2[i];
		}
		max=sum;
		if(sum<0)
		{
			for(int i=0;i<input1-1;i++)
			{
				if(input2[i]<input2[i+1])
					max=input2[i+1];					
			}			
		}
		else
		{
			for(int i=0;i<input1;i++)
			{
				if(sum<input2[i])
					max=input2[i];
			}
		}					
		
		System.out.println(max);
		
	}

}

package org.sorting;

import java.util.Scanner;

public class newtons {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int B[]=new int[N];
		int temp=1;
		for(int i=0;i<N;i++)
			B[i]=sc.nextInt();
		for(int i=1;i<N;i++)
		{
			if(B[0]==B[i])
				temp++;				
		}
		int count=0;
		if(temp==N)
			System.out.println(2);
		else
		{
			for(int i=0;i<B.length;i++)
			{
				for(int j=i+1;j<B.length;j++)
				{
					if(B[i]>B[j])
					{
						int tem=B[i];
						B[i]=B[j];
						B[j]=tem;
					}
				}
			}
			for(int i=0;i<B.length-1;i++)
			{
				int sum=0;
				for(int j=i+1;j<B.length;j++)
					sum=sum+B[j];
				if(B[i]<sum)
					count++;
			}
			System.out.println(count);
		}
	}

}

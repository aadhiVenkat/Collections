package org.sorting;

import java.util.Scanner;

public class xordemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int value=0,temp=0001;
		if(1<=n && n<=1000000000)
		{
			for(int i=2;i<=n;i++)
				temp=temp^i;
			if(temp%2==0)
				System.out.println("even");
			else
				System.out.println("Odd");
		}
	}

}

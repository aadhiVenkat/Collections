package collections;

import java.util.Scanner;

public class thinkative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==0 || i==j)
					System.out.print(1);
				else if(i-j==j)
				{
						temp=temp+i;
						System.out.print(temp);
				}
				else
					System.out.print(i);
			}
			System.out.println();
		}
	}

}

package collections;

import java.util.Scanner;

public class deliote2 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int numOfClients=sc.nextInt();
		if(0<=numOfClients && numOfClients<=1000000)
		{
			int orderId[]=new int[numOfClients];
			for(int i=0;i<numOfClients;i++)
			{
				if(0<=i && i<=numOfClients)
					orderId[i]=sc.nextInt();
			}
			
			for(int i=0;i<numOfClients;i++)
			{
				if(0<=orderId[i] && orderId[i]<1000000)
				{
					int sum=0,rem=0,num=orderId[i];
					while(num>0)
					{
						rem=num%10;
						sum=sum+rem;
						num=num/10;
					}
					System.out.print(sum+" ");
				}
			}
				
		}

	}

}

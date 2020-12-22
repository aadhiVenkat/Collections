package collections;

import java.util.Scanner;

public class deloitte5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numOfProducts=sc.nextInt();
		char productID[]=new char[numOfProducts];
		if(0<=numOfProducts && numOfProducts<=1000000)
		{
			for(int i=0;i<numOfProducts;i++)
				productID[i]=sc.next().charAt(0);
			int count=0;
			for(int i=0;i<numOfProducts;i++)
			{
				if(productID[i]!='a' && productID[i]!='e' &&
				  productID[i]!='i' && productID[i]!='o' &&
				  productID[i]!='u' && productID[i]!='A' &&
				  productID[i]!='E' && productID[i]!='I' &&
				  productID[i]!='O' && productID[i]!='U')
				{
					count=count+1;
				}
			}
			System.out.println(count);
		}
		
	}

}

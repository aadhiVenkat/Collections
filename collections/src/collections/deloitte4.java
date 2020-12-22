package collections;

import java.util.Scanner;

public class deloitte4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numOfProducts=sc.nextInt();
		int disAmount=sc.nextInt();
		int[] order=new int[numOfProducts];
		if(0<=numOfProducts && numOfProducts<=100000 && 0<=disAmount && disAmount<=100000)
		{
			for(int i=0;i<numOfProducts;i++)
			{
				if(0<=i && i<=numOfProducts)
				{
					int temp=sc.nextInt();
					if(-1000000<=temp && temp<=1000000)
						order[i]=temp;
				}
			}
			int count=0;
			for(int i=0;i<numOfProducts;i++) {
				if((disAmount%order[i])==0)
					count=count+1;						
			}
			System.out.print(count);
		}
		
	}

}

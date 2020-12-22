package collections;

import java.util.Scanner;



public class cordis {
	static void MyFun(int a[],int len)
	{
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}			
		}
		System.out.println("Second Smallest: "+a[1]);
		System.out.println("Second Largest: "+a[len-2]);
		
	}
	public static void main(String[] args) {
		 int a[]= {5,8,7,6,9,2,4,1,3,10};
		 int len=10;
		 cordis.MyFun(a,len);
	
	}

}

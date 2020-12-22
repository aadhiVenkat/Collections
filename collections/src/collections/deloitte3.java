package collections;

import java.util.Scanner;

public class deloitte3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int start=sc.nextInt();
		int end=sc.nextInt();
		int[] list=new int[num];
		for(int i=0;i<num;i++)
			list[i]=sc.nextInt();
		for(int i=0;i<num;i++)
		{
			if(list[i]>=start && list[i]<=end)
				System.out.print(list[i]+" ");
		}

	}

}

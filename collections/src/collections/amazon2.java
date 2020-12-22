package collections;

import java.util.Scanner;

public class amazon2 {
	private int Cuckoo_Sequence(int input1) {
		int Cukoo[]=new int[input1+1];
		Cukoo[1]=0;
		Cukoo[2]=1;
		if(input1==1)
			return 0;
		else if(input1==2)
			return 1;
		else
		{
			for(int i=3;i<=input1;i++)
				Cukoo[i]=(1*Cukoo[i-1])+(2*Cukoo[i-2])+(3*1);
			return Cukoo[input1];	
		}		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		amazon2 a=new amazon2();
		System.out.print(a.Cuckoo_Sequence(n));
	}

	

}

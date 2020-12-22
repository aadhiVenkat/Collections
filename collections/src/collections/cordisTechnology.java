package collections;

import java.util.Scanner;

public class cordisTechnology {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Number=sc.nextInt();
		int divisionValue=Number/5;
		boolean result=true;
		if(Number%5==1)
			result=true;
		else if(divisionValue%2==0)
			result=true;
		else
			result=false;
		if(result)
			System.out.println("PASSED");
		else
			System.out.println("FAILED");
		}	
	}



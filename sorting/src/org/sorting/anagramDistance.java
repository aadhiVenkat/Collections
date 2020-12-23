package org.sorting;

import java.util.Scanner;

public class anagramDistance {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	sc.close();
	str=str.toLowerCase();
	int count=1,len=str.length();
	for(int i=1;i<len;i++)		
	{
		if(str.charAt(0)==str.charAt(i))
			count++;
	}
	if(count%len!=0)
		System.out.println(len);
	else
		System.out.println(0);
}


}

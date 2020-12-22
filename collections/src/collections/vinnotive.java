package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vinnotive {
	public static int[] findPair(int[] arr,int key)
	{
		int pair[]=new int[2];
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]+arr[i+1]==key)
			{
				pair[0]=arr[i];
				pair[1]=arr[i+1];
				break;	
			}
		}
		return pair;		
	}

	public static void main(String[] args) {
		
			int arr[]= {4,6,5,7,3,3,9,1,4};
			int key=5;
			int pair[]=findPair(arr,key);
			System.out.println("["+pair[0]+","+pair[1]+"]");		
		
	}

}

package collections;

import java.util.Scanner;

public class characterCount{
	public static String count(String input1){
		char word[]=input1.toCharArray();
		int count=0;
		String word1=null;
		for(int i=0;i<word.length;i++)
		{
			char c=word[i];
			if(word[i]!=' ')
			{
				count =0;
				for(int j=0;j<word.length;j++)
				{
					if(c==word[j])
					{
						count=count+1;
						word[j]=' ';
					}
				}
				if(word1!=null)
					word1=word1+new String(c+""+count);
				else
					word1=new String(c+""+count);
			}						
		}
		return word1;		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input1=sc.nextLine();
		System.out.println(count(input1));
	}
	

}

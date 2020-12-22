package collections;

import java.util.Scanner;

public class thinkative2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++)
		{
			int count=0;
			if(s1[i]!=null)
			{
				String s2=s1[i];
				for(int j=0;j<s1.length;j++)
				{
					if(s2.equals(s1[j]))
					{
						count=count+1;
						s1[j]=null;
					}
					
				}
				System.out.println(s2+":"+count);
			}
			
			
		}
			
	}

}

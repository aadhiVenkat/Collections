package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class thinkative3 {

	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String values;
		try {
			values = br.readLine(); 
			String strs[]=values.trim().split(",");
			int a[]=new int[strs.length];
			for(int i=0;i<strs.length;i++)
			{
				 a[i]=Integer.parseInt(strs[i]);
				 System.out.println(a[i]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}

package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class occurance {
	public static void printOccurance(String word){
		char strs[]=word.toCharArray();
		for(int i=0;i<word.length();i++)
		{
			if(strs[i]!=' '){
				char c=strs[i];
				for(int j=0;j<word.length();j++){
					if(c==strs[j])
						strs[j]=' ';
				}
				System.out.print(c);
			}
		}
	}
	public static void main(String[] args) {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String word;
		try {
			word = br.readLine();			
			printOccurance(word);			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}

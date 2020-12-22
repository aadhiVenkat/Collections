package collections;

public class string {

	public static void main(String[] args) 
	{
	  String str="hello welcome";
	  char rev[]=new char[str.length()];// character array declaration with dynamic memory
	  char ch[]=str.toCharArray();
	  for(int i=str.length()-1,j=0;i>=0;i--,j++)
	  {
		  rev[j]=ch[i];
	  }
      String arrayrev=new String(rev);
      System.out.println(arrayrev);
      
	}

}

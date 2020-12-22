package collections;

public class OuterClass{
	static void MyFun(int n)
	{
		long inc=1,total=0,mul=1;
		for(int i=1;i<=n;i++)
		{
			mul=1;
			for(int j=1;j<=i;j++)
				mul=mul*(inc++);		
			total=total+mul;
		}
		System.out.println(total);
    }
	public static void main(String[] args) {
		MyFun(4);
	}
}

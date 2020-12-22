package collections;

import java.util.*;

public class arraylist {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList a=new ArrayList();
		a.add(1);
		a.add("adi");
		a.add("@@@@");
		int s;
		while((s=sc.nextInt())!=-1)
			a.add(s);			
		
		System.out.println(a);
		System.out.println(a.contains("@@@@"));
		a.add(2, 3);
		System.out.println(a);
		System.out.println(a.remove("adi"));
		System.out.println(a);
		a.set(1, "adi");
		System.out.println(a);
		System.out.println(a.get(2));
		System.out.println(a.indexOf(20));
		System.out.println(a.indexOf(1));
		
		System.out.println(a.lastIndexOf(20));
		System.out.println(a.size());
		
		Object[] b=a.toArray();
		System.out.println(b[5]);

	}

}

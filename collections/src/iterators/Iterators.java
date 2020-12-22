package iterators;

import java.util.*;

public class Iterators {
	
	public static void main(String[] args) {
		ArrayList  ar=new ArrayList();
		ar.add(10);
		ar.add("20");
		ar.add("Venkat");
		ar.add(45.369);
		ar.add('a');
		Iterator a=ar.iterator();
		while(a.hasNext())
		{
			Object b=a.next();
			System.out.println(b);			
		}
			System.out.println("--------------");
		ListIterator li=ar.listIterator();
		while(li.hasNext())
			System.out.println(li.next());
		li.remove();
		while(li.hasPrevious())
			System.out.println(li.previous());
		
	}

}

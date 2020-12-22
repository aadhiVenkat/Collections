package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class q2 {
public static void main(String[] args) {
	
	int Array []= {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

	
	//Results : [10,9,8,7,6,5,4,3,2,1,10,9,8,7,6,5,4,3,2,1,10,9,8,7,6,5,4,3,2,1,10,9,8,7,6,5,4,3,2,1]
	// first: swap if(
	HashSet<Integer[]> hm=new HashSet<Integer[]>();
	hm.add( new Integer[] {1,2,3,4,5,6,7,8,9,10});
	hm.add( new Integer[] {1,2,3,4,5,6,7,8,9,10});
	Object[] a=hm.toArray();
	System.out.println(a);
}
}

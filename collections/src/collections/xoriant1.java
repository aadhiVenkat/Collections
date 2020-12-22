package collections;
import java.util.ArrayList;
import java.util.Scanner;

public class xoriant1 {
    public static int processArray(ArrayList<Integer> array)
    {
	int count=0;
       for(int i=0;i<array.size();i=i+2)
       {
		if(array.get(i)>10 || array.get(i+1)>10)
	         {
				if((array.get(i)%2)!=0 || (array.get(i+1)%2)!=0) 
				{
					count=count+1;
				}
			 }
	}
	 
        	return count;
    }

    public static void main (String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0) 
                break;
            arrayList.add(new Integer(num));
        }
        int result = processArray(arrayList);
        System.out.println(result);
    }
}

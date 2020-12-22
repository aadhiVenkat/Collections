package collections;

import java.util.Vector;

public class vectors {
	int id;
	String name;
	vectors(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	/*@Override 
	public String toString()
	{
		return "Name is:"+name+"Id:"+id;
	}*/

	public static void main(String[] args) {
		Vector<vectors> v=new Vector<vectors>();
		vectors v1=new vectors(10,"ADI");
		vectors v2=new vectors(20,"VENKAT");
		v.add(v1);
		v.add(v2);
		v.add(new vectors(30,"Narayana"));
		System.out.println(v);
		for(vectors o:v)
			System.out.println(o);
		System.out.println(v.capacity());
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i).name);
		}
		
	}

}

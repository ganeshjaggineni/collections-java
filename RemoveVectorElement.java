package collectprac;

import java.util.Vector;

public class RemoveVectorElement {

	public static void main(String args[])
	{
		Vector v1 = new Vector();
		v1.add("gana");
		v1.add("jaggineni");
		System.out.println(v1);
		v1.remove(0);//or 	v1.remove("gana");
		//after removing
		System.out.println(v1);
		
		
		
		//remove all method
		Vector v2 = new Vector();
		v2.add("1");
		v2.add("2");
		v2.add("100");
		v2.addAll(v1);
		System.out.println("after adding v2 and before removing v1\n"+v2);
	
		v2.removeAll(v1);
		System.out.println("after removing "+v2);
		
//		to remove entire list
		Vector v3 = new Vector();
		v3.add("appi");
		v3.add("veeraiah");
		v3.add("devi priya");
		v3.add("hanimi");
		System.out.println("before removing v3 :"+v3);
		v3.clear();
		System.out.println("after removing v3 :"+v3);


	}
}

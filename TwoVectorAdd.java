package collectprac;

import java.util.Vector;

public class TwoVectorAdd {

	public static void main(String args[])
	{
		Vector v1 = new Vector();
		v1.add("gana");
		v1.add("jaggineni");
//		before adding vector v2 to vector v1
		System.out.println(v1);
		
		Vector v2 = new Vector();
		v2.add("lbrce");
		v2.add("cse");
		
//		adding two vectors
		for(int i=0;i<v2.size();i++)
		{
			v1.add(v2.get(i));
			
		}
		System.out.println(v1);
	}
}

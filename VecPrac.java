package collectprac;
import java.util.Vector;

public class VecPrac {

	
	public static void main(String args[])
	{
		Vector v1 = new Vector();
		v1.add("ganesh");
		v1.add("jaggineni");
		v1.add(0,"gani");
		v1.add("lbrce");
		v1.add("lbce");
		v1.add("cse");
		v1.add("btech");
		v1.add("lakireddy");
		v1.add("bali reddy");
		v1.add("java");//upto this element vector is with size=10
		
		v1.add("collection");//adding this element makes vector with increase of 100%(i.e 10)
		System.out.println("Size :"+v1.size());
		System.out.println("capacity :"+v1.capacity());
		
		System.out.println(v1);
	}
}

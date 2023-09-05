package collectprac;

import java.util.Vector;

public class VerificationOfVector {

	public static void main(String args[])
	{
		
		Vector colors = new Vector();
		colors.add("red");
		colors.add("pink");
		colors.add("green");
		colors.add("yellow");
		//to check whether the element is present or not
		System.out.println("green color is present in vector or not :"+colors.contains("green"));
		System.out.println("darkkhaki color is present in vector or not :"+colors.contains("darkkhaki"));
		
		Vector dummycolors = new Vector();
		dummycolors.add("red");
		dummycolors.add("yellow");
		dummycolors.add("pink");
		dummycolors.add("green");
		System.out.println("The vector dummycolors contains all element of vector colors :"+dummycolors.containsAll(colors));
		
	}
}

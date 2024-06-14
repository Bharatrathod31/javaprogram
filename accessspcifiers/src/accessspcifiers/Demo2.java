package accessspcifiers;

import java.util.Arrays;

public class Demo2 {
	public static void main(String ar[]) {
		System.out.println("PRIMITIVE DATA TYPES\n");
		
		int x=10;
		int y=x;
		System.out.println("Initially: ");
		System.out.println("x= "+x+ ", y =" +y);
		
		// here the change in the value of y 
		// will not affect the value of x
		y=30;
		
		System.out.println("After changing y to 30: ");
		System.out.println("x = "+ x + ", y = " + y);
		System.out.println(
				" **Only value of y is affected here"
				+ " because of Primitive data type\n");
		
		System.out.println("Reference Data types\n");
		int[] c= {10,20,30,40};
		
		// here completer reference of c is copied to d
		// and both point to same memory in heap
		int [] d=c;
		System.out.println("Initially");
		System.out.println("Array c: "+ Arrays.toString(c));
		System.out.println("Array d: "+ Arrays.toString(d));
		d[1]=50;
		
		System.out.println("After modification: ");
		System.out.println("Array c: "+ Arrays.toString(c));
		System.out.println("Array d: "+ Arrays.toString(d));
		
		System.out.println("** here value of c[1] is also affected"
				+"beacause of reference data type\n");
	}

}

package string;

public class swap {
	public int a;
	public int b;
	
	public swap() {
		
	}
	public swap(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public void setSwapa(int a,int b) {
		this.a=a;
		
	}
	
	public int getSwap() {
		return a;
	}
	
	public static void  Swapvariables(int a,int b) {
		System.out.println("Befor swap: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		int temp =a;
		a=b;
		b=temp;
		
		System.out.println("After Swap: ");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
	}

}

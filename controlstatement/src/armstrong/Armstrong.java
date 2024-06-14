package armstrong;

//import java.util.Math;

public class Armstrong {
	public static void  main(String args[]) {
		int number1 = 153;
		int temp=number1;
		int result =0;
		while (number1 !=0) {
			result= result + (int) java.lang.Math.pow(number1 % 10, 3);
			number1 = number1 / 10;
			System.out.println(result);
		}
		if (temp == result) {
			System.out.println("It is Armstrong number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

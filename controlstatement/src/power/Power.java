package power;

public class Power {
	public int power (int base,int exponent) {
		int i=1;
		int result = 1;
		
		while (i <=exponent) {
			result = result * base;
			i ++;
		}
		return result;
		
	}

}

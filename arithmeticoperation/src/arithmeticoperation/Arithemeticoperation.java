package arithmeticoperation;

public class Arithemeticoperation {
	public int number1=10;
	public int number2=13;
	
	public Arithemeticoperation() {
		
	}
	public Arithemeticoperation(int number1,int number2) {
		this.number1=number1;
		this.number2=number2;
	}
	
	public void setNum1(int number1) {
		this.number1=number1;
	}
	public void setNum2(int number2) {
		this.number2=number2;
	}
	
	public int getNum1() {
		return number1;
	}
	public int getNum2() {
		return number2;
	}
	
	public void printMenu() {
		System.out.println("Welcome to ArithmeticOperation: ");
		System.out.println("Chose 1 for Addition: ");
		System.out.println("Chose 2 for Subtraction: ");
		System.out.println("Chose 3 for Multiplication: ");
		System.out.println("Chose 4 for Division: ");
		System.out.println("Chose 5 for modulus: ");
		System.out.println("Chose 6 for change number1: ");
		System.out.println("Chose 7 for change number2: ");
	}
	
	

}

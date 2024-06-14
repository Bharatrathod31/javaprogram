package accessspcifiers;

public class ArithmeticOperation {
	int operand1;
	int operand2;
	
	 ArithmeticOperation() {
		operand1=12;
		operand2=10;
	}
	int getAddTwoNumbers(){
		 return operand1 + operand2;
	 }
	 
	 int getSubTwoNumbers() {
		 return operand1 - operand2;
	 }
	 
	 int getMulTwoNumbers() {
		 return operand1 * operand2;
	 }

}

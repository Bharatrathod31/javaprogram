package operators;

public class Operators {
	
	public static void main(String[] args) {
	
	BitWiseOperator bitwiseOperator = new BitWiseOperator();
	bitwiseOperator.setVariable1(5);
	bitwiseOperator.setVariable2(3);
	
	System.out.println(bitwiseOperator.andOperation());
	System.out.println(bitwiseOperator.orOperation());
	System.out.println(bitwiseOperator.xorOperation());
	System.out.println(bitwiseOperator.leftShiftOperation());
	System.out.println(bitwiseOperator.rightShiftOperation());
	System.out.println(bitwiseOperator.unsignedRightShiftOperation());
	
	
	UnaryOperator unaryOperation = new UnaryOperator(10);
	int temp = unaryOperation.postDecrementOperation()
			+unaryOperation.postIncrementOperation()
			+unaryOperation.preDecrementOperation();
	
	System.out.println(temp);
	System.out.println(unaryOperation.getVariable1());
		
	
	}
}

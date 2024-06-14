package ifelse;

public class Ifelse {
	public int i=10;
	
	public Ifelse(int i) {
		this.i=i;
		
	}
	
	public Ifelse() {
		// TODO Auto-generated constructor stub
	}

	public void setI(int i) {
		this.i=i;
	}
	public int getI() {
		return i;
	}
	
	public void GreaterNum() {
		if(i<15)
			System.out.println("I is less than 15");
		else
			System.out.println("I is greater than 15");
			
	}

}

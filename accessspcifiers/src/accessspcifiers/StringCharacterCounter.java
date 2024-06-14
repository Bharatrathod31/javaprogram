package accessspcifiers;

public class StringCharacterCounter {
	
	private String name;
	
	public StringCharacterCounter() {
		
	}
	
	public StringCharacterCounter(String name ) {
		this.name=name;
	}
	
	public void VowelCounter() {
		int counterA = 0;
		int counterE = 0;
		int counterI = 0;
		int counterO = 0;
		int counterU = 0;
		int consonent = 0;
		
		
		char[] nameArray = name.toCharArray();
		
		for (int i = 0; i < nameArray.length; i++) {
			switch (nameArray[i]) {
			case 'A':
				counterA++;
				break;
				
			case 'E':
				counterE++;
				break;
				
			case 'I':
				counterI++;
				break;
			case 'O':
				counterO++;
				break;
			case 'U':
				counterU++;
				break;
			case ' ':
				continue;

			default:
				consonent++;
				break;
			}
			
		}
		
		System.out.println("The Number of A present in String is " +counterA);
		System.out.println("The Number of E present in String is "+counterE);
		System.out.println("The Number of I present in String is "+counterI);
		System.out.println("The Number of O present in String is "+counterO);
		System.out.println("The Number of U present in String is "+counterU);
		System.out.println("The Number of consonent present in string is "+ consonent);
	}
}

	


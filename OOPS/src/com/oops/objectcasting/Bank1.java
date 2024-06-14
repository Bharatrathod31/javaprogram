
	
package com.oops.objectcasting;

public class Bank1 {
	    private long accNO;
	    private String accType;
	    
	    // Default constructor
	    public Bank1() {}
	    
	    // Parameterized constructor
	    public Bank1(long accNO, String accType) {
	        this.accNO = accNO;
	        this.accType = accType;
	    }

	    // Getter for accNO
	    public long getAccNO() {
	        return accNO;
	    }

	    // Setter for accNO
	    public void setAccNO(long accNO) {
	        this.accNO = accNO;
	    }

	    // Getter for accType
	    public String getAccType() {
	        return accType;
	    }

	    // Setter for accType
	    public void setAccType(String accType) {
	        this.accType = accType;
	    }

	    // Method to print account details
	    public void printAccountDetails() {
	        System.out.println("Account no: " + getAccNO() + " Account Type: " + getAccType());
	    }
	    
	    // Overriding the toString method
	    @Override
	    public String toString() {
	        return "Bank [accNO=" + getAccNO() + ", AccountType=" + getAccType() + "]";
	    }
	}




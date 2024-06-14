package com.oops.objectcasting;

public class SBI1 extends Bank1 {

    public SBI1() {}
    
    public SBI1(long accNO, String accType) {
        super(accNO, accType);
    }
    
    @Override
    public void printAccountDetails() {
        System.out.println("Acc NO: " + getAccNO() + " Account Type: " + getAccType());
    }
}


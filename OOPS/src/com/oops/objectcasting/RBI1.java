package com.oops.objectcasting;

public class RBI1 extends Bank1 {
    private String printEquipments;
    
    public RBI1() {}

    public RBI1(long accNO, String accType, String printEquipments) {
        super(accNO, accType);
        this.printEquipments = printEquipments;
    }

    public String getPrintEquipments() {
        return printEquipments;
    }

    public void setPrintEquipments(String printEquipments) {
        this.printEquipments = printEquipments;
    }
    
    @Override
    public void printAccountDetails() {
        System.out.println("Acc NO: " + getAccNO() + " Account Type: " + getAccType());
    }
}

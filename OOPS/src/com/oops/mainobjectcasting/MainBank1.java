package com.oops.mainobjectcasting;
import com.oops.objectcasting.*;

public class MainBank1 {
    public static void main(String[] args) {
        Bank1 bank = new Bank1();
        bank.setAccNO(1209310);
        bank.setAccType("Savings");
        bank.printAccountDetails();
        
        RBI1 rbi = new RBI1();
        rbi.setAccNO(883778578);
        rbi.setAccType("Current");
        rbi.setPrintEquipments("500");
        
        rbi.printAccountDetails();
        
        // Upcasting
        Bank1 bank1 = new RBI1();
        bank1.printAccountDetails();
        
        // Downcasting
        RBI1 rbi1 = (RBI1) bank1;
        rbi1.setAccNO(627362786);
        rbi1.setAccType("123123");
        rbi1.setPrintEquipments("100");
        rbi1.printAccountDetails();
        
        SBI1 sbi = new SBI1();
        sbi.setAccNO(321321);
        sbi.setAccType("321321");
        sbi.printAccountDetails();
        
        // Upcasting
        bank1 = sbi;
        bank1.printAccountDetails();
    }
}

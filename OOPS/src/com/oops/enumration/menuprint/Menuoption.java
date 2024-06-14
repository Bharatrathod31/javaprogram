package com.oops.enumration.menuprint;

public enum Menuoption {
	ADD(1,"Add Record"),
	UPDATE(2,"Update Record"),
	SELECT(3,"Select Record"),
	SELECT_ALL(4,"Select All Record"),
	DELETE(5,"Deletc Record"),
	SORT(6,"SORT THE RECORD"),
	EXIT(0,"Exit the progra");
	//DEFAULT("INVALID INPUT");
	
	
	private int serialNum;
	private String menuDescription;
	
	private Menuoption(int serialNum,String menuDescription) {
		this.serialNum=serialNum;
		this.menuDescription=menuDescription;
	}

	public int getSerialNum() {
		return serialNum;
	}

	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
	}

	public String getMenuDescription() {
		return menuDescription;
	}

	public void setMenuDescription(String menuDescription) {
		this.menuDescription = menuDescription;
	}
	
	

}

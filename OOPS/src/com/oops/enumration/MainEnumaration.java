package com.oops.enumration;

public class MainEnumaration {
	enum UserAccess{
		ACTIVE(1,"Acitve user","All Access"),
		INACTIVE(2,"Inactive User","No Acess at all"),
		SUSPENDED(3,"Suspended User","Login Access for particular time ");
		//BLOCK(4,"Blocked Usr","No access at all");
		
		private int srNo;
		private String description;
		private String access;
		
		private UserAccess(int srNO,String description,String access) {
			this.srNo=srNO;
			this.description=description;
			this.access=access;
		}

		public int getSrNo() {
			return srNo;
		}

		public void setSrNo(int srNo) {
			this.srNo = srNo;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getAccess() {
			return access;
		}

		public void setAccess(String access) {
			this.access = access;
		}
		
		
	}
	
	public static void main(String[] args) {
		System.out.println(UserAccess.ACTIVE);
		System.out.println(UserAccess.INACTIVE.getSrNo());
		System.out.println(UserAccess.ACTIVE.getDescription());
		
		for(UserAccess useraccess:UserAccess.values()) {
			System.out.println(useraccess.getSrNo() + "." 
					+ useraccess.name() 
					+useraccess.getDescription() + "." + useraccess.getAccess());
		}
	}

}

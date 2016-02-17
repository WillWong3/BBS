package bbs.hibernate.domain;

import java.util.Date;

public class Student {
	private String sID;
	private String sName;
	private String sPassword;
//	private Date Sbirthday;
	public String getsID() {
		return sID;
	}
	public void setsID(String sID) {
		this.sID = sID;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsPassword() {
		return sPassword;
	}
	public void setsPassword(String sPassword) {
		this.sPassword = sPassword;
	}
	
	
	

}

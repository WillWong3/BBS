package bbs.hibernate.domain;

import java.util.Date;

public class Student {
	private String SID;
	private String SName;
	private String SPassword;
//	private Date Sbirthday;
	public String getSID() {
		return SID;
	}
	public void setSID(String sID) {
		SID = sID;
	}
	public String getSName() {
		return SName;
	}
	public void setSName(String sName) {
		SName = sName;
	}
	public String getSPassword() {
		return SPassword;
	}
	public void setSPassword(String sPassword) {
		SPassword = sPassword;
	}
//	public Date getSbirthday() {
//		return Sbirthday;
//	}
//	public void setSbirthday(Date sbirthday) {
//		Sbirthday = sbirthday;
//	}
	
	

}

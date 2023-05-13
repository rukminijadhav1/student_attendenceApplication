package studentAttendence.entity;

public class Student {
	private int RollNum;
	private String FullName;
	private String Standard;
	private String Mobilenum;
	public int getRollNum() {
		return RollNum;
	}
	public void setRollNum(int rollNum) {
		RollNum = rollNum;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getStandard() {
		return Standard;
	}
	public void setStandard(String standard) {
		Standard = standard;
	}
	public String getMobilenum() {
		return Mobilenum;
	}
	public void setMobilenum(String mobilenum) {
		Mobilenum = mobilenum;
	}
	@Override
	public String toString() {
		return "Student [RollNum=" + RollNum + ", FullName=" + FullName + ", Standard=" + Standard + ", Mobilenum="
				+ Mobilenum + "]";
	}
	
	
}

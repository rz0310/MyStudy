package ���ɱ���ͻ���ʵ���Ĳ��ɱ���;

public class Name {
	private String FirstName;
	private String LastName;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String LastName) {
		this.LastName = LastName;
	}
	public Name() {
		
	}
	public Name(String FirstName,String LastName) {
		this.FirstName = FirstName;
		this.LastName = LastName;
	}
}

package 不可变类和缓存实例的不可变类;

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

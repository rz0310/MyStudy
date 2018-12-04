package practice;

public class Address {
	private final String detail;
	private final String postCode;
	public String getDetail() {
		return detail;
	}
	public String getPostCode() {
		return postCode;
	}
	public Address() {
		this.detail = "";
		this.postCode = "";
	}
	public Address(String detail,String postCode) {
		this.detail = detail;
		this.postCode = postCode;
	}
	public boolean equals(Object obj){
		if(this == obj) {
			return true;
		}
		if(obj != null && obj.getClass() == Address.class) {
			Address a = (Address)obj;
			if(this.getDetail().equals(a.getDetail())) {
				return true;
			}
		}
		return false;
	}
	public int hashCode() {
		return detail.hashCode() + postCode.hashCode() * 31;
	}
}

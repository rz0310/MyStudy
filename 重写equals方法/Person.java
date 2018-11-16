package 重写equals方法;

public class Person {
	private String name;
	private String IdStr;
	public Person(String name,String IdStr) {
		this.name = name;
		this.IdStr = IdStr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdStr() {
		return IdStr;
	}
	public void setIdStr(String idStr) {
		IdStr = idStr;
	}
	public boolean equals(Object obj) {
//		如果两个对象为同一个对象,返回true
		if(this == obj) {
			return true;
		}
//		只有当obj是Person对象,且不为null时
		if(obj != null && Person.class == obj.getClass()) {
			Person p = (Person)obj;
//			并且当前对象的IdStr和Person对象IdStr相同时,才能判断两个对象相等
			if(this.getIdStr().equals(p.getIdStr())) {
				return true;
			}
		}
		return false;
	}
}

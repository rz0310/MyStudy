package ��дequals����;

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
//		�����������Ϊͬһ������,����true
		if(this == obj) {
			return true;
		}
//		ֻ�е�obj��Person����,�Ҳ�Ϊnullʱ
		if(obj != null && Person.class == obj.getClass()) {
			Person p = (Person)obj;
//			���ҵ�ǰ�����IdStr��Person����IdStr��ͬʱ,�����ж������������
			if(this.getIdStr().equals(p.getIdStr())) {
				return true;
			}
		}
		return false;
	}
}

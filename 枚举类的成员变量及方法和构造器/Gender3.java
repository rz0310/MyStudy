package ö����ĳ�Ա�����������͹�����;

public enum Gender3 {
	MALE("��"),FEMALE("Ů");
//	����һ�д���ȼ���
//	public static final Gender3 MALE = new Gender3("��");
//	public static final Gender3 FEMALE = new Gender3("Ů");
	private final String name;
//	ö����Ĺ�����ֻ����private����
	private Gender3(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}

package ʵ�ֽӿڵ�ö����;

public enum Gender implements GenderDesc {
	MALE("��"),FEMALE("Ů");
//	����һ�д���ȼ���
//	public static final Gender3 MALE = new Gender3("��");
//	public static final Gender3 FEMALE = new Gender3("Ů");
	private final String name;
//	ö����Ĺ�����ֻ����private����
	private Gender(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
//	ʵ��GenderDesc�ӿڱ���ʵ�ֵķ���
	public void info() {
		System.out.println("����һ�����ڶ����Ա��ö����");
	}
	
}

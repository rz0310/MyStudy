package ��ҵ;

public class StudentTest {
	public static void stu(){
		Student[] stu = new Student[3];
		Student s1 = new Student();
		s1.setName("����");
		s1.setAge(20);
		s1.setGender("��");
		s1.setPhone("10001");
		s1.setAddress("������");
		s1.setEmail("1362024331@qq.com");
		Student s2 = new Student("����",20,"��","11001","������","1362024331@qq.com");
		Student s3 = new Student("����",20,"��","11001","������","");
		stu[0] = s1;
		stu[1] = s2;
		stu[2] = s3;
		for (int i = 0; i < stu.length; i++) {
			if(stu[i].getEmail()==null){
				System.out.println("���û��ĵ������䲻����");
				return;
			}
			System.out.println(stu[i].getEmail());
		}
	}
	public static void main(String[] args) {
		stu();
	}
}

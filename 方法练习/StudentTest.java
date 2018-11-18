package 作业;

public class StudentTest {
	public static void stu(){
		Student[] stu = new Student[3];
		Student s1 = new Student();
		s1.setName("张三");
		s1.setAge(20);
		s1.setGender("男");
		s1.setPhone("10001");
		s1.setAddress("开发区");
		s1.setEmail("1362024331@qq.com");
		Student s2 = new Student("李四",20,"男","11001","开发区","1362024331@qq.com");
		Student s3 = new Student("王五",20,"男","11001","开发区","");
		stu[0] = s1;
		stu[1] = s2;
		stu[2] = s3;
		for (int i = 0; i < stu.length; i++) {
			if(stu[i].getEmail()==null){
				System.out.println("该用户的电子邮箱不存在");
				return;
			}
			System.out.println(stu[i].getEmail());
		}
	}
	public static void main(String[] args) {
		stu();
	}
}

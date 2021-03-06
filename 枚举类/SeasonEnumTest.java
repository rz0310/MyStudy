package 枚举类;

public class SeasonEnumTest {
	public void judge(SeasonEnum s) {
//		switch语句里的表达式可以是枚举类
		switch(s) 
		{
			case SPRING:
				System.out.println("春暖花开，正好踏青");
				break;
			case SUMMER:
				System.out.println("夏日炎炎，适合游泳");
				break;
			case FALL:
				System.out.println("秋高气爽，进补及时");
				break;
			case WINTER:
				System.out.println("冬日雪飘，围炉赏雪");
				break;
		}
	}
	public static void main(String[] args) {
//		枚举类默认有一个values()方法，返回枚举类的所有实例
		for(SeasonEnum s : SeasonEnum.values()) {
			System.out.println(s);
		}
//		使用枚举类时，可通过EnumClass.variable形式来访问 
		new SeasonEnumTest().judge(SeasonEnum.SPRING);
	}
}

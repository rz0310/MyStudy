package 练习;

public class 形参可变的方法和递归 {
	public int i=0;
	public void digui(){
		i++;
		System.out.println("递归"+i);
		if(i<10){
			digui();
		}
	}
	public  void  varArgs(int a, String... chs){
		System.out.println("参数a为:"+a);
		System.out.println("长度为:"+chs.length);
		for(int i=0;i<chs.length;i++){
			System.out.print(chs[i]);
		}
	}
}

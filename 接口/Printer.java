package 接口;


interface Product{
	int getProduceTime();
}
public class Printer implements OutPut,Product{
	
	private String[] printData = new String[Max_Cache_Line];
//	用来记录当前需打印的作业数
	private int dataNum = 0;
//	打印输出
	public void out() {
		while(dataNum > 0) {
			System.out.println(printData[0]);
//			把作业队列整体向前移一位,并将剩下的作业数减一
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}
//	获取数据
	public void getData(String msg) {
		if(dataNum >= Max_Cache_Line) {
			System.out.println("输出队列已满");
		}
		else {
			printData[dataNum++] = msg;
		}
	}
//	获取打印时间
	public int getProduceTime() {
		return 45;
	}
	public static void main(String[] args) {
		OutPut o = new Printer();
		o.getData("疯狂java");
		o.getData("讲义");
		o.out();
		o.getData("巴拉拉");
		o.getData("小魔仙");
		o.out();
//		调用outPut接口中的默认方法
		o.test();
		System.out.println(OutPut.staticTest());
		
		Product p = new Printer();
		System.out.println(p.getProduceTime());
		Object obj = p;
	}
}

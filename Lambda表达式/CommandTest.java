package Lambda���ʽ;
/*
 * Lambda���ʽ֧�ֽ��������Ϊ��������,Lambda�����ø����ķ���������ֻ��һ�����󷽷��Ľӿ�
 * �����ֽӿڱ���Ϊ����ʽ����ʵ����
 */
public class CommandTest {
	public static void main(String[] args) {
		ProcessArray pa = new ProcessArray();
		int[] target = {3,-4,6,4};
//		�������飬������Ϊȡ���������ڲ���
		pa.processArray(target, new Command() 
		{
			public void process(int[] target) {
				int sum = 0;
				for(int tmp : target) {
					sum += tmp;
				}
				System.out.println("����Ԫ�ص��ܺ��ǣ�"+sum);
			}
		});
	}
}

package Lambda���ʽ;
/*
 * Lambda���ʽ�ĵ���ɣ�
 * �β��б��β��б�����ʡ���β����͡�����β��б���ֻ��һ���������������β��б��Բ����Ҳ����ʡ�ԡ�
 * ��ͷ��->��������ͨ��Ӣ���л��ߺʹ��ڷ�����ɡ�
 * ����顣��� �����ֻ����һ����䣬Lambda���ʽ����ʡ�Դ����Ļ����š�
 * ���Lambda���ʽֻ��һ��return��䣬��������ʡ��return��䡣Lamabda���ʽ��Ҫ����ֵ�������Ĵ�����н���һ��ʡ����return����䣬
 * Lambda���ʽ���Զ�������������ֵ��
 */
public class CommandTest2 {
	public static void main(String[] args) {
		ProcessArray pa = new ProcessArray();
		int[] array = {3,-4,6,4};
//		Lambda���ʽ�൱��һ����������
		pa.processArray(array, (int[] target)->{
			int sum = 0;
			for(int tmp : target) {
				sum += tmp;
			}
			System.out.println("����Ԫ�صĺ�Ϊ��"+sum);
		});
	}
}

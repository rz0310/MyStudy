package Set����;
/*
 * HashSet����hash�㷨������Ԫ�صĴ洢λ�ò�ͬ��TreeSet���ú���������ݽṹ���洢����Ԫ�ء�
 * TreeSet֧����������ʽ����Ȼ����Ͷ�������Ĭ��ʹ����Ȼ����
 */
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet nums = new TreeSet();
		nums.add(5);
		nums.add(2);
		nums.add(10);
		nums.add(-9);
//		�������Ԫ�أ�TreeSet����Ԫ�ذ���Ԫ��ʵ��ֵ�Ĵ�С������
		System.out.println(nums);
		System.out.println(nums.first());
		System.out.println(nums.last());
//		����С��4���Ӽ���������4
		System.out.println(nums.headSet(4));
//		���ش���5���Ӽ������Set�л�����5���Ӽ���Ҳ����5
		System.out.println(nums.tailSet(5));
//		���ش��ڵ���-3��С��4���Ӽ� 
		System.out.println(nums.subSet(-3, 4));
	}
}

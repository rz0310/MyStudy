package Map����;
/*
 * LinkedHashMapҲʹ��˫��������ά��key-value�ԵĴ���(��ʵֻҪ����key�Ĵ���)��
 * ��������ά��Map�ĵ���˳�򣬵���˳����key-value�ԵĲ���˳��һ�¡�
 * 
 * LinkedHashMap��Ҫά������˳����������Ե���HashMap����������������ά���ڲ�˳���ڵ�������Map��ȫ��Ԫ��ʱ���ܽϺá�
 */
import java.util.LinkedHashMap;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("����", 99);
		lhm.put("��ѧ", 89);
		lhm.put("Ӣ��", 79);
		lhm.forEach((key,value)->System.out.println(key+"->"+value));
	}
}

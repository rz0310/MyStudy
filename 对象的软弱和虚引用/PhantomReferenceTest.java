package �����������������;
	/*
	 * �����ò���
	 */
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

public class PhantomReferenceTest {
	public static void main(String[] args) throws Exception {
//		����һ���ַ�������
		String str = new String("�����ò���");
//		����һ�����ö���
		ReferenceQueue rq = new ReferenceQueue();
//		����һ��������,�ô����������õ����ַ���"�����ò���"
		PhantomReference pr = new PhantomReference(str,rq);
//		�ж�str���ַ���֮�������
		str = null;
//		ȡ�������������õĶ��󣬲�����ͨ�������û�ȡ�����õĶ������Դ˴����null
		System.out.println(pr.get());
//		ǿ����������
		System.gc();
		System.runFinalization();
//		��������֮�������ñ��������ö����У�
//		ȡ�����ö��������Ƚ�����е�������pr���бȽ�
		System.out.println(rq.poll() == pr);
		System.out.println(rq.poll());
		System.out.println(pr);
	}
}

package ����ģʽ;

import org.junit.Test;

public class Singleton {
//	����һ����̬����������ڴ���ʵ��
	private static Singleton s;
//	���ع�����
	private Singleton(){
		
	}
	public static Singleton instance(){
		if(s == null){
			s = new Singleton();
		}
		return s;
	}
}

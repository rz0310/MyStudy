package ��ϰ;

public class �βοɱ�ķ����͵ݹ� {
	public int i=0;
	public void digui(){
		i++;
		System.out.println("�ݹ�"+i);
		if(i<10){
			digui();
		}
	}
	public  void  varArgs(int a, String... chs){
		System.out.println("����aΪ:"+a);
		System.out.println("����Ϊ:"+chs.length);
		for(int i=0;i<chs.length;i++){
			System.out.print(chs[i]);
		}
	}
}

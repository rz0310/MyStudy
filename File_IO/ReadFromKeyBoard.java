package File_IO3;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
//�Ӽ��̶�ȡ����
public class ReadFromKeyBoard {
	public static void main(String[] args) {
		try {
//			�����ַ����뻺�������Ӽ��������Ҫ��InputStreamReader������
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			��ȡһ��
			String readLine = br.readLine();
			System.out.println(readLine);
			
//			������׼�����
			PrintWriter pw = new PrintWriter("E:\\FileTest\\a.txt");
//			�����������д���ļ���
			pw.write(readLine);
			pw.flush();
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

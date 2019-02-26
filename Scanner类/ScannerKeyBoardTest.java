package Scanner类;

import java.util.Scanner;

public class ScannerKeyBoardTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		while(sc.hasNext()) {
			System.out.print("键盘输入的内容是："+sc.next());
		}
	}
}

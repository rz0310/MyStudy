package Scanner��;

import java.util.Scanner;

public class ScannerKeyBoardTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\n");
		while(sc.hasNext()) {
			System.out.print("��������������ǣ�"+sc.next());
		}
	}
}

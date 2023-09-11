package p0911;

import java.util.Scanner;

public class J0911_04 {

	int a = 0;
	int b = 0;

	public static void main(String[] args) {
		J0911_04 j = new J0911_04();
		Scanner scan = new Scanner(System.in);

		while (true) {

			System.out.println("1벚째 수를 입력하세요");
			int a = scan.nextInt();
			System.out.println("2본쩨 수를 입력하세요");
			int b = scan.nextInt();

			if (a == 0) {
				break;
			}
			int result = j.max(a, b);

			System.out.println("큰수 :" + result);

		}
	}

	int max(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}

	}

}

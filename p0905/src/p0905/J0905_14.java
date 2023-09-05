package p0905;

import java.util.Scanner;

public class J0905_14 {

	public static void main(String[] args) {
		int[] num = new int[10]; // 배열 10개 생성
		// 1-100랜덤숫자를 생성해서 맞추는 푸로그램을 구현
		Scanner scan = new Scanner(System.in);
		int random = (int) (Math.random() * 100) + 1;
		int i=0; //초기식
		while (i<10) {
			System.out.println("숫자를 입력사에ㅛ요");
			int input = scan.nextInt();
			num[i]=input;
			if (random == input) {
				System.out.println("정답입니다");
				break;
			} else if (random > input) {
				System.out.println("더 큰 수를 입력하세요");

			} else {
				System.out.println("더 작은 수를 입력하세요");
			}
			
			i++;
		} // while
		System.out.println("랜덤숫자 :" + random);

		// System.out.println(num);//주소값이 출력
		// System.out.println(Arrays.toString(num));

	}

}

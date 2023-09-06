package p0905;

import java.util.Scanner;

public class J0905_16 {

	public static void main(String[] args) {
		// 1.랜덤 숫자 생성
		// 1.1-100랜덤 숫자
		// 2.입력
		// 3.비교
		// 4.출럭
		Scanner scan = new Scanner(System.in);
		int[] arrNum = new int[10];
		int number = 0;
		int count = 0;
		int random = 0;

		random = (int) (Math.random() * 100) + 1;// 1-100까지의 랜덤숫자 생성

		while (true) {
			System.out.println((count + 1) + "번째 숫자를 입력하세요.");
			number = scan.nextInt();
			arrNum[count] = number;// 배열에 입력한 숫자 저장

			if (random == number) {
				System.out.println("정답입니다");
				break;
			} else if (random > number) {
				System.out.println("더 큰 수를 입력하세요");
			} else {
				System.out.println("더 작은 수를 입력하세요");
			}
			System.out.println("입력한 숫자 :" + number);
			count++;
			if (count > 9) {
				System.out.println("10번 완료");
				count--;
				break;
			}
		} // while
			// 입력한 숫자 출력
		int i = 0;
		for (i = 0; i < count + 1; i++){
			if(i=0) {
				System.out.println(arrNum[i]);
				continue;
			}
		}
			
		{
			System.out.println("입력한 숫자들 " + arrNum[i]);
		}
		// 도전 횟수 출력
		System.out.println("도전횟수" + (count + 1));
		// 랜던숫자 출력
		System.out.println("랜덤숫자 :" + random);

	}// main

}

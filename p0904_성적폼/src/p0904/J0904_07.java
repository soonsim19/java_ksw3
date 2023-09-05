package p0904;

import java.util.Scanner;

public class J0904_07 {

	public static void main(String[] args) {

		int random = (int) (Math.random() * 10) + 1;

		// 3개의 숫자를 입력받아 정답을 맞추는 프로그램을 구현하시요

		Scanner scan = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0;
		System.out.println("1번째 숫자를 입력하세요");
		num1 = scan.nextInt();
		if (random == num1) {
			System.out.println("정답입니다");
		} else {
			System.out.println("오답입니다");
		}
		System.out.println("2번째 숫자를 입력하세요");
		num2 = scan.nextInt();
		if (random == num2) {
			System.out.println("정답입니다");
		} else {
			System.out.println("오답입니다");
		}
		System.out.println("3번째 숫자를 입력하세요");
		num3 = scan.nextInt();
		if (random == num3) {
			System.out.println("정답입니다");
		} else {
			System.out.println("오답입니다");
		}

		// 입력한 숫자 출력
		System.out.printf("입력번호 : %d, %d, %d\n", num1, num2, num3);
		// 1개 입력받아 확인 -->정답. 오답
		// 3개의 입력값을 출력

		// 정답번호
		System.out.println("정답번호 : " + random);

	}// main
//		// 랜덤 숫자 1-100까지 5개의 숫자를 생성해서 변수에 저장 후 출력
//		int num1 = (int)(Math.random()*100)+1;
//		int num2 = (int)(Math.random()*100)+1;
//		int num3 = (int)(Math.random()*100)+1;
//		int num4 = (int)(Math.random()*100)+1;
//		int num5 = (int)(Math.random()*100)+1;
//		
//		System.out.printl(num1);
	
//	}

}

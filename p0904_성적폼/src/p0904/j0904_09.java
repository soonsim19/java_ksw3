package p0904;

import java.util.Scanner;

public class j0904_09 {

	public static void main(String[] args) {
		// 두 수를 입력받고 =-*/를 선택해서 그 값을 출력하시요

		Scanner scan = new Scanner(System.in);
		int num1, num2 = 0;
		char choice = ' ';
		int result = 0;

		System.out.println("1번째 숫자입력");
		num1 = scan.nextInt();
		System.out.println("2번째 숫자입력");
		num2 = scan.nextInt();

		System.out.println("+-*/ 중 하나를 선택하세요");
		choice = scan.next().charAt(0);
		switch (choice) {
		case '+':
			result = num1 + num2;
			break;
		case '-':
			result = num1 - num2;
			break;
		case '*':
			result = num1 * num2;
			break;
		case '/':
			result = num1 / num2;
			break;

		}

		System.out.println("결과값: " + result);
	}// main

}// class

package p0911;

import java.util.Scanner;

public class J0911_05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int result = 0;
		int[] n = new int[7];
		for (int i = 0; i < n.length; i++) {
			System.out.println((i + 1) + "번쩨 숫자를 입력하세요.");
			n[i] = scan.nextInt();
		}

		System.out.print("더하기 결과값 :");
		result = add(n);
		System.out.println(result);

		System.out.print("빼기 결과값 :");
		result = subtract(n);
		System.out.println(result);

		System.out.print("곱하기 결과값 :");
		result = multiply(n);
		System.out.println(result);

		System.out.print("나누기 결과값 ");
		result = devide(n);
		System.out.println(result);

	}// main

	static int add(int[] n) {
		int result = n[0];
		for (int i = 1; i < n.length; i++)
			result = result + n[i];

		return result;
	}

	static int subtract(int[] n) {
		int result = n[0];
		for (int i = 1; i < n.length; i++)
			result = result - n[i];

		return result;

	}

	static int multiply(int[] n) {
		int result = n[0];
		for (int i = 1; i < n.length; i++)
			result = result * n[i];

		return result;
	}

	static int devide(int[] n) {
		int result = n[0];
		for (int i = 1; i < n.length; i++)
			result = result / n[i];
		
		return result;
	}
}

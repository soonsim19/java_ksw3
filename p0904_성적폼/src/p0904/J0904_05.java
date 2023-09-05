package p0904;

import java.util.Scanner;

public class J0904_05 {

	public static void main(String[] args) {
		// 두 수를 입력받아 큰 수를 출력하세요
		// 1.두 수를 입력받아 출력하시요
		// 2.두 수를 비교해서 큰 수 출력

		Scanner scan = new Scanner(System.in);
		System.out.println("1번째 입력 >>");
		int num1 = scan.nextInt();
		System.out.println("2번째 입력 >>");
		int num2 = scan.nextInt();
		System.out.printf("1: %d,2: %d \n",num1,num2);
        System.out.println();
  
		if (num1 > num2) {
			System.out.println("큰 수:" + num1);
			System.out.println("작은 수" + num2);
		}else if (num1<num2){
			System.out.println("큰 수:" + num2);
		} else {
			System.out.println("같습니다");
		}

	}
}

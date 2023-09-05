package p0904;

import java.util.Scanner;

public class JA0904_02 {

	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);	
	
	//두수를 입력받아 두수의 곱을 맞춫는 그로그램을 구현하시요
	//두 수를 입력받아 부분 출력하시요
	//두수의 곱의 정답을 입력해서, 맞으면 정담 틀리면 오답 ㅊㅜㄹ력
	
//	System.out.println("두수를 입력하세요");
//	int num1 = scan.nextInt();
//	int num2 = scan.nextInt();
//	
//	System.out.printf("%d%d는 얼마일가요?\n",num1,num2);
//	int ans= scan.nextInt();
//	if(ans==(num1*num2)) {
//		System.out.println("정답입니다");
//	}else {
//		System.out.println("오답니다");

	
	
	
	
	System.out.println("사랑은 영어로 무엇인지 입력하쇼");
	String result = scan.next();
    if(result.equalsIgnoreCase("love")) { 
    	System.out.println("정답입니다");
    	}else {
		System.out.println("오답입니다");
	}
////		}
//
//
	}
}

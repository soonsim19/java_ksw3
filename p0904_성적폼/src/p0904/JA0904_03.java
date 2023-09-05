package p0904;

import java.util.Scanner;

public class JA0904_03 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		//문자 '0'에서 '9'사이의 문자이면 문자 숫자입니다. 아니면 문자숫자가 아닙니다. 출력하시요
		
		System.out.println("두자리 문자를 입력하시요");
		String result = scan.next();
		char result1 = scan.next().charAt(0);
		if (result1>='0' && result1 <='9') {
			System.out.println("문자숫자입니다");
		} else {
			System.out.println("숫자가 아닙니다");
		}
		
		result1 = scan.next().charAt(1);
		if (result1>='0' && result1 <='9') {
			System.out.println("문자숫자입니다");
		} else {
			System.out.println("숫자가 아닙니다");
		}
			
		
		
		
		
		
		
		
		
//		//알파벳 x,X를 입력하면 프로그램을 종료 합니다. 라고 출력하시요
//		System.out.println("프로그램을 종료하려면 x또는 X를 입력하세요");
//	    char result = scan.next().charAt(0);
//	    
//	    if(result=='x'|| result=='X') {
//	    	System.out.println("프로그램을 종료합니다");
//	    }
	}//maibn

}//class

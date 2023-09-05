 package p0901;

import java.util.Scanner;

public class JA0901_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자를 입력하세요");
		String str =scan.next();
		char ch=str.charAt(0);
		
		if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
				
			System.out.println("영문소문자입니다.");
		else 
			System.out.println("영문소문자가 아닙니다");
		System.out.println("입력한 문자 "+ch);
		System.out.println("입력한 글자 길이 : "+str.length());
		System.out.println("입력한 문자 : "+ch);
		
	}

}

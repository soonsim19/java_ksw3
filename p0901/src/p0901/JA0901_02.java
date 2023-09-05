package p0901;

import java.util.Scanner;

public class JA0901_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("학번을 입력하세요");
		
		int number = scan.nextInt(); //enter키 값은 입력 받지 않음
		scan.nextLine();
		System.out.println("이름을 입력하세요");
		//String name = scan.next();
		String name = scan.nextLine();//엔터키 입력까지 받음
		System.out.println("이름 : " + name);
		
		System.out.println("국어점수를 입력하세요");
		String k = scan.nextLine();
		int kor=Integer.parseInt(k); //String을 int타입으로 변경
		System.out.println("영어점수를 입력하세요");
		String e = scan.nextLine();
		int eng = Integer.parseInt(e);
		System.out.println("합계: "+((kor+eng)));
		
	
	}

}

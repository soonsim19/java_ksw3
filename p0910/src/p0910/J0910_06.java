package p0910;

import java.util.Scanner;

public class J0910_06 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		StuScore[] s= new StuScore[2];
		
		//입력부분
		for(int i=0; i<2; i++) {
			//객체선언을 또 한번 햬줘야 함
			s[i]= new StuScore();
			s[i].stuNo = i+1;
			System.out.println("이름을 입력하세요.");
			s[i].name=scan.next();
			System.out.println("국어 점수를 입력하세요.");
			s[i].kor = scan.nextInt();
			System.out.println("영어 점수를 입력하세요.");
			s[i].eng = scan.nextInt();
			System.out.println("수학점수를 입력하세요.");
			s[i].math = scan.nextInt();
			s[i].total();
			s[i].avg();
			
		}//for
		//출력부
		
		for(int i=0; i<s.length; i++) {
			System.out.printf("%d  %s\t%d\t%d\t%d\t%d\t%.2f\n",
					s[i].stuNo,s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].total,s[i].avg);
			
		}
		
		
		
	}// main

}

package p0904;

import java.util.Scanner;

public class JA0904_04 {

	public static void main(String[] args) {
		// 90점 이상 A 80점 이상 B 70점이상 c 60점 이상 d,F
		// 점수를 입력받아 성적 출력
		// 98점 이상 A+ 93이하 A-

		Scanner scan = new Scanner(System.in);
		String grade = "";
		System.out.println("점수를 입력하세요");

		int score = scan.nextInt();
		if (score >= 90) {
//		System.out.print("A");
			grade = "A";
			if (score >= 98) {
//			System.out.println("+");
				grade = grade + "+";

			} else if (score <= 93) {
				grade = grade + "-";
//			System.out.println("-");

			} else {
				System.out.println();
			}

		} else if (score >= 80) {
			grade = "B";
			if(score>=88) {
				grade = grade + "+";
			}else if(score<=83) {
				grade = grade + "-";
			}
                             			
		} else if (score >= 70) {
			grade = "c";
			if(score>=78) {
				grade = grade + "+";
			
				
			}

		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("메롱");
		}
		
		System.out.println("학점 : "+grade);
		
		
		
	}// main

}// class

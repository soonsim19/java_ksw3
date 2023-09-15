package p0915_학생성적;

import java.util.ArrayList;
import java.util.Scanner;

public class StuAction {
	Scanner scan = new Scanner(System.in);
	ArrayList list = new ArrayList();
	
	
	
	int mainPrint() {
		

		 System.out.println("[ 학생 성적 프로그램 ]");
		 System.out.println("-----------------");
		 System.out.println("1.학생성적입력");
		 System.out.println("2.학생성적출력");
		 System.out.println("3.학생성적수정");
		 System.out.println("4.학생삭제");
		 System.out.println("5.학생검색");
		 System.out.println("6.등수처리");
		 System.out.println("0.프로그램 종료");
		 System.out.println("-----------------");
		 System.out.println("원하는 번호를 입력하세요");
		 int choice = scan.nextInt();	
		return choice;
		
	}
	//1.학생입력 메소드
	int stuInput(int stuCount) {
		 while(true) {
			 int choice = stuAction.mainPrint();
			 
			 
			 
			 switch(choice) {
			 case 1:
				 
				 while(true) {
					 System.out.println();
					 System.out.println("학생입력");
					 System.out.println("%d번째 학생 이름을 입력하세요(0.이전페이지 이동)\n");
					 String name=scan.next();
					 if (name.equals("0")) {
						 System.out.println(">>이전 페이지로 이동합니다");
						 System.out.println();
						 break;
					 }
					 	 System.out.println("국어 점수를 입력하세요");
					 	 int kor = scan.nextInt();
					 	 System.out.println("영어 점수를 입력하세요");
					 	 int eng = scan.nextInt();
					 	 System.out.println("수학 점수를 입력하세요");
					 	 int math = scan.nextInt();
					 	 
					 	 list.add(new StuScore(name,kor,eng,math));
					 	 System.out.printf"%d번째 학생 성적이 저장되었습니다!\n",stuCount);
					 	 
					 }
					 return stuCount;
					 
					 
					
			 }
		 }
		
		 }
		 
		
	}



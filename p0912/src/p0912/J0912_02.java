package p0912;

import java.util.Scanner;

public class J0912_02 {

	public static void main(String[] args) {
		
		
		
	Scanner scan= new Scanner(System.in);
	int stuNo=0;
	String name = "";
	int[] score=new int[3];
		
	int kor=0,eng=0,math=0;
	String[] subject = {"국어","영어","수학"};
	
	StuScore[] s= new StuScore[3];	//배열선언
	
	
	for(int i=0; i<s.length;i++) {
		stuNo=i+1;
		System.out.println("이름을 입력하세요");
		name=scan.next();
		System.out.println("점수을 입력하세요");
		for(int j =0; j<score.length;j++) {
			score[j] =scan.nextInt();
		}
		
		s[i]= new StuScore(stuNo,name,score[0],score[1],score[2]);
	}
	for(int i=0;i<s.length;i++) {
		System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
				s[i].stuNo,s[i].name,s[i].kor,s[i].eng,s[i].math,s[i].total,s[i].avg);
		
	}
		
		
	}
}
		
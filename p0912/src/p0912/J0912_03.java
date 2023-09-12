package p0912;

import java.util.Scanner;

public class J0912_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuScore2 [] s2= new StuScore2[3];
		String[] score2 = new int[3];
		String[] subject = {"국어","영어","수학"};
		int stuNo=0;
		String name="";
		int kor=0,eng=0,math=0;
		
		for(int i=0; i<s2.length;i++) {
			
		}
	    stuNo = i+1;
		System.out.println("이름을 입력하세요");
		name=scan.next();
		    for(int j=0; j<score2.length
		    		;j++) {
		    	System.out.println(subject[i]+"점수를 입력하세요.");
		    	score[j]= scan.nextInt();
		    }
		
		s2[i]= new StuScore2 (stuNo,name,kor,eng,math,total,avg);
		
		
        for(int i=0;i<s2.lenth;i++) {
        	System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
        			s[i].st);
        }
		
	}

}

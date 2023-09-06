package p0906;

import java.util.Scanner;

public class J0906_08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] subject = {"국어","영어","수학"};
	//2차원 배열
		int[][] score = new int[5][3];
		for (int i= 0;i<5;i++) {
			for (int j=0;j<3;j++) {
				System.out.println(subject[j]+"점수를 입력하세요");
				score[i][j] = scan.nextInt();
			}
		}
		
		System.out.printf("%s\t%s\t%s\n",subject[0],subject[1],subject[2]);
		System.out.println("--------------------------");
	
			for (int i= 0;i<5;i++) {
				for (int j=0;j<3;j++) {
					System.out.print(score[i][j]+"\t");
				}
				System.out.println();
		}
		
		
//		int[] arrKor  = new int[5];
//		int[] arrEng  = new int[5];
//		int[] arrMath = new int[5];
//		
//		for(int i=0; i<5; i++) {
//			System.out.println("국어점수를 입력하세요");
//			
			
			
			
			
			
			
		}//main

	}//class



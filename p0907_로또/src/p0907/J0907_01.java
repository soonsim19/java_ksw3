package p0907;

public class J0907_01 {

	public static void main(String[] args) {
		
		int[][] num = new int [5][3];
		
		for (int i=0;i<5;i++) {
			for (int j=0; i<3; j++) {
				num[i][j] = (3*i) +j +i;
			}
		}
		//출력
		for (int i =0; i<5; i++) {
			for (int j=0; j<3; j++) {
				System.out.println(num[i][j]+"\t ");
			}
			System.out.println();
		}
		
		
		
		
//		int[] score = new [10];
//		//score 1-10 숫자입력, 출력
//		for (int i=0; i<10; i++) {
//			score[i] = i;
//		}
//		for (int i=0; i<10; i++) {
//			System.out.println(score[i]);
//		}

	}//main
}//class

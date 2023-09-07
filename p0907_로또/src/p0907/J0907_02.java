package p0907;

import java.util.Scanner;

public class J0907_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// score[5][5] => 1~25까지 숫자를 입력해서 2차원 형태롤 출력
		int[] temp = new int[25];
		int n = 0;
		int[][] score = new int[5][5];
		// 1차원 배열 temp에 1~25 까지 입력
		for (int i = 0; i < temp.length; i++) {
			temp[i] = i + 1;
		}
		// 번호 섞기
		for (int i = 0; i < 200; i++) {
			int random = (int) (Math.random() * 25);
			n = temp[0];
			temp[0] = temp[random];
			temp[random] = n;
		}

		// 입력
//		for (int i =0 ; i<temp.length; i++) {
//			System.out.print(temp[i]+"  ");
//		}
		//score 배열에 섞은 번호 넣기
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
//				score[i][j] = (5*i)+j+1;//
				score[i][j] = temp[(5 * i) + j];
			}
		}

		// 숫자 맞추기 게임 무한반복
		while (true) {
			// 2차원출력
			System.out.println();
			System.out.println("              [숫자 맞추기 게임]");
			System.out.printf(" |\t0\t1\t2\t3\t4\n");
			System.out.println("--------------------------------------------");
			for (int i = 0; i < 5; i++) {
				System.out.print(i + "|\t");
				for (int j = 0; j < 5; j++) {
					System.out.print(score[i][j] + "\t");
				}
				System.out.println();
			}

			System.out.println("-----------------------------------------------");
			System.out.println("원하는 숫자를 입력하세요");
			
			//모든 좌표값과 number값을 비교
			int number = scan.nextInt();
			for(int i=0; i<5;i++) {
				for(int j=0;j<5;j++) {
					if (score [i][j]==number) {
						score[i][j]=0;
						break;
					}
				}
			}
			
			//좌표를 넣어서 해값값을 0으로 변경
//			System.out.println("좌표를 입력하세요 (행)");
//			int input1 = scan.nextInt();
//			System.out.println("좌표를 입력하세요 (열)");
//			int input2 = scan.nextInt();
//
//			// 좌표 위치값을 0으롷 변경
//			score[input1][input2] = 0;

		}//while
		
	}//main
}//class

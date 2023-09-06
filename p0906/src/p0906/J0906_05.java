package p0906;

import java.util.Arrays;
import java.util.Scanner;

public class J0906_05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[45];
		int[] winLotto = new int[6];
		int[] myNum = new int[6];

		// 1~45
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = i + 1;
		} // for

		for (int i = 0; i < 6; i++) {
			System.out.println("로또 번호를 입력하세요 1~45");
			myNum[i] = scan.nextInt();
		}
		Arrays.sort(myNum);

		// 번호섞기
		for (int i = 0; i < 500; i++) {
			int random = (int) (Math.random() * 45);// 0~44
			int temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		} // for
			// 당첨번호 입력
		for (int i = 0; i < 6; i++) {
			winLotto[i] = lotto[i];
		}
		Arrays.sort(winLotto);

		// 번호츌력
		System.out.println("------------------------------------");
		System.out.println("           로또 105호차 번호            ");
		System.out.println("------------------------------------");
		//나위 번호출력
		System.out.print("나의 입력 번호");
		for(int i =  0; i<myNum.length;i++) {
			System.out.print(myNum[i]+ " ");
		}
		System.out.println();
		System.out.print("★당첨번호  ");
		for (int i = 0; i < 6; i++) {
			if (i == 0) {
				System.out.print(winLotto[i]);
				continue;
			}
			System.out.print("," + winLotto[i]);
		}

	}

}

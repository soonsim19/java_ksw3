package p0907;

import java.util.Arrays;
import java.util.Scanner;

public class J0907_09로또연습 {

	public static void main(String[] args) {
		// [ 순서 ]
				//1. 선언
				//2. 로또번호 순차입력
				//3. 로또번호 섞기
				//4. 6개 당첨번호 추출
				//5. 번호직접입력
				//6. 당첨번호출력
				//7. 직접입력한 번호출력
				//8. 당첨개수확인 출력
		Scanner scan=new Scanner(System.in);
		int lotto[]= new int[45];
		int myNum[]= new int[6];
		int winNum[]= new int[6];
		int temp=0, count=0;
//로또 순차입력		
		for(int i=0; i<45;i++) {
			lotto[i]=i+1;
		}
//로또 섞ㄱㅣ
		for(int i=0; i<300;i++) {
		int random = (int)(Math.random()*45);
	    temp = lotto[0];
		lotto[0]= lotto[random];
		lotto[random]=temp;
		}
//당첨번호 추출
		for(int i=0;i<6; i++) {
		winNum[i]=lotto[i];
		}
//번호 입력 받기
		System.out.println("---------------------------------");
		System.out.println("            Lottery");
		System.out.println("---------------------------------");
		for(int i=0;i<6;i++) {
			System.out.printf("%d 번째 번호를 입력하세요",count+1);
			myNum[i] = scan.nextInt();
		}
//당첨번호 츌력
		System.out.println("---------------------------------");
		System.out.println("            ★당첨번호");
		System.out.println("----------------------------------");
		for(int i=0; i<6;i++) {
		System.out.print(winNum[i]);
		}
		
		
		
		
		
	}//main
}//class

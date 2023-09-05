package p0905;

import java.util.Scanner;

public class J0905_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			//Math.random(); //00<=0 x <1.0
			int random =(int)(Math.random()*10)+1;//1부터 10까지 랜던숫자를 생성
			
			//숫자를 입력받아 랜덤숫자를 맞추는 프로그램
			System.out.println("숫자를 입력하세요");
			int num = scan.nextInt();
			
			//입력숫자와 랜덤숫자가 맞는지 비교
			if (random==num) {
				System.out.println("정답");
				break;//반복문을 중간에 종료할때
			}else {
				System.out.println("오답");
				System.out.println("랜덤숫자"+random);
		    }
		}//for	
	    //정답출력
	
	


   }//main
	
}

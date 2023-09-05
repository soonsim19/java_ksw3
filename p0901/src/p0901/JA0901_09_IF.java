package p0901;

import java.util.Scanner;

public class JA0901_09_IF {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int number = scan.nextInt();
		if (number >= 90) {
			System.out.println("A학점");
		} else if ( number >= 80) {
			System.out.println("b학점입니다");
		} else if (number >= 70) {
			System.out.println("c학점입니다");
		} else {
			System.out.println("f학접입니다");
		}
		
		
		

//	    int number = scan.nextInt();
//	    
//	    if(number>=60) {
//	    	System.out.println("합격입니다");
//	    }else {
//	    	System.out.println("불합격입니다ㅏ");
//	    }
//	    
//	    

//	    System.out.println("사원번호를 입력하세요");
//        int number = scan.nextInt();
//        
//        //1001 -> ceo 매출액메뉴를 볼 수 있음
//        
//      System.out.println("[네비게이션 메뉴]");
//      System.out.println( "1.회원정보보기");	
//	  System.out.println("2.상품정보보기");
//	  if(number ==1001) {
//		  System.out.println("회사매출액보기");
//	  }
	}
}

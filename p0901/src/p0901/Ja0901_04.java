package p0901;

import java.util.Scanner;

public class Ja0901_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자2개를 입력하세요");//27-> 2와  7로 분리해야함
        String number  = scan.next();
        
        
        //String 분리
        char ch1 = number.charAt(0); //String에서 해당주소값을 char타입으로 가져옴
        char ch2  = number.charAt(1);
        
        //char탑일을 int타입으로 변경
        int n1 =ch1 - '0';
        int n2 =ch2 - '0';
        int result = n1 + n2;
        
        //char ch3 = '2';
        
        System.out.println(ch1);
	    System.out.println(ch2);
	    System.out.println("두수더하기값 : "+result); 
	    
	    
	}

}

package p0911;

import java.util.Scanner;

public class J0911_08 {

	public static void main(String[] args) {
		
		
			int result =0;
			J0911_08 j = new J0911_08();
			result =  j.addInput();
			System.out.println("결과값: "+result);
			
			
			
			
			
	}//main
//입력 
	//인스턴스 매소드-겍체 선언후 참조변수명. 메소드
	int addInput() {
		int result =0;
		//입록벋고 계산하가
		Scanner scan= new Scanner(System.in);
		System.out.println("첫번째 숫자   ");
	    int a = scan.nextInt();
	    System.out.println("두번째 숫자    ");
	    int b =scan.nextInt(); 
	    result =a+b;
	    
		return result;	
	}
	
	
	
	
	
}

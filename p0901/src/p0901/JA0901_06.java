package p0901;

import java.util.Scanner;

public class JA0901_06 {

	public static void main(String[] args) {
//		
    Scanner scan = new Scanner(System.in);
    System.out.println("숫를 입력하세요");
    int num = scan.nextInt();
    
    int result = num%3;
    
    //조건문
    if(result==0)
    System.out.println("3의배수입니다");
    else
    System.out.println("3의배수가 아닙니다");
    
   System.out.println("입력한 슛자: "+num);
	}

}

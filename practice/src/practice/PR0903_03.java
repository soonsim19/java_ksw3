package practice;

import java.util.Scanner;

public class PR0903_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scan = new Scanner(System.in);
   System.out.println("영문자를 1개를 입력하세요: ");
   String sc = scan.next();
   char ch=sc.charAt(0);
   if ((ch>='a' && ch<='z')) {
	   System.out.println("소문자입니다.");	   
	   
   }else if (( ch>='A'&& ch<='Z')) {
	   System.out.println("대문자입니다.");
   }else {
	   System.out.println("바보");
 }
 
	}

}

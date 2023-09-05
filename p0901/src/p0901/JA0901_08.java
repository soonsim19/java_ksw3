package p0901;

import java.util.Scanner;

public class JA0901_08 {


public static void main(String[] args) {
	
	
	Scanner sca = new Scanner(System.in);
	System.out.println("점수를 입력하세요");
	int score = sca.nextInt();
	String grade = (score>=90)? "A":(score>=80)?"B": (score>=70)?"C":(score>=60)?"D":"병신";
	System.out.println("당신의 학점 : "+ grade);
		
	int i=0;
	i = i+1;
	i += 1; 
	i++;
	++i;
	
	i = i -1;
	i -= 1;
	i--;
	--i;
	
	
	
//	Scanner scan = new Scanner (System.in);
//	System.out.println("점수를 입력하세요");
//	int sco = scan.nextInt();
//	String status = sco>=60?"합격":"불합격";
//	System.out.println("합격여부 :"+status);
	
	
	
}
}
//	Scanner scan= new Scanner(System.in);
//	System.out.println("첫번째 숫자를 입력하세요");
//	int num1 = scan.nextInt();
//	System.out.println("두번째 숫자를 입력하세요");
//	int num2 = scan.nextInt();
//	
//	int result = (num1>=num2)?num1:num2;
//	System.out.printf("1번째 숫자 : %d, 2번째숫자 : %d \n",num1,num2);
//	System.out.println("두수중 큰 수 :"+result);
//}
////	int x = -10;
////	int absX = (x>=0)?x: -x;
////	System.out.println("절대값 :" + absX);
////    System.out.println("입력값 :"+x);
//	}




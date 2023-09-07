package p0907;

import java.util.Scanner;

public class J0907_05 {

	public static void main(String[] args) {
       //주텍복권 1조 12345   1조: 0~9조   번호:00000-99999
		//5-1000원 45 -10000원 etc
		//1-12345 1억
		Scanner scan = new Scanner(System.in);
		
		//1조 - 1-9
//		int firstNo = (int)(Math.random()*10);//0~9
		int fNo = (int)(Math.random()*9)+1;//1~9
		int sNo = (int)(Math.random()*100000); //0~99999
		
		//String.format -> format을 넣어서 String 타입으로 변경
		String strNo= String.format("%05d", sNo);
		String winNo=fNo +"조"+strNo;
		
//		System.out.println(sNo);
//		System.out.println(strNo);
		System.out.printf("당첨번호 : %s\n",winNo);//%d정수 %f실수 %s문자열  %c문자

		//복권 입력
		System.out.println("조 단위를 입력하세요 1-9조");
		int input1 = scan.nextInt();
		
		System.out.println(input1+ "조 00000 5자리입니다");
		System.out.println("뒤 5자리를 입력하세요 00000-99999");
		String input2 = scan.next();
		
		//최종 입력한 번호
		String inputNo = input1 +"조"+input2;
		
		
		int count = 0 ;// 일치횟수
		if(inputNo.charAt(6)==winNo.charAt(6)) {
			count++;
			if(inputNo.charAt(5)==winNo.charAt(5)) {
				count++;
				if(inputNo.charAt(4)==winNo.charAt(4)) {
					count++;
					if(inputNo.charAt(3)==winNo.charAt(3)) {
						count++;
						if(inputNo.charAt(2)==winNo.charAt(2)) {
							count++;
							if(inputNo.charAt(0)==winNo.charAt(0)) {
								count++;
							}
						}
					}
				}
			}
		}
		
		System.out.println("------복권확인------");
		System.out.println("count : "+count);
		System.out.println("입력번호:"+  inputNo);
		System.out.printf("당첨번호 : %s\n",winNo);//%d정수 %f실수 %s문자열  %c문자
		
		if(count==0) 
			System.out.println("꽝");
		else if(count==1) 
			System.out.println("1개 맞췄습니다");
		else if(count==2) 
			System.out.println("2개 맞췄습니다");
		else if(count==3) 
			System.out.println("3개 맞췄습니다");
		else if(count==4) 
			System.out.println("4개 맞췄습니다");
		else if(count==5) 
			System.out.println("5개 맞췄습니다");
		else if(count==6) 
			System.out.println("6개 맞췄습니다");
		
			
			
			
		}//main
		
		
	}//class


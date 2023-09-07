package p0907;

import java.util.Arrays;
import java.util.Scanner;

public class J0907_06로또 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//순서
		//1.선언
		//2.로또 번호 배열에 입력
		//3.로또 번호 섞기
		//4.6개 당첨번호 추출
		//5.번호 직접 입력
		//6.당첨 번호 출력
		//7.직접 입력한 번호출력
		//8.당첨개수 확인 출력
		
		//선언
		int[]  lotto = new int[45];
		int[] myNo = new int[6];
		int[] winNo = new int[6];
		int temp=0, count=0;
		
		//로또번호 순차입력
		for(int i=0;i<lotto.length;i++) {
			lotto[i]=i+1;
		}
		//로또 번호 섞기
		for(int i=0; i<400;i++) {
			int random =(int)(Math.random()*45);
			temp = lotto[0];
			lotto [0] = lotto[random];
			lotto[random]=temp;
		}
		//6개 당청번호 츄츌
		for(int i=0; i<6;i++) {
			winNo[i]=lotto[i];
		}
		 System.out.println();
		 System.out.println(Arrays.toString(winNo));
		    System.out.println("--------------------------------------------");
		    System.out.println("------------------Lottery-------------------");
		    System.out.println("--------------------------------------------");
		    
		//직접입력
		for (int i=0;i<6;i++) {
			System.out.println("로또 번호를 입력하세요");
			myNo[i]= scan.nextInt();
		}
	    System.out.println();
	    System.out.println("--------------------------------------------");
	    System.out.println("--------------------당첨확인------------------");
	    System.out.println("--------------------------------------------");
	    
	    //당첨번호 출력
	    System.out.println("★당첨번호:  ");
	    for (int i=0;i<6;i++) {
	    	System.out.printf("%d  ", winNo[i]);
	    }
	    System.out.println();
	    //직접입력한 번호 출려ㅛㄱ
        System.out.print("입력번호: ");
        for (int i=0;i<6;i++) {
        	System.out.printf("%d  ", myNo[i]);
        }
		System.out.println();
		
		//당첨개수
		for(int i=0;i<6;i++) {
			for (int j=0;j<6; j++) {
				if(winNo[i]==myNo[j]) {
					count++;
					break;
				}
			}
		}
		System.out.println("※");
	}//main
}//class
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
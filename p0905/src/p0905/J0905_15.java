package p0905;

import java.util.Scanner;

public class J0905_15 {

	public static void main(String[] args) {
		int save = new save [10];
		Scanner scan = new Scanner(System.in);
		
		int random = (int)(Math.random()*100)+1;
		int i = 0;
		while (i<10) {
			System.out.println("숫자를 입력하세요");
		    int input = scan.nextInt();
		    save [i] = input;
		    if (random = input) {
		    	System.out.println("정답입니다");
		    	break;
		    }else if (random>input) {
		    	System.out.println("더 큰 수를 입력하세요");
		    }else {
		    	System.out.println("더 작은 수를 입력하세요");
		    }
		    if (i==9);{
		    	break;
		    }
		    i++;
		}//while
		
		}

	}

}

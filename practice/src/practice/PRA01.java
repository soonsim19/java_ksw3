package practice;

import java.util.Arrays;
import java.util.Scanner;

public class PRA01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	//선언부
        int lotto [] = new int[45];
        int winLot [] = new int[6];
        int myNum [] = new int[6];
        
    //  1~45번호 lotto 배열에 입력
        for (int i=0 ; i<45 ; i++) {
        	lotto [i] = i;
        }
     //  번호섞기
        for (int i=0 ; i<300 ; i++) {
        	int random = (int)(Math.random()*45);
        	int temp = lotto[0];
        	lotto[0] = lotto[random];
        	
        }
	}//main

}//class


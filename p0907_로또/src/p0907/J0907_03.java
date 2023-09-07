package p0907;

import java.util.Arrays;

public class J0907_03 {

	public static void main(String[] args) {
	    int[] num = {1,2,3,4,5};
	    int[] score = new int[5];
	    
	    //score = num; 얕은 복사, 주소 복소
	    //1. 배열 복사 방법 = 데이터 전체 값을 다른 장소에 복사
//	    for (int i=0; i<num.length;i++) {
//	    	score[i]= num[i];
//	    }
	    //2.배열 복사밥법
	      //1)원본배열 2)위치 3) 복사대상배열 4)위치 5)복사개수
	    System.arraycopy(num, 1,score,0,3);
	    
	    num[0]=10;
	    
	    System.out.println(Arrays.toString(score));

	}

}

package p0905;

public class J0905_10 {

	public static void main(String[] args) {
		// 규규던 for 뮨 규현하시요
		for (int i = 2; i <= 9; i++) {

			for (int j = 1; j<= 9; j++) {
				if (j % 2 == 0) {
					continue;
				}//if
				System.out.printf("%d * %d = %d \n",i , j ,(i * j));
			}//for

		}//for

	}// main

}// class

//		// TODO Auto-generated method stub
//		
//		for(int i=1; i<=10; i++) {
//			if(i%3==0) {
//		
//	          continue;	//1번 멈춤		
//			}
//			System.out.println(i);
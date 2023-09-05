package p0905;

public class J0905_07 {

	public static void main(String[] args) {
		// 1-100까지 순번과 합을 출력하세요
		//for문
		//while문
		int i=0, sum=0;
		
		i=1;
		while(i<=100) {
			sum=sum+i;
			System.out.println("순번 :"+ i + ",    합계 :"+sum);
			i++;
		}
//		for( i =1; i<=100; i++) {
//			 sum = sum + i;
//			System.out.println("순번"+ i + "합계"+sum);
//		}

	}

}

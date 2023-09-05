package p0904;

public class J0904_11 {

	public static void main(String[] args) {
		//1부터 100까지의 합이 200을 넘는 때는 언제 일까요? i와sum을 출력하세요
		int i=0,sum=0;
		for(i=1; i<=100; i++) {
			sum = sum +i;
			if (sum>=200) {
				System.out.printf("1부터 %d까지 귀요미 ",i);
				System.out.println(sum);
				break;
			}
		}
		
		
		
		
		
		
		//1부터 100까장 합을 출력하시요
//		int i = 0,sum=0;
//		
//		for (i=1; i<=55; i++) {
//			sum = sum+i;//100까지 반복해서 합을 구하는 식
//		}
//		System.out.printf("1부터 %d까지의 합계 :\n ",i-1,+sum);
//		
//		
//		
		
		
//		int i = 0;
//		long sum = 0;
//		
//		for( i =1;i<=100; i++) {
//			
//			System.out.println(i);
//            sum = sum + i;		
//		
//		}
//		
//		System.out.println("for 문 밖:"+i);
//		System.out.println("for문 밖"+sum);
	}
	
	

}


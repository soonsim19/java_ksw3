package p0905;

public class J0905_02 {

	public static void main(String[] args) {
		//1부터 10까지의 순번과 합으 ㄹ출력하시요
		
		int i = 0;
		int sum = 0;
		
		for(i=1; i<=10; i++) {
			sum = sum + i;
			System.out.printf("순번 : %d,",i);
            System.out.println("합계 : "+sum);		
            if (sum>=200) {
            	break;
            }
		
		}
		
		System.out.printf("정답 : %d,%d \n",i,sum);
		System.out.printf("그전단계 : %d,%d \n", i-1,sum-1);
	}

}

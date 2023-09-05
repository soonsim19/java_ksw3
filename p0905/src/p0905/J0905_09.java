package p0905;

public class J0905_09 {

	public static void main(String[] args) {
		
		int i=0;
		int sum=0;
		while(true) { //무한 반복
			if(sum>20 ) {
				break;
			}
		i++;
		sum = sum +i;
		}
		sum=0;
		for(i=1;i<=100;i++) {
			sum = sum+i;
			break;
		}
			System.out.println("i2: "+1);
			System.out.println(sum);
		
		}
		
		
		
		
		
		
//	  int i=10;
//	  do {
//		  System.out.println(i);
//		  
//	  }while (i>0);

	}



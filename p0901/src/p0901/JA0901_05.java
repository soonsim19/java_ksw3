package p0901;

public class JA0901_05 {

	public static void main(String[] args) {
		
		int num =12345;
		int result = 12345;
		
				
	      double pi = 3.141592;
	      double shortPi = (int)(pi*1000)/1000.0;
	      System.out.println("pi:" +pi);
	      System.out.println("shortPi :0"+shortPi);
	
	      double d = 124.15235678;
	      double d1 = (int)(d*10000)/10000.0;
	      System.out.println("d: "+ d);
	      System.out.println("d1 :"+ d1);

	       double a = 2364.12121234;
	       double a2 = (int)(a*100)/100.0;
	       System.out.println("a :"+a);
	    
	       
	       System.out.println("a2 : "+a2);
	      //소수점 첫째자리에서 반올림, 올림,내림 결정 
	      //Math.round()-반올림, Math.ceil()-올림, Math.floor()-버림
	       double n = 12.598;
	       double n2= 2.321;
	       System.out.println(Math.round(n));//소수점 첫째자리 반올림
	       System.out.println(Math.ceil(n2));       
	       System.out.println(Math.floor(n));//t 
	       //소수점 둘째 자리 반올림
	       double n3 =Math.round(n*10)/10.0;
	       System.out.println("둘째자리반올림 :"+n3);
	       //소수점 네째자리 반올림
	       double x = 156.7854294;
	       double x2 =Math.round(x*1000)/1000.0;
	       System.out.println("네째자리 반올림:"+x2);
	       
	       
	       
	}
//	}

}

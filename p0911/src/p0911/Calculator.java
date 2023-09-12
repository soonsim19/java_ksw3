package p0911;

public class Calculator {
Calculator(){}
	public static void main(String[] args) {
      Cal1 c1 = new Cal1();
      c1.value =10;
      System.out.println(c1.value);
      Cal2 c= new Cal2();
      Cal2 c2 = new Cal2(10);
      //c2.value=10생략
      System.out.println(c2.value);
	}//main

}//class

class Cal1{
	int value;
	
}
class Cal2{
	int value;
		
		Cal2() {}
		Cal2(int x){
			value=x;
		
		}
	}

package p0912;

public class J09012_14 {

	public static void main(String[] args) {
      Car c1 = new Car();
      c1.color ="red"; 
      System.out.println("c1.color:"+c1.color); 
      
     
      Car c2= new Car(c1);
      System.out.println("c2.color:"+c2.color);
      c2.color="pink";
      System.out.println("다시 호출 :"+c1.color);
      System.out.println("다시 호출 :"+c2.color);
	}

}

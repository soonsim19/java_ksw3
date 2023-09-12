package p0912;

public class Child extends  Parent{
 int x=20;
 void method(int x) {
	 
	 System.out.println("x: "+x);
	 System.out.println("this.x: "+this.x);
	 System.out.println("super.x"+super.x);
 }
		 
}

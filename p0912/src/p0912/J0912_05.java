package p0912;

public class J0912_05 {

	public static void main(String[] args) {
Product p1 = new Product();
p1.pName="led55";
p1.price=50;
Product p2 = new Product();
p2.pName="led60";
p2.price=100;
Product p3 = new Product("led70",200);
Product p4 = new Product();
Product p5 = new Product();

System.out.println("p1번호:"+p1.serialNo);
System.out.println("p1제품이름:"+p1.pName);
System.out.println("p1번호:"+p1.serialNo);
System.out.println("p1번호:"+p1.serialNo);
	}

}

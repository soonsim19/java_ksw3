package p0911;

public class J0911_06 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x =10;
		System.out.println("d.x " + d.x);
		
	}
//
static void change(int x) {
	x=1000;
	System.out.println("메소드 x :" + x);
}
}//class


	

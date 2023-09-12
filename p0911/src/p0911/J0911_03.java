package p0911;

public class J0911_03 {
	public static void main(String[] args) {

		String shape[] = { "Heart", "Spade", "Diamond", "Clover" };
		Card[] c = new Card[52];//카드 넣을 배열 생성
		for(int i = 0; i<c.length; i++) {
		    c[i] = new Card();//객체 선언
			c[i].kind = shape[i/13];
			c[i].number = i%13+1;
			c[i].cardPrint();
		}
System.out.println( "카드 숫자 합");
   //int result = J0911_05.add(c[0].number,c[5].number);
   //System.out.println(result);
	
	}
}

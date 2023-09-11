package p0911;

public class J0911_02 {

	public static void main(String[] args) {
		
	 String[] shape = {"heart","Spade","Diamond","Clover"};
	  Card[] c = new Card[4];
	  for (int i = 0; i<c.length;i++) {
		  Card c1 = new Card();//객체 손온_ 참조변수명.변수명
	       c1.kind ="heart";
	       c1.number =1;
	       c[i].cardPrint();
	       
	  }
	
       Card c1 = new Card();//객체 손온_ 참조변수명.변수명
       c1.kind ="heart";
       c1.number =1;
       System.out.printf("kind : %s,number :%d\");
       
       
       String kind  = "heart";
       int number =1;
       
	}

}

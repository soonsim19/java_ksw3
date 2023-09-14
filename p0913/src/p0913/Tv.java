package p0913;

public class Tv extends Product{
     String size;
     
     Tv(){
    	 this("삼성70",1000000,10000,"70");
     }
     
     Tv(String pName,int price,int bonusPoint,String size){
    	 this.pName = pName;
    	 this.price = price;
    	 this.bonusPoint = bonusPoint;
    	 this.size = size;
    	 
     }
}

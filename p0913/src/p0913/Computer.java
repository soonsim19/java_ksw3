package p0913;

public class Computer extends Product
{
	String cpu;
	
	Computer() {
		this("LG컴푸터16",2000000,20000,"i5-1240p");
	}
	
	Computer(String pName, int price, int bonusPoint, String cpu){
		this.pName =pName;
		this.price =price;
		this.bonusPoint=bonusPoint;
		this.cpu= cpu;
	}
	

}

package p0913;

public class Audio extends Product {
	
	String speakerPower;
	
	Audio(){
		this("브릿지스피커7800",200000,2000,"15W");
		
	}
	
	Audio( String pName, int price, int bonusPoint,String speakePower){
		this.pName =pName;
		this.price= price;
		this.bonusPoint=bonusPoint;
		this.speakerPower=speakerPower;
		
	}

}

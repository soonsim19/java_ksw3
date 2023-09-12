package p0912;

public class Car {
	String color;
	String gearType;
	int door;
	
	Car(){
		this("white","auto",5);				
	}
	Car(Car c){  //객체 복사하는 법
		this(c.color,c.gearType,c.door);
	}
	
	Car(String color, String gearType, int door){
		this.color =color;
		this.gearType =gearType;
		this.door =door;
	}

}

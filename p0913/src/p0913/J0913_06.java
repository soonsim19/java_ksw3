package p0913;

public class J0913_06 {

	public static void main(String[] args) {
		FireEngine f1 = new FireEngine();
		f1.go();
		f1.stop();
		f1.water();
		Ambulance a1 = new Ambulance();
		a1.go();
		a1.stop();
		a1.siren();
		
		Car c1 =  new FireEngine();
		c1.go();
		c1.stop();
				
		
		Car c2 = new Ambulance();
        c2.go();
		c2.stop();
		
		Car c3;
		
		c3=f1;
		
		FireEngine f2;
		f2=(FireEngine)c3;
		System.out.println("f2 :");
		f2.water();
		
		
		Ambulance a2;
		FireEngine f3;
		if(c3 instanceof FireEngine) {
		   System.out.println("c3는FireEngine으로 형변환가능합니다.");
		   f3=(FireEngine)c3;
		   f3.water();
		}
		if(c3 instanceof Ambulance) {
			System.out.println("c3는Ambulance으로 형변환 가능합니다");
			a2=(Ambulance)c3;
			a2.siren();
		}
		Object o1;
		o1 = f1;
		o1 = a1;
		
	}

}

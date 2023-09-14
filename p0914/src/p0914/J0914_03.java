package p0914;

public class J0914_03 {

	public static void main(String[] args) {
		Car c;// 주소값만 존재

		FireEngine f1 = new FireEngine();

		System.out.println("[f1기능]");
		f1.go();
		f1.stop();
		f1.water();

		c = f1;
		Ambulance a1 = new Ambulance();
		c = a1;

		System.out.println("[c 기능]");
		c.go();
		c.stop();

		FireEngine f2;// 주소값
		Ambulance a2;
		if (c instanceof FireEngine) {
			System.out.println("[f2기능]");
			f2 = (FireEngine) c;
			f2.go();
			f2.stop();
			f2.water();
		}

		if (c instanceof Ambulance) {
			a2 = (Ambulance) c;
			a2.go();
			a2.stop();
			a2.siren();
		}

	}

}

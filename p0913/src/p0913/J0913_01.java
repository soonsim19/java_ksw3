package p0913;

public class J0913_01 {

	public static void main(String[] args) {

		Deck d = new Deck();

		d.shuffle();
		for (int i = 0; i < 5; i++) {
			System.out.println(d.pick(i + 1));
		}
	}
}

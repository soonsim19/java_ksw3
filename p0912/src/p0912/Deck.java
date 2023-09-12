package p0912;

public class Deck {

	String[] shape = { "heart", "spade", "diamond", "clover" };
	Card[] c = new Card[52];

	Deck() {
		for (int i = 0; i < c.length; i++) {
			c[i] = new Card();
			c[i].kind = shape[i / 13];
			c[i].number = (i % 13) + 1;
		}
	}// Deck

	Card pick(int no) {
		if (no > 52) {
			System.out.println("숫자를 잘못선택");
			return c[no % 52];
		}
		return c[no];

	}

	Card pick() {
		int random = (int) (Math.random() * 52);
		return c[random];
	}

	void shuffle() {
		Card temp;
		for (int i = 0; i < 1000; i++) {
			int random = (int) (Math.random() * 52);
			temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}

	}// for

	void cardPrint() {
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}

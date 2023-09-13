package p0913;

public class Deck {
	String[] shape = { "heart", "diamond", "spade", "clover" };
	Card[] c = new Card[52];

	// 카드 입력
	Deck() {
		for (int i = 0; i < c.length; i++) {
			c[i] = new Card();
			c[i].kind = shape[i / 13];
			c[i].number = i % 13 + 1;
		}
	}

	void shuffle() {
		Card temp;
		for (int i = 0; i < 1000; i++) {
			int random = (int) (Math.random() * 52);
			temp = c[0];
			c[0] = c[random];
			c[random] = temp;
		}
	}

	Card pick(int no) {
		return c[no];
	}

}// class

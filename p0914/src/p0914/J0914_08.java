package p0914;

import java.util.ArrayList;

public class J0914_08 {

	public static void main(String[] args) {
		Card[] c = new Card[4];

		c[0] = new Card("Spade", 1);
		c[1] = new Card("Heart", 1);
		c[2] = new Card("Diamond", 1);
		c[3] = new Card("Clover", 1);

		for (int i = 0; i < c.length; i++) {
			System.out.printf("[%s,%d]\n", c[i].kind, c[i].number);
		}
		System.out.println("-------------------------------");
		ArrayList list = new ArrayList();
		list.add(new Card("Spade", 1));
		list.add(new Card("Heart", 1));
		list.add(new Card("Diamond", 1));
		list.add(new Card("clover", 1));
		list.add(new Card("Spade", 2));
		list.add(new Card("Spade", 3));
		list.add(new Card("Spade", 4));
		list.add(new Card("Spade", 5));
		list.add(new Card("Spade", 6));
		list.add(new Card("Spade", 7));
		list.add(new Card("Spade", 8));
		list.add(new Card("Spade", 9));

		for (int i = 0; i < list.size(); i++) {
			Card ca = (Card) list.get(i);
			System.out.printf("[%s,%d]\n", ca.kind, ca.number);
		}

	}

}

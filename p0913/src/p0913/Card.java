package p0913;

public class Card {
	String kind;
	int number;
	String[] cardShape = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "Q", "K" };

	public String toString() {
		return String.format("[%s %s]", kind, cardShape[number]);

	}

}

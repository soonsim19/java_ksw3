package p0912;

public class Card {
	String kind;
	int number;
	String[] CardShape={"0","1","2","3", "4","5","6","7","8","9","10",
	"J","q","k"};
		
	//J-11, Q-12,K-13
    public String toString() {
        return String.format("[%s,%s]", kind,CardShape[number]);   
    }

}

package p0913;

public class J0913_04 {

	public static void main(String[] args) {
         Time t = new Time();
//         t.hour =13;
//         t.minute =13;
//         t.second =13;
         t.setHour(13);
         t.setMinute(13);
         t.setSecond(13);
         
         System.out.printf("%d시%d분%d초 \n", t.getHour(),t.getMinute(),t.getSecond());
	}

}

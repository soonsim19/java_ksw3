package p0913;

public class Time {
 private int hour;
 private int minute;
 private int second;
 
 public int getHour() {
	 return hour;
 }
 public void setHour(int hour) {
	 if(hour<0||hour>23) {
		 System.out.println("값이 잘못 입력되었습니다");
		 return;
	 }
     this.hour=hour;	 
 }
 public int getMinute() {
	 return minute;
 }
 public void setMinute(int minute) {
	 this.minute=minute;	 
 }
 public int getSecond() {
	 return second;
 }
 public void setSecond(int second) {
	 this.second=second;	 
 }

 
 
}

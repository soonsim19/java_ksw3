package p0913;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class j0913_02 {

	public static void main(String[] args) {

		 Scanner scan = new Scanner(System.in);
		 int[] a = {1,2,3,4,5};
	     System.out.println(Arrays.toString(a));
	     
	     Date today = new Date();
	     System.out.println(today);
	     SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	     System.out.println(sdf.format(today));
	     
	     Calendar cal = Calendar.getInstance();
	     SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy년MM월dd일 hh시mm분ss초");
	     System.out.println(sdf3.format(cal.getTime()));
	
	
	}
	
	
}

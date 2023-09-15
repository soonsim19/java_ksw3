package p0915_학생성적;

import java.util.Scanner;

public class J0915_02 {
	
 public static void main(String[] args) {
	
	 Scanner scan = new Scanner(System.in);
	 StuAction stuAction = new StuAction();
	
	 while(true) {
		 
	 int choice = stuAction.mainPrint();
	 
	 
	 
	 switch(choice) {
	 case 1:
		 
		 stuCount =stuAction.stuInput(stuCount);
		 break;
		 }
	 case 2:
		
		 
		 stuAction.stuOutput();
		 break;
		 
		 
		 
		 
		 
	
	 }
	 
	 }//while 
	 
}  
 
	
	
	
	
	
}

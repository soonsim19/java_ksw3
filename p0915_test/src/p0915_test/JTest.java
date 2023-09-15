package p0915_test;

import java.util.Scanner;

public class JTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StuAction stuAction = new StuAction();
		int stuCount = 1;

		while (true) {
			int choice = stuAction.mainPrint();
			switch (choice) {

			case 1:
				stuCount = stuAction.mainPrint();

			}
		}
	}
}

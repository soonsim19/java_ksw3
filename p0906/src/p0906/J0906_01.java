package p0906;

public class J0906_01 {

	public static void main(String[] args) {
		int[] num = new int[50];
		int[] random = new int[5];

//	  int random[0] = (int)(Math.random()*50);//0~49
//	  int random[1] = (int)(Math.random()*50);//0~49
//	  int random[2] = (int)(Math.random()*50);//0~49
//	  int random [3]= (int)(Math.random()*50);//0~49
//	  int random [4]= (int)(Math.random()*50);//0~49
//	  
		for (int i = 0; i < 5; i++) {
			random[i] = (int) (Math.random()) * 45;
		}
		for (int i = 0; i < num.length; i++) { // num[0], num[1]....num[44]
			num[i] = 2 * i + 1;
		}

		for (int i = 0; i < 10; i++) {
			System.out.println(num[i]);
			System.out.println("랜덤 뽑기:" + num[random[i]]);
		}
	}
}
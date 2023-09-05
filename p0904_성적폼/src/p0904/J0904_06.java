package p0904;

public class J0904_06 {

	public static void main(String[] args) {
		double temp = Math.random();//round(),ceil(),floor()
		int num =  (int)(Math.random()*10)+1;
		// 1부터 100까지 랜덤 정수 값
		int num2 = (int)(Math.random() * 100)+1;
		//1qbxh 50까지 랜덤 정수 값
		int num4 = (int)(Math.random() *50)+1;
		//0무터 9999까지 랜덤정수 값\
		int num6 =(int)(Math.random()*10000);
		//1~20
		int num7 = (int)(Math.random()*20)+1;
		
	
		
		System.out.println("난수값 : "+temp);
        System.out.println("랜덤정수 값: "+ num);
	}

}

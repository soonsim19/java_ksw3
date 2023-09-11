package p0911;

public class J0911_01 {
	
	int num = 0;//인스턴스 변수
	static int number =0;
	
public static void main(String[] args) {
	//boolean,char,byte, short, int, long, float,double타입'
	//1.(기본형 타입)변수이름에 데이터를 집겁 저장
	long l=0;
	double d = 0.5;
	
	//2.배열-변수 이름에 주소값을 저장
	int[] n = new int[3];
	//베열의 각[[ 변수 이름에 ㄷ ㅔ이터를 직접 정장
	
	//3.객체 -변수 이름에 주소 값을 저장
	J0911_01 j = new J0911_01();
	
	//객체의 변수 이름에 데이터를 직접정장
	j.num =0;//참조변수명.변수명
	
	
	
}//main

}//class

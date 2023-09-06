package p0906;

import java.util.Scanner;

public class J0906_03 {

	public static void main(String[] args) {
		// arrKor 5개 짜리 배열생성 점수 입력 후 츨력
		Scanner scan = new Scanner(System.in);
		int count =0; //입력된 학생수
		String[] name = new String[10];
		int[] arrKor = new int[10];
		int[] arrEng = new int[10];
		int[] arrMat = new int[10];
		int[] total = new int[10];
		double[] avg = new double[10];
		//입력부분
		for (int i = 0; i < name.length; i++) {
			System.out.println((i + 1) + "번째 이름을 입력하세요.(중지하려면 0입력)");
			name[i] = scan.nextLine(); //"0" String
			if(name[i].equals("0")) {
				System.out.println("입력을 중지합니다");
				break;
			}
			
			System.out.println((i + 1) + "번째 국어 점수를 입력하세요.");
			arrKor[i] = scan.nextInt();
			System.out.println((i + 1) + "번째 영어 점수를 입력하세요.");
			arrEng[i] = scan.nextInt();
			System.out.println((i + 1) + "번째 수학 점수를 입력하세요.");
			arrMat[i] = scan.nextInt();
			scan.nextLine();
			total[i] = arrKor[i]+arrEng[i]+arrMat[i]; //합계입력
			avg[i] =total[i]/3.0;  // 평균입력double로 타입 변경
			
			count++;
		} // for
		//출력부분
		System.out.println();
		System.out.println("[  학생 성적표  ]");
		System.out.printf("번호\t이름\t국어\t영어\t수학\t합계\t평균\n");
        System.out.println("------------------------------------------------------------------");
        for(int i=0; i<count; i++) {
        System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%.2f\n",i+1,name[i],arrKor[i],arrEng[i],arrMat[i],total[i],avg[i]);
	    }
	}//main
}//class

package p0904;

public class J0904_08 {

	public static void main(String[] args) {
		int num = 6;
		switch (num) {
		case 1:
			System.out.println("sk");
			break;

		case 7:
			System.out.println("sk");
            break;
		case 6:
		case 8:
			System.out.println("kt");
            break;
            
		default:
			System.out.println("n/a");
			break;
		}//switch
		
	if (num==1||num==7 ) {
		System.out.println("sk");
	}else if (num==6 || num==8) {
		System.out.println("kt");
	}else { 
		System.out.println("n/a");
	}
	}

}

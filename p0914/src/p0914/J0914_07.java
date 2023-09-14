package p0914;

import java.util.ArrayList;
import java.util.Scanner;

public class J0914_07 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String id="";
		String pw="";
		
		
		 ArrayList list = new ArrayList();
		 
		 Member m = new Member("aaa","1111","홍길동","서울","010-111-1111");
			list.add(m);
			Member m2 = new Member("bbb","2222","유관순","부산","010-222-2222");
			list.add(m2);
			Member m3 = new Member("ccc","3333","이순신","대구","010-333-3333");
			list.add(m3);
			Member m4 = new Member("ddd","4444","강감찬","인천","010-444-4444");
			list.add(m4);
			Member m5= new Member("eee","5555","김구","광쥬","010-555-5555");
			list.add(m5);
			
			System.out.println("아이디를 입력하세요");
			id=scan.next();
			System.out.println("패스원드를 입력하세요");
			pw=scan.next();
			
			Member tempM=(Member)list.get(0);
			String tempId =tempM.getId();
			String tempPw =tempM.getPw();
			if(id.equals(tempId)) {
				if(pw.equals(tempPw)) {
					System.out.println("로그인이 되었습니다");
				}
			}
			
	}

}

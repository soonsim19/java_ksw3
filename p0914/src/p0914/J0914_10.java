package p0914;

import java.util.ArrayList;

public class J0914_10 {

	public static void main(String[] args) {

		
		ArrayList list = new ArrayList();
		
		list.add(new Member("aaa","1111","홍","설","010-111-1111"));
		list.add(new Member("bbb","2222","유","부","010-222-2222"));
		list.add(new Member("ccc","1111","홍","설","010-333-3333"));
		list.add(new Member("ddd","1111","홍","설z","010-444-4444"));
		list.add(new Member("eee","1111","홍","설","010-555-5555"));
		for(int i=0; i<list.size();i++) {
	    	 Member mm =(Member)list.get(i);
	 		System.out.printf("%s , %s,%s,%s,%s",mm.getId(),mm.getPw(),mm.getName(),mm.getAddress(),mm.getPhone());
	 		    
	}
	}
}

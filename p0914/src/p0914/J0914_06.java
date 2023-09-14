package p0914;

import java.util.Scanner;
import java.util.ArrayList;


public class J0914_06 {
	
	public static void main(String[] args) {
		
    Scanner scan = new Scanner(System.in);
    String id="";
    String pw="";
    
    MemberAll memberAll = new MemberAll();
    ArrayList list= m.memberRead();
    
    
    
    while(true){
    	System.out.println("아이디를 입력하세요");
    	id = scan.next();
    	System.out.println("패스워드를 입력하세요");
    	pw =scan.next();
    	for(int i=0; i<list.size();i++) {
    		
    	}
    }









   
	
	}

}

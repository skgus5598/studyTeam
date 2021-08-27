package raina;

import java.util.ArrayList;
import java.util.Scanner;

public class CreateAcc {
	
	Scanner sc = new Scanner(System.in);
	ArrayList arrId = new ArrayList();
	ArrayList arrPw = new ArrayList();
	
	public void createAcc() {
		System.out.print("가입할 아이디 입력 : ");
		String id = sc.next();
		if(!arrId.contains(id)) {
			arrId.add(id);
			System.out.print("가입할 비밀번호 입력 : ");
			String pw = sc.next();
			arrPw.add(pw);
			System.out.println(id+"님, 회원가입이 완료되었습니다!");
		} else {
			System.out.println("\n이미 존재하는 아이디 입니다!");
		}
	}
	

}

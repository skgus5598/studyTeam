package raina;

import java.util.ArrayList;
import java.util.Scanner;


public class CreateAcc implements CreateAccI {

	Scanner sc = new Scanner(System.in);
	ArrayList arrId = new ArrayList();// 회원가입한 아이디들을 담아놓을 배열 생성
	ArrayList arrPw = new ArrayList();// 비밀번호를 담아놓을 배열 생성

	@Override
	public void 회원가입() {
		System.out.print("가입할 아이디 입력 : ");
		String id = sc.next();
		if (!arrId.contains(id)) { // 아이디배열에 입력한 아이디가 포함되어있지 않다면!
			arrId.add(id); // 배열에 입력한 아이디를 넣어라!
			System.out.print("가입할 비밀번호 입력 : ");
			String pw = sc.next();
			arrPw.add(pw);		
			회원가입인사말();
		}else {
			System.out.println("이미 등록된 아이디입니다!");
		}
	}


	@Override
	public void 회원가입인사말() {
		System.out.println( "회원가입을 축하합니다!");
	}
}



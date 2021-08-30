package mainClass;

import java.util.Scanner;

import login.Login;

public class MainClass {

	public static void main(String[] args) {

		Login login = new Login();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.회원가입 2.로그인 3.시간\n");
		System.out.print("숫자 입력 : ");
		int i = sc.nextInt();
		
		switch(i) {
		
		case 1 :break;
		case 2 :System.out.print("아이디 입력 : ");
				login.setLoginId(sc.next());
				System.out.print("비밀번호 입력 : ");
				login.setLoginPw(sc.next());
				login.loginFunc();
				break;
		case 3 :break;
		
		}
	}

}

package mainClass;

import java.util.Scanner;

import login.Login;
import raina.CreateAcc;
import raina.CreateAccI;

import timeFunction.TimeFunction;

public class MainClass {

	public static void main(String[] args) {

		Login login = new Login();
		TimeFunction time = new TimeFunction();
		CreateAccI ca = new CreateAcc();
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n1.강동원(시간) 2.김도윤(로그인) 3.김나현(회원가입)\n");
			System.out.print("숫자 입력 : ");
			int i = sc.nextInt();

			switch(i) {

			case 1:
				time.display();
				break;
			case 2:login.loginFunc();
				break;
			case 3:
				ca.회원가입(); // 회원가입 메서드 실행!
				break;

			}

		}
	}
}

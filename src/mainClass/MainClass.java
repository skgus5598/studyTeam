package mainClass;

import java.util.Scanner;

<<<<<<< HEAD
import raina.CreateAcc;
import raina.CreateAccI;
=======
import timeFunction.TimeFunction;
>>>>>>> b85f130774a9e477ed9c57cb3cbdd08320ff2c1d

public class MainClass {

	public static void main(String[] args) {
		TimeFunction time = new TimeFunction();
		Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
		CreateAccI ca = new CreateAcc();

		while (true) {
			System.out.println("\n1.강동원 2.김도윤 3.김나현\n");
			System.out.print("숫자 입력 : ");
			int i = sc.nextInt();

			switch (i) {

			case 1:
				break;
			case 2:
				break;
			case 3:
				ca.회원가입(); //회원가입 메서드 실행!
				break;

			}
=======
		
		System.out.println("1.강동원 2.김도윤 3.김나현\n");
		System.out.print("숫자 입력 : ");
		int i = sc.nextInt();
		
		switch(i) {
		
		case 1 : time.display(); break;
		case 2 : break;
		case 3 : break;
		
>>>>>>> b85f130774a9e477ed9c57cb3cbdd08320ff2c1d
		}
	}

}

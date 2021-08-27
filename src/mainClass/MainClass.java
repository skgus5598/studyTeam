package mainClass;

import java.util.Scanner;

import timeFunction.TimeFunction;

public class MainClass {

	public static void main(String[] args) {
		TimeFunction time = new TimeFunction();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.강동원 2.김도윤 3.김나현\n");
		System.out.print("숫자 입력 : ");
		int i = sc.nextInt();
		
		switch(i) {
		
		case 1 : time.display(); break;
		case 2 : break;
		case 3 : break;
		
		}
	}

}

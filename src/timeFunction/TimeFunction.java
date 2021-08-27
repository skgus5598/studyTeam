package timeFunction;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TimeFunction extends TimeAll{ //시간에 관한기능을 오버라이딩 합니다.
	public TimeFunction() {}
	
	public void display() { //시간 기능의 화면을 보여주는 곳입니다.
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1. 현재시간보기(Calender) 2. 현재시간보기(Date) 3. 심호흡 기능");
			int num = sc.nextInt();
			switch(num) {
			case 1: calender(); break;
			case 2: newDate(); break;
			case 3:
				System.out.print("심호흡할 분을 입력하세요 : ");
				int time = sc.nextInt();
				breathTime(time);
				break;
			}
		}
	}
	
	
	@Override //이곳에서 밑에 있는 TimeAll기능인 calender를 오버라이딩하여 수정합니다.
	public void calender() {
		System.out.println("Calender는 simpleFormat이 불가능합니다 시도는 해봤는데 클래스형태가 달라서 안됩니다.");
		System.out.println("우리가 원하는 시간으로 표시하기 위해서는 그냥 Date 객체를 써서 반환하세요");
		System.out.println();
		System.out.print("현재시간 : ");
		super.calender();
	}

	@Override //이곳에서는 format된 시간을 보여줍니다. 형식 yyyy년 MM월 dd일 aa hh시 mm분 ss시
	public void newDate() {
		System.out.println("이렇게 활용하게 되면 내가 원하는 시간을 형식에 맞게 포멧을 시켜줄수 있는 ");
		System.out.println("simpleDateFormat을 사용해서 오버라이딩시켜서 글을 표현하였습니다.");
		System.out.println();
		System.out.print("현재 시간 : ");
		super.newDate();
	}

	@Override //심호흡 기능입니다 하지만 이곳에는 오류가 있습니다. 한번 이곳은 같이 생각해보면 좋을거 같아요
	public void breathTime(int time) {
		
		super.breathTime(time);
	}
	
	
	
	

}

class TimeAll {
	/*
	 Calendar 클래스는 추상 클래스로 제공되어서 생성자를 사용하여 인스터스를 생성할 수 없습니다. 
	 Calendar 클래스에서 static 메서드로 제공하고 있는 getInstance() 메서드를 통해서 
	 인스턴스를 생성합니다. 
	 */
	private Date date;
	private SimpleDateFormat simple;

	public void calender() {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		System.out.println(date);		
	}
	public void newDate() {
		date = new Date();
		simple = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss시");
		System.out.println(simple.format(date));
	}
	public void breathTime(int time) {
		for(int i=0; i<time; i++) {
			this.newDate();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}



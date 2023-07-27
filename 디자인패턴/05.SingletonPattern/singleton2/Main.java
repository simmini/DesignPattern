package singleton2;

import java.util.concurrent.ArrayBlockingQueue;


public class Main {

	public static void main(String[] args) {
		//이렇게 클래스 생성자에 접근할수 없음
		//King king=new King();
		
		King king =King.getInstance();//객체한번만 생성됨 
		king.say();
		
		King king2=King.getInstance();
		if(king==king2) { //동일한 객체라 한개만 same으로 나옴
			System.out.println("Same Object");
		}else {
			System.out.println("Different Object");
		}
		
	}
	
}

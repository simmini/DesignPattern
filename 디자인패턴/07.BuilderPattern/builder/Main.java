package builder;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		
		Car car1=new Car("V7",true,"Black",true,false);
		
		//builder객체를 이용해서 car객체 생성
		Car car2=new CarBuilder()
				.setAEB(false)
				.setAirbag(false)
				.setCameraSencor(true)
				.setColor("white")
				.setEngine("V9")
				.build();

		
		CarBuilder builder=new CarBuilder()
				.setAEB(false)
				//.setAirbag(false)
				.setCameraSencor(true)
				.setColor("red")
				.setEngine("V10");
				//.build();
	
	Random rd=new Random();
	
	Car car3=builder
			.setAirbag(rd.nextInt(2)==0)//50프로 확률로 에어백 장착
			.build();
	
	
	System.out.println(car1);
	System.out.println(car2);
	System.out.println(car3);
	
	}

}

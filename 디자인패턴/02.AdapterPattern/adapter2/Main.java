package adapter2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Animal> animals=new ArrayList<Animal>();
		animals.add(new Dog("댕댕"));
		animals.add(new Cat("까미"));
		animals.add(new Cat("하양"));
		
		//타이거 클래스를 변경할수 없는 상황에서 
		//adapter클래스를 이용하기!! 
		//animals.add(new Tiger("타이온"));
		animals.add(new TigerAdapter("타이온"));
		
		
		animals.forEach(animal->{
			animal.sound();
		});
		
	
	}
}

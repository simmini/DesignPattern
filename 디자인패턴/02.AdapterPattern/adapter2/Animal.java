package adapter2;

public abstract class Animal {

	protected String name;
	
	//값지정
	public Animal(String name) {
		this.name=name;
	}
	//추상메서드
	public abstract void sound();
	
}

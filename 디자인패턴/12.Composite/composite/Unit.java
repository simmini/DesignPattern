package composite;

public abstract class Unit {
	private String name;//파일이나 폴더의 이름

	//생성자에서 이름필드에 값을 지정할수 있도록 함
	public Unit(String name) {
		super();
		this.name = name;
	}

	//이름필드에 값을 받아옴
	public String getName() {
		return name;
	}

	//이클래스에 대한 객체를 문자열로 변환하는 자바 메서드를 재정의
	@Override
	public String toString() {
		return name+"("+getSize()+")";
	}
	
	
	//파일이나 폴더의 용량을 얻는 추상메서드
	//추상메서드로 정의한 이유는 파일과 폴더에서 각각 용량을 얻는 방법이 다름
	//파일:자기 용량만
	//폴더: 자신이 포함하는 파일들의 용량+포함하는 폴더의 용량
	public abstract int getSize();
	
	
	
	
}

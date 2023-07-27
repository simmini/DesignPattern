package builder;

//car클래스 객체를 생성하기 위한 빌더 
public class CarBuilder {

	private String engine;//엔진
	private boolean airbag;//에어백 여부
	private String color;//차량 색상
	private boolean cameraSencor;//카메라센서 유무
	private boolean AEB;//자동급제동장치 유무
	
	//메서드 체인을 지원하기 위해 this return함 
	public CarBuilder setEngine(String engine) {
		this.engine = engine;
		return this;
	}
	public CarBuilder setAirbag(boolean airbag) {
		this.airbag = airbag;
		return this;
	}
	public CarBuilder setColor(String color) {
		this.color = color;
		return this;
	}
	public CarBuilder setCameraSencor(boolean cameraSencor) {
		this.cameraSencor = cameraSencor;
		return this;
	}
	public CarBuilder setAEB(boolean AEB) {
		this.AEB = AEB;
		return this;
	}
	
	//실제 car클래스를 생성하는 builder메서드
	
	public Car build() {
		//carbuilder의 필드값을 생성자의 인자값으로 사용
		return new Car(engine,airbag,color,cameraSencor,AEB);
	}
	}

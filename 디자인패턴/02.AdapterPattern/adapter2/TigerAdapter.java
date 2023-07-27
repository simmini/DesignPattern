package adapter2;

public class TigerAdapter extends Animal{

	private Tiger tiger;
	//생성자
	public TigerAdapter(String name) {
		super(name);
		
		//Tiger클래스에 roar함수를 사용하기 위해 객체 선언
		tiger=new Tiger();//생성자에서 객체 생성
		tiger.setName(name);
		
		
	}

	@Override
	public void sound() {
		System.out.print(tiger.getName()+" ");//타이온  클래스에서 get
		System.out.println(name);//타이온 : super에서 가죠온거
		tiger.roar();
		
	}

	
}

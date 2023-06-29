package adapter;


public class AdapterImpl implements Adapter{

	//이미 구현된 함수를 사용하기 위해 객체 선언해야지만 static으로 만들엇기 때문에 선언할 필요 x
	//Math math;
	
	//기존에 있던 함수는 double을 받음,원하는 함수반환은 float임 
	//어댑터impl에서 형변환 해줌 :float->double->float
			
	
	@Override
	public Float twiceOf(Float f) { 
		//return (float)Math.twoTime(f.doubleValue());
		
		//Main함수를 변경하지 않고 adapter인터페이스도 변경하지 않고 수정가능 
		return Math.doubled(f.doubleValue()).floatValue();
	}

	@Override
	public Float halfOf(Float f) {
		
		System.out.println("절반함수호출시작");
		return (float)Math.half(f.doubleValue());
	}


}

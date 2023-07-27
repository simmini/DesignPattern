package flyweight;
//누군가 원하는 digit객체를 요청하면 해당 객체 전달해줌
public class DigitFactory {

	private Digit[]pool=new Digit[] {//총10개를 담을 digit 
		null,null,null,null,null,null,null,null,null,null
	};
	
	public Digit getDigit(int n) {
		if(pool[n]!=null) {//셍성된적있으면 그대로 리턴
			return pool[n];
		}else {
			String fileName=String.format("C:\\Users\\User\\git\\DesignPattern\\디자인패턴\\09.FlyweightPattern\\data\\%d.txt",n);//해당 파일 이름
			Digit digit=new Digit(fileName);//생성
			pool[n]=digit;//데이터 저장
			return digit;
		}
	}
	
	
}

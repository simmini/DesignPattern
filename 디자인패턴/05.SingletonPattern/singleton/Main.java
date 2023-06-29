package singleton;

public class Main {

	public static void main(String[] args) {
		
		//SystemSpeaker speak=new SystemSpeaker();//생성자 private라서 호출안됨
		SystemSpeaker speaker1=SystemSpeaker.getInstance();
		SystemSpeaker speaker2=SystemSpeaker.getInstance();

		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		//5,5
		
		speaker1.setVolume(11);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		//11,11
		
		speaker2.setVolume(22);
		System.out.println(speaker1.getVolume());
		System.out.println(speaker2.getVolume());
		//22,22
		
		//=>하나의 객체에 대한걸 바꿧지만(set) 두개다 동일하게 바뀌는걸 보고 동일한 인스턴스임을 알수 있음
	}

}

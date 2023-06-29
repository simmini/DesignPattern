package templatemethod;


public class Main {

	public static void main(String[] args) {
		//인터페이스에 실제구현한 클래스 객체 할당
		AbstGameConnectHelper helper=new DefaultGameConnectHelper();
		
		helper.requestConnection("아이디 암호 등 접속 정보");
	}

}

package singleton2;

public class King {

	//나 자신외에는 생성자를 호출할수 없게한다
	private King() {}
	
	//오직자기자신만이 field에 접근할수 있도록 하기 위해 private
	//클래스 이름으로 접근할수 있도록 static
	
	private static King self=null;
	
	
	//클래스차원에서 self field를 얻을수 있도록
	//멀티쓰레드에서 호출할때도 문제없도록 synchronized(싱글스레드에서는 동기화를 지정할필요없음)
	public synchronized static King getInstance() {
		if(self==null) {
			self=new King();
			
		}
		return self;
		
	}
	
	//이클래스에서 제공하는 메서드 정의
	public void say() {
		
		 System.out.println("I am only one...");
	}
	
	
}

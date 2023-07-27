package 디자인패턴;

public class Main {
	public static void main(String[] args) {
		
	
		
		String name="Dorosh";
		
		 Facade facade=new Facade();
		 facade.run(name);
		//facade의 장점->
		// 1. 기능을 실행하기 위해 클래스를 파악하지 않고도 facade에 해당하는 클래스만 이해해도 사용할수 있다.
		// 2. 라이브러리나 패키지 형태로 코드 제공할떄 퍼서드 클래스만 공개하고 다른 클래스는 비공개할수 있다.
		 
		 
		/* facade클래스의  run함수의 구현코드
			
		DBMS dbms=new DBMS();
		Cache cache=new Cache();
		
		Row row=cache.get(name);
	
		if(row==null) {//한번도 get(select)안되면 null임
			row=dbms.query(name);//get해줌
			if(row!=null) {
				cache.put(row); //cache에 put해줌
			}
		}
		
		if(row!=null) {//조회값이 있으면 출력
			 Message msg=new Message(row);//데이터가공
			 System.out.println(msg.makeName());
			 System.out.println(msg.makeBirthday());
			 System.out.println(msg.makeEmail());
			 
		}else {
			System.out.println(name+" is not exists...");
		}
		*/
		
	}
	
}

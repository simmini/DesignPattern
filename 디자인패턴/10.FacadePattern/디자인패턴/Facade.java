package 디자인패턴;

public class Facade {

	public void run(String name) {
		
		
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
	}
	
}

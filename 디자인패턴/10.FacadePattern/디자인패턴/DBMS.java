package 디자인패턴;

import java.util.HashMap;

public class DBMS {

	private HashMap<String, Row> db=new HashMap<String,Row>();
	
	public DBMS() {// row데이터 추가(insert)
		db.put("jane",new Row("Jane", "1990-02-12", "w1234@naver.com"));
		db.put("robort",new Row("Robort", "1980-02-12", "p1234@naver.com"));
		db.put("dorosh",new Row("Dorosh", "1970-02-12", "l1234@naver.com"));
		
	}
	
	//이름으로 데이터를 조회하는 메서드(select)
	public Row query(String name) {
		 //실제 db에서 시간 지연 재연
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		return db.get(name.toLowerCase());
	}
}

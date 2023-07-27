package 디자인패턴;

import java.util.HashMap;

//dbms에서 조회된 데이터를 임시로 담아두는 클래스
public class Cache {

	private HashMap<String ,Row> cache=new HashMap<String,Row>();
	
	public void put(Row row) {//저장(insert)
		cache.put(row.getName(), row);
	}

	public Row get(String name) {//꺼내기(select)
		return cache.get(name);
	}


	
}

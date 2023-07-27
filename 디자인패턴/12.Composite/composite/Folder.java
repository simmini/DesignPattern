package composite;

import java.util.Iterator;
import java.util.LinkedList;

public class Folder extends Unit {

	//자신이 포함할 유닛객체를 담을 컨테이너인 유닛리스트 필드 추가
	private LinkedList<Unit> unitList=new LinkedList<Unit>();

	//name은 부모클래스인 unit클래스에서 선언한 필드,상속받았기 때문에 사용가능
	public Folder(String name) {
		super(name);
		
	}

	@Override//자신이 포함하고 있는 폴더+파일 용량
	public int getSize() {
		
		int size=0;
		
		Iterator<Unit>it=unitList.iterator();
		
		while(it.hasNext()) {//자신이 포함하고 있는 모든 항목 순회
			Unit unit=it.next();
			size+=unit.getSize();//각항목의 사이즈를 얻어서 더함 
		}
		
		
		return size;
	}
	
	//이 폴더클래스는 유닛객체를 추가시켜 포함시킬수 있으므로 add메서드 추가
	public boolean add(Unit unit) {
		unitList.add(unit);
		return true;
	}
	
	//자신이 포함하고 있는 요소들을 보기좋게 목록으로 출력
	//public메서드가 private로 지정된 메서드를 호출하고 있다.
	private void list(String indent ,Unit unit) {
		if(unit instanceof File) {
			System.out.println(indent + unit);
		}else {
			Folder dir=(Folder)unit;
			Iterator <Unit>it= dir.unitList.iterator();
			System.out.println(indent+"+ "+ unit);
			while(it.hasNext()) {
				list(indent+"   ",it.next());//재귀호출
				//컴퍼지트패턴은 집합체와 독립채를 동일한 개념으로 처리하다보니 재귀호출 필요한경우 많음
			}	
		}	
	}
	
	public void list() {
		list("",this);
	}
	
	
	
	
}

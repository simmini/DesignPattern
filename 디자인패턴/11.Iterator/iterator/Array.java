package iterator;

public class Array implements Aggregator {
// 이클래스가 관리한 배열데이터를 참조할 필드 선언
	private Item[]items;
	public Array(Item[] items) {
		this.items=items;
	}
	
	
	//배열인덱스를 통해서 구성 데이터를 얻는 클래스
	//해당 함수들은 arrayIterator에서 사용
	public Item getItem(int index) {
		return items[index];
	}
	public int getCount() {
		return items.length;
	}


	@Override
	//ArrayIterator생성후 반환,this를 인자로 전달
	public Iterator iterator() {
		return new ArrayIterator(this);
			
		
	}
	
	
}

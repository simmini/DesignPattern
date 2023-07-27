package iterator;

public class  ArrayIterator implements Iterator{

	private Array array; 
	//현재 반환할수 있는 데이터의 인덱스값
	private int index;
	
	public ArrayIterator(Array array) {
		this.array=array;// 참조할 어그리게이터를 생성자에서 받아서 필드에 설정
		this.index=-1;//현재 가리키는 데이터의 인덱스를 지정
	}

	@Override
	public boolean next() {
		index++;
		return index<array.getCount();//이 인덱스값이 배열에서 유효한지를 반환      
	}

	@Override
	public Object current() {
		
		return array.getItem(index);
	}
	
	 

}

package iterator;

public interface Iterator {
	boolean next();	//다음 구성데이터를 얻을수 있으면 true반환
	Object current();//다음 구성데이터를 반환 ,타입미정
}

package bridge;

public interface Display {

	//drift객체를 받아서 각각의 제목,저자,내용을 출력
	void title(Draft draft);
	void author(Draft draft);
	void content(Draft draft);
}

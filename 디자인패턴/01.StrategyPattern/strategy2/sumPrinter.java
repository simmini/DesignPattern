package strategy2;

public class sumPrinter {

	//계산방법->클래스가 매개변수임,총합을 구하기 위한 n값
	void print (sumStrategy strategy ,int N) {
		System.out.println("N:"+N);
		System.out.println(strategy.get(N));
	}
}

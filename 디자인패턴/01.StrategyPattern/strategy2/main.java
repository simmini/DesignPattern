package strategy2;

public class main {
	public static void main(String []args) {
		
		sumPrinter cal=new sumPrinter();
		cal.print(new simpleSumStrategy(), 10);//클래스 타입, 정수형 
		cal.print(new gaussSumStrategy(), 10);
	}
}

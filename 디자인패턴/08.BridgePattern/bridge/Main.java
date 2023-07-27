package bridge;

public class Main {

	public static void main(String[] args) {
		//데이터 
		var title="디자인패턴";
		var author="심정민";
		String[] content={"디자인패턴은 클래스간의 효율적이고 최적화된 관계를 설계하는것 ",
			"반복적으로 이해할수록 이해의 폭이 넓어질 것이다."};
		
		Draft draft=new Draft(title, author, content);
		
		Display display1=new SimpleDisplay();
		//draft.print(display1);
		
		Display display2=new CaptionDisplay();
		//draft.print(display2);
	
		//추가요구사항
		var publisher="북악출판";
		var cost=100;
		
		Publication publication=new Publication(title, author, content, publisher, cost);
		
		publication.print(display1);
		
		publication.print(display2);
		
		}
	
}

package templatemethod2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String title="디자인패턴";
		
		ArrayList<String>content=new ArrayList<>();
		content.add("디자인패턴은 클래스간의 효율적이고 최적화된 관계를 설계하는것!");
		content.add("반복적으로 이해할수록 이해의 폭이 넓어질것이다.");
		
		String footer="2023.7.10 심";

		Article article=new Article(title, content, footer);//해당 데이터값 대입->다른 클래스(SimpleDisplayArticle,CaptionDisplayArticle)에서는 getter로 값 접근 가능
		
		System.out.println("[case 1]");
		DisplayArticleTemplate style1=new SimpleDisplayArticle(article); //껍데기에 구현 클래스 new해주고 데이터 객체 넣어줌
		style1.display();
		
		System.out.println("[case 2]");
		DisplayArticleTemplate style2=new CaptionDisplayArticle(article); //껍데기에 구현 클래스 new해주고 데이터 객체 넣어줌
		style2.display();
		
	}

}

package templatemethod2;

import java.util.ArrayList;

//추상클래스를 구현하는 클래스
public class SimpleDisplayArticle extends DisplayArticleTemplate {

	//생성자
	public SimpleDisplayArticle(Article article) {
		super(article);
	}

	@Override
	protected void title() {
		System.out.println(article.getTitle());
		
	}

	@Override
	protected void content() {
		ArrayList<String>content=article.getContent();
		int cntLines=content.size();
		for(int i=0;i<cntLines;i++) {
			System.out.println(content.get(i));
		}
		
	}

	@Override
	protected void footer() {
		System.out.println(article.getFooter());
		
	}
	
	
}

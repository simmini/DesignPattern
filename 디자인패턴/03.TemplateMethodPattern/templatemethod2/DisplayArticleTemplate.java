package templatemethod2;

import javax.swing.text.AbstractDocument.Content;

//추상클래스
public abstract class DisplayArticleTemplate {

	protected Article article;//파생클래스(다른 패키지)에서 접근가능
	
	//생성자
	public DisplayArticleTemplate(Article article) {
		this.article=article;
		
	}
	
	//정해진 순서대로 호출하는 템플릿매서드
	//final로 지정해 파생클래스에서 이 메서드를 수정할수 없게 강제함
	public final void display() {
		title();
		content();
		footer();
	}
	protected abstract void title();
	protected abstract void content();
	protected abstract void footer();
	
}

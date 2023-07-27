package bridge;
//추가 요구사항으로 publisher ,cost내용추가
//기능계층을 통해 추가 요구사항에 대해 기존의 클래스변경없이 수정가능하게 만듬

public class Publication extends Draft{
	
	private String publisher;
	private int cost;
	public Publication(String title, String author, String[] content,String publisher,int cost) {
		super(title, author, content);
		this.publisher=publisher;
		this.cost=cost;
		}
	private void printPublicationInfo() {
		System.out.println("#"+publisher+"$"+cost);
	}

	public void print (Display display) {
		super.print(display);
		printPublicationInfo();
	}
	

}

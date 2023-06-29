package framework;

public abstract class ItemCreator {
	//아이템 생성하는 함수
	public Item create() {
	//템플릿 메서드 패턴 사용됨을 알수 있음->각단계를 나눠준 후 차례대로 호출
		
		Item item;
		//step1
		requestItemsInfo();
		//step2
		item=createItem();
		//step3
		createItemLog();
		
		return item;
	}
	
	//아이템을 생성하기 전에 db에서 아이템정보를 요청
	abstract protected void requestItemsInfo();
	
	//아이템 생성 후 아이템 복제등의 불법을 방지하기 위해 db에 생성 정보를 남김
	abstract protected void createItemLog();
	
	//아이템을 생성하는 알고리즘
	abstract protected Item createItem();
}

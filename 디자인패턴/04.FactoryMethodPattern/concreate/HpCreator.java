package concreate;

import java.util.Date;

import framework.Item;
import framework.ItemCreator;

public class HpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("db에서 체력회복물약의 정보를 가져옴");
	}

	@Override
	protected void createItemLog() {
		
		System.out.println("체력회복물약을 새로 생성"+new Date());
		
	}

	@Override
	protected Item createItem() {
		
		return new HpPotion();
	}
	
	

}

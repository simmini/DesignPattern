package strategy;


public class Main {

	public static void main(String[] args) {
			GameCharacter gc=new GameCharacter();
			gc.attack();
			
			gc.setWeapon(new Knife());
			gc.attack();
			
			gc.setWeapon(new Sword());
			gc.attack();
			
			//전략패턴은 ax인터페이스 추가 후 set에 무기만 set되면 사용가능(유지보수 간단)
			gc.setWeapon(new Ax());
			gc.attack();
			
			
	}

}

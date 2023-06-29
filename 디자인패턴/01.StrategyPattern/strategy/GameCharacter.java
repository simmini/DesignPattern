package strategy;


public class GameCharacter {

	//접근점
	private Weapon weapon;
	
	//교환가능(검,칼)
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	//위임(델리게이트)-어떤 무기냐에 따라 공격이 달라짐 
	public void attack() {
		if(weapon==null) {
			System.out.println("맨손 공격");
		}else {
		weapon.attack();
		}
	}
}

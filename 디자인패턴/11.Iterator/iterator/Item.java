package iterator;

public class Item {
	
	private String name;
	private int cost;
	
	public Item(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
	@Override//객제자체를 문자열로 바꿀떄(=sysout할때) 자동호출
	public String toString() {
		return "("+name+","+cost+")";	}
	
	
	

}

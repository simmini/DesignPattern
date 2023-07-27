package iterator;

public class Main {

	public static void main(String[] args) {
		Item[]items= {
				new Item("CPU",1000),
				new Item("Keyboard", 3000),
				new Item("Mouse",2000),
				new Item("HDD",30)
				
		};

		
		Array array=new Array(items);
		
		Iterator it=array.iterator();
		
		while(it.next()){//다음 데이터를 얻을 수 있는지 확인 
			Item item=(Item)it.current();
			System.out.println(item);
		}
		//-->다양한 데이터 형태를 파악하지 않고도 에그리데이터를 참조할수 있는 표준화된공통api를 제공할수 있다.  
	}

}

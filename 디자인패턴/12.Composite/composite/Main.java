package composite;

public class Main {

	public static void main(String[] args) {
		Folder root=new Folder("root");
		//root폴더에 a라는 파일 추가,파일 객체는 생성시 이름과 용량을 인자로 받는다.
		root.add(new File("a.txt",1000));
		root.add(new File("b.txt",2000));
		
		Folder sub1=new Folder("sub1");
		root.add(sub1);
		sub1.add(new File("sa.txt",100));
		sub1.add(new File("sb.txt",300));
	
		
		Folder sub2=new Folder("sub2");
		root.add(sub2);
		sub2.add(new File("sA.txt",100));
		sub2.add(new File("sB"
				+ ".txt",300));
		root.list();
	}

}

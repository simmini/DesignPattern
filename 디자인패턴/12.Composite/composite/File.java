package composite;

public class File extends Unit{

	private int size;//파일 용량
	
	//생성자에서 파일의 이름과 용량 지정
	public File(String name,int size) {
		super(name);
		this.size=size;
	}
	
	@Override
	public int getSize() {
		
		return size;
	}

	
	
	
}

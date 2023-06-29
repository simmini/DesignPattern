package singleton;

public class SystemSpeaker {

	//1개만 있어야하기 때문에 static,외부접근 불가
	static private SystemSpeaker instance;
	private int volume;
	
	
	//다른곳에서 생성 못하게함 private
	private SystemSpeaker() {
		volume=5;
	}
	
	//다른곳에서 호출했을때 인스턴스 없으면 여기서 생성해준후 return, 있으면 return만 
	public static SystemSpeaker getInstance() {
		if(instance==null) {
			instance=new SystemSpeaker();
			System.out.println("새로생성");
		}else {
			System.out.println("이미 생성");
		}
		return instance;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
}

package templatemethod;


public class DefaultGameConnectHelper extends AbstGameConnectHelper{

	@Override
	protected String doSecurity(String string) {
		System.out.println("강화된 알고리즘을 이용한 디코드-암호복호화");
		//System.out.println("디코드-암호복호화");
		return string;
	}

	@Override
	protected boolean authentication(String id, String password) {
		System.out.println("아이디/암호 확인 과정");
		return true;
	}

	@Override
	protected int authorization(String userName) {
		System.out.println("권한확인");
		//강화-나이를 확인하고 시간을 확인하고 성인이 아니고 10시가 지낫다면 권한 없음
		
		
		
		return 0;
	}

	@Override
	protected String connection(String info) {
		System.out.println("마지막 접속단계!");
		return info;
	}

	
	
}

package templatemethod;


public abstract class AbstGameConnectHelper {
	//외부에선 접근 못하고 하위클래스에서는 사용할수 있도록 protected(같은 패키지 안에서만 접근 가능)
	protected abstract String doSecurity(String string);	
	protected abstract boolean authentication(String id,String password);	
	protected abstract int authorization(String userName);
	protected abstract String connection(String info);
	
	//템플릿메서드
	public String requestConnection(String encodeInfo) {
		
		//보안작업->암호화된 문자열을 복호화
		String decodedInfo=doSecurity(encodeInfo);
		
		//반환된 것을 가지고 아이디,암호를 할당한다.
		String id="aaa";
		String password="bbb";
		if(!authentication(id,password))
		{
			throw new Error("아이디 암호 불일치");
		}
		String userName="userName";
		int i=authorization(userName);
		
		switch(i) {
		case -1://shotdown
			throw new Error("셧다운");
			
		case 0://게임메니저
			System.out.println("게임 메니저");
			break;
		case 1://유료회원
			break;
		case 2://무료회원
			break;
		case 3://권한없음
			break;
		default://기타
			break;
			
		}
		return connection(decodedInfo);
	}
	
}

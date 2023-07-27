package builder2;

public class Main {
	public static void main(String[] args) {
	
		Data data =new Data("Jane",25);
		Builder builder=new PlainTextBuilder(data);
		//빌더객체를 생성자의 인자로 사용해서 디렉터객체생성
		Director director=new Director(builder);
		//문자열생성
		String result=director.build();
		//출력
		System.out.println(result);
		
		
		//2.jsonbuilder를 이용해서 데이터객체를 json형식의 문자열로 만듬 
		 builder=new JSONBuilder(data);
		//빌더객체를 생성자의 인자로 사용해서 디렉터객체생성
		 director=new Director(builder);
		//문자열생성
		 result=director.build();
		//출력
		System.out.println(result);
		
		
		 builder=new XMLBuilder(data);
		//빌더객체를 생성자의 인자로 사용해서 디렉터객체생성
		director=new Director(builder);
		//문자열생성
		result=director.build();
		//출력
		System.out.println(result);
		
		//=>전략패턴,facade패턴(direct클래스),템플릿패턴(추상클래스,구현클래스)이 객체생성할때 사용된걸 볼수 있음
	}
}

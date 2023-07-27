package flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Digit {
	//숫자를 표현하기 위한 데이터를 저장할 필드
	private ArrayList<String> data=new ArrayList<String>();
	
	public Digit(String fileName) {
		
		FileReader fr=null;
		BufferedReader br=null;
		//파일 읽기
		try {
			fr=new FileReader(fileName);
			br=new BufferedReader(fr);
			for(int i=0;i<8;i++) {//각파일은 여덜줄로 구성된 문자열임
				data.add(br.readLine());//여덜줄의 문자열을 읽어서 data필드에 저장
			}
			//데이터 읽기,메모리load
		} catch (IOException e) {
			e.printStackTrace();
		//다시 파일을 닫는 연산수행
		}finally {
			try {
				if(fr!=null)fr.close();
				if(br!=null)br.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	//화면상의 xy위치에 파일로 읽어드린 데이터를 출력해주는 메서드
	public void print(int x,int y) {
		for(int i=0;i<8;i++) {
			String line=data.get(i);
			System.out.println(String.format("%c[%d;%df", 0x1B,y+i,x));
			System.out.println(line);
		}
	}
	
	
	
}

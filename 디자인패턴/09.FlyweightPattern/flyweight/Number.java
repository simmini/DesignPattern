package flyweight;

import java.util.ArrayList;

public class Number {

	private ArrayList<Digit> digitList=new ArrayList<Digit>();
	
	public Number(int numer) {//숫자입력받아
		String strNum=Integer.toString(numer);//숫자를 문자로 치호환하고
		int len=strNum.length();
		
		DigitFactory digitFactory=new DigitFactory();
		for(int i=0;i<len;i++) {
			int n=Character.getNumericValue(strNum.charAt(i));//문자값을 순서대로 읽기 
			Digit digit=digitFactory.getDigit(n);//해당되는 숫자를 digitfactory를 통해 얻어와서 
			digitList.add(digit);//list에 추가
		}
		
		
		
	}
	public void print(int x,int y) {
		int cntDigits=digitList.size();
		for(int i=0;i<cntDigits;i++) {
			Digit digit=digitList.get(i);
			digit.print(x+(i*8), y);
		}
		
	}
	
}

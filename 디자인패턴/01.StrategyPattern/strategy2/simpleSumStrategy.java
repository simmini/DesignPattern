package strategy2;


public class simpleSumStrategy implements sumStrategy{

	@Override
	public int get(int N) {
		int sum=N;
		
		for(int i=1;i<N;i++) {
			sum+=i;
		}
		return sum;
	}

	
	
	
}

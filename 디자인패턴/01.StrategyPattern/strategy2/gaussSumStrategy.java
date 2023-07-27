package strategy2;

public class gaussSumStrategy implements sumStrategy{

	@Override
	public int get(int N) {
		
		return (N+1)*N/2;
	}

	
}

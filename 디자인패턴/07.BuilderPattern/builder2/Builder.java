package builder2;

public abstract class Builder {

	protected Data data;//자식클래스에서 사용할거라 protected
	
	public Builder(Data data) {
		this.data=data;
	}
	
	public abstract String head();
	public abstract String body();
	public abstract String foot();
	
	
}

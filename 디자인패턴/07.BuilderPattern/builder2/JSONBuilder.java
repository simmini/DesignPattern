package builder2;

public class JSONBuilder extends Builder{

	public JSONBuilder(Data data) {
		super(data);
	}

	@Override
	public String head() {
		// TODO Auto-generated method stub
		return "{";
	}

	@Override
	public String body() {
		StringBuilder sb=new StringBuilder();
		sb.append("\'name\':");
		sb.append("\'"+data.getName()+"\'");
		sb.append("\'age\'");
		sb.append("\'"+data.getAge()+"\'");
				
		
		return sb.toString();
	}

	@Override
	public String foot() {
		// TODO Auto-generated method stub
		return "}";
	}
	
	

}

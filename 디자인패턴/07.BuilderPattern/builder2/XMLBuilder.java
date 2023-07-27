package builder2;

public class XMLBuilder extends Builder{

	
	public XMLBuilder(Data data) {
		super(data);
		}

	@Override
	public String head() {
		StringBuilder sb=new StringBuilder();
		sb.append("<?xml version=\'1.0\' encoding=\'UTF-8\'?>");
		sb.append("<DATA>");
		return   sb.toString();
	}

	@Override
	public String body() {
		StringBuilder sb=new StringBuilder();
		sb.append("<NAME>");
		sb.append(data.getName());
		sb.append("</NAME>");
		
		sb.append("<AGE>");
		sb.append(data.getAge());
		sb.append("</AGE>");
		return sb.toString();
	}

	@Override
	public String foot() {		
		return "</DATA>";
	}

	
	
}

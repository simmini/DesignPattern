package 디자인패턴;

//row클래스를 가공
public class Message {

	private Row row;// 가공할 row
	
	//생성자에서 row설정
	public Message(Row row) {
		this.row=row;
		}
	
	//row객체의 이름 가공
	public String makeName() {
		return "Name: \' "+row.getName()+"\'";
	}
	public String makeBirthday() {
		return "Birthday: "+row.getBirthday();
		}
	public String makeEmail() {
		return "Email: "+row.getEmail();
	}
	
}


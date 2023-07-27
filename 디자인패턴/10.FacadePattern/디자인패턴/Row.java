package 디자인패턴;

public class Row {//DBMS에 저장되는 데이터

	private String name;
	private String birthday;
	private String email;
	
	public Row(String name, String birthday, String email) {
		this.name = name;
		this.birthday = birthday;
		this.email = email;
	}
	public String getName() {
		return name;
	}

	public String getBirthday() {
		return birthday;
	}

	
	public String getEmail() {
		return email;
	}

}

package my.day18;

public class Member {
	
	private String id;
	private String passwd;
	private String name;
	
	
	public Member() {}
	
	public Member(String id, String passwd, String name) {
		
		this.id = id;
		this.passwd = passwd;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "ID : "+ id +
				"\t암호 : "+ passwd +
				"\t성명 : "+ name ;
	}
	
	
	public void showInfo() {
		System.out.println("1. 아이디 : "+id);
		System.out.println("2. 암호 : "+passwd);
		System.out.println("3. 성명 : "+name);
		System.out.println();
	}
	
	

}

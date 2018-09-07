package my.day14;

public class Common {

	static int count;
	
	private String id;
	private String passwd;
	private String name;
	private String email;
	
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
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	public Common() { count++; }
	
	public Common(String id, String passwd, String name, String email) {
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.email = email;
		
		count++;
	}
	
	
	public Common login(String id, String passwd) {
		
		if(this.id != null && this.passwd != null) {
		
			if(this.id.equals(id) && this.passwd.equals(passwd)) {
				System.out.println(name+" 님 환영합니다."); 
				return this;
			}
			else {
				System.out.println(">>> 로그인 실패!!"); 
				return null;
			}
		}
		else {
			System.out.println(">>> 먼저 회원가입부터 하세요!!"); 
			return null;
		}
	}
	
	
	public void showInfo() {
		System.out.println("*** 공통 " + getName() + " 님의 정보 ***"); 
		System.out.println("1. 성명 : " + name);
		System.out.println("2. 이메일 : " + email);
		System.out.println("");
	}
	
	
	
}

package my.day17;

public class Member {
	
	private String id;
	private String password;
	private String name;
	
	public Member() {}
	
	                                                     //생성자를 호출하는 쪽에서 오류를 잡아줘야되
	public Member(String id, String password, String name) throws UserDefineExceptionID {
		setId(id);//이거는 this하면 안돼 
		this.password = password;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) throws UserDefineExceptionID{
		
		if(id == null || id.length()<5)
			throw new UserDefineExceptionID(); // 오류메세지가 기본  생성자에 있는게 나온다.
			//ID명은 최소길이가 5글자 이상이어야 합니다.
		
		else if("admin".equals(id) || "superman".equals(id))// admin과 superman은 아이디로 못쓰게한다.			
			throw new UserDefineExceptionID("id명은 admin 및 superman 으로 사용할 수 없습니다.");
			//오류메세지는 내가 입력한 대로 나온다./*id명은 admin 및 superman 으로 사용할 수 없습니다.*/
		
		else
			this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}

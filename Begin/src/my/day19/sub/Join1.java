package my.day19.sub;


//Runnable 인터페이스를 구현하는 클래스를 작성한다.
//스레드 객체로 쓰겠다.
public class Join1 implements Runnable, InterJoin {
	
	private String id;
	private String passwd;


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

	//public void run() 메소드를 오버라이딩(재정의) 한다.
	@Override
	public void run() {

		showInfo(); 
		
	}

	//InterJoin 인터페이스의 메소드를 재정의 한다.
	@Override
	public void showInfo() {
		System.out.println("======== Join1 ========");
		System.out.println("▶아이디 : "+id+", 암호 : "+passwd+"\n\n");
		
	}

}

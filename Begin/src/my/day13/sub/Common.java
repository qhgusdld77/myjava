package my.day13.sub;

//모든 클래스의 조상클래스가 있다 =>"Object"
public class Common /*extends Object 생략*/{
	
	static int count; // 생성된 Gujikja 객체,Company 객체 갯수 카운트용.

	// *** Common 클래스의 속성 정하기(추상화작업)
	private String id;	    // 아이디
	private String passwd;	// 암호
	private String name;    // 구직자명(회사명)
	private String address;	// 주소
	private String tel;     // 휴대폰번호(대표전화)
	
	public Common(){
		
	}

	
	public Common(String id, String passwd, String name, String address, String tel) {
		/*super(); Common클래스는 부모 클래스로 쓸거다 이거 사용안해도 된다.*/
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.address = address;
		this.tel = tel;
		
		setPasswd(this.passwd);// 여기 가보면 패스워드를 첫글자와 끝글자를 바꿔서 저장시킨다.
	}

	
	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	
	
	
	
	


	public String getPasswd() {
		if(passwd != null) {//이거안하면 널포인트에러난다!!!꼭해야되
			return passwd.substring(0, 4)+"***"+passwd.substring(7);
			//비밀번호 중간에***
		}
		else
			return "";
	}


	public void setPasswd(String passwd) { // qwer1234$ 입력
										   // $wer1234q 저장되도록
		if(passwd != null && !passwd.trim().isEmpty()) {//널이 아닌것 먼저 검사하고!!공백이 아닐때!! 순서도 중요하다
			String first = passwd.substring(0, 1);//제일 첫번째 글자 가져온다 q
			String middle = passwd.substring(1, passwd.length()-1); //wer1234 가져옴
			String last = passwd.substring(passwd.length()-1); //$ 
			
			this.passwd = last+middle+first; //순서다시 조합한다.
			
		}
		else {
			System.out.println(">>> 사용할 수 없는 암호 입니다.");
			this.passwd = "";// 오류를 막기위해 이렇게 쓴다. 널포인트오류
			                 //
		}
		
	}
	
	
	
	
	
	
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
	


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
	
	
	


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	
	
	
	
	// 구직자(or 구인회사)가 로그인할 수 있는 기능
	public Common login(String id, String passwd) {
		if(id.equals(this.id) && passwd.equals(this.passwd)) 
			return this; //로그인 하면 내정보를 보여준다
		else 
			return null;
	}
	
	
	
	// *** 구직자(or 구인회사)의 기본정보를 알려주는 메소드 생성하기 *** //
	public String commonInfo() {
		String info = "▷ 아이디 : "+id+"\n"+
					  "▷ 암 호 : "+getPasswd()+"\n"+
					  "▷ 성 명 : "+name+"\n"+
					  "▷ 주 소 : "+address+"\n"+
					  "▷ 연락처 : "+tel+"\n";
		return info;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package my.day14;

public class Student extends Common {

	private String hakbun;        // 학번
	private String guardEmail;    // 학부모이메일
	private String awardsCareer;  // 수상경력
	
	public Student() {
		// super(); 이 생략되어져 있음.
	}
	
	public Student(String id, String passwd, String name, String email
			      ,String hakbun, String guardEmail, String awardsCareer) {
		super(id, passwd, name, email);
		this.hakbun = hakbun;
		this.guardEmail = guardEmail;
		this.awardsCareer = awardsCareer;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getGuardEmail() {
		return guardEmail;
	}

	public void setGuardEmail(String guardEmail) {
		this.guardEmail = guardEmail;
	}

	public String getAwardsCareer() {
		return awardsCareer;
	}

	public void setAwardsCareer(String awardsCareer) {
		this.awardsCareer = awardsCareer;
	}

	
	/// **** 메소드의 오버라이딩(Overriding) 재정의 **** ///
	@Override  // 어노테이션 (애노테이션)
	public void showInfo() {
		System.out.println(">>> 학생 " + getName() + " 님의 정보 <<<"); 
		System.out.println("1. 학번 : " + hakbun);
		System.out.println("2. 성명 : " + getName());
		System.out.println("3. 이메일 : " + getEmail());
		System.out.println("4. 수상경력 : " + awardsCareer);
		System.out.println("");
	}
	
	
	@Override
	public Common login(String id, String passwd) {
		
		if(getId() != null && getPasswd() != null) {
		
			if(getId().equals(id) && getPasswd().equals(passwd)) {
				System.out.println("학생 " + getName()+" 님 환영합니다."); 
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
	
	
	
}

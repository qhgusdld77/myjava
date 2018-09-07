package my.day14;

public class Guardian extends Common {
	
	private String jobtype;           // 직업군
	private String officeTelephone;   // 근무지연락처
	
	public Guardian() {
		// super(); 생략되어져 있음.
	}
	
	public Guardian(String id, String passwd, String name, String email  
			       ,String jobtype, String officeTelephone) {
		super(id, passwd, name, email);
		this.jobtype = jobtype;
		this.officeTelephone = officeTelephone;
	}

	public String getJobtype() {
		return jobtype;
	}

	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}

	public String getOfficeTelephone() {
		return officeTelephone;
	}

	public void setOfficeTelephone(String officeTelephone) {
		this.officeTelephone = officeTelephone;
	}
	
	
	/// **** 메소드의 오버라이딩(Overriding) 재정의 **** ///
	@Override  // 어노테이션 (애노테이션)
	public void showInfo() { 
		System.out.println("=== 학부모 " + getName() + " 님의 정보 ==="); 
		System.out.println("1. 성명 : " + getName());
		System.out.println("2. 이메일 : " + getEmail());
		System.out.println("3. 직업 : " + jobtype);
		System.out.println("4. 근무지연락처 : " + officeTelephone);
		System.out.println("");
	}
	
	
	
}

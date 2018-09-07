package my.day13.sub;

public class Recruit {
	
	//Recruit 클래스의 추상화 작업하기
	static int count; //Recruit 객체 생성 카운트용
	
	private Company company; // 구인회사 
	private String gender;   // 채용성별[1.남/2.여/3.성별무관]
	private int agemin;      // 채용최소나이
	private int agemax;      // 채용최대나이
	private String school;   // 채용학력[1.대졸이상 /2.초대졸/3.고졸/4.학력무관]
	
	public Recruit() {
		count ++;
	}

	public Recruit(Company company, String gender, int agemin, int agemax, String school) {

		this.company = company;
		this.gender = gender;
		this.agemin = agemin;
		this.agemax = agemax;
		this.school = school;
		
		count ++;
	}
	
	
	
	public Company getCompany() {
		return company;
	}


	public void setCompany(Company company) {
		this.company = company;
	}


	
	
	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

	
	

	public int getAgemin() {
		return agemin;
	}


	public void setAgemin(int agemin) {
		this.agemin = agemin;
	}


	
	
	public int getAgemax() {
		return agemax;
	}


	public void setAgemax(int agemax) {
		this.agemax = agemax;
	}


	
	
	
	public String getSchool() {
		return school;
	}


	public void setSchool(String school) {
		this.school = school;
	}
	
	
	
	//채용공고 정보를 보여주는 기능(메소드)
	public String getRecruitInfo() {
		String strSchool ="";
		switch (school) {
		case "1":
			strSchool = "대졸이상";
			break;
			
		case "2":
			strSchool = "초대졸";
			break;
			
		case "3":
			strSchool = "고졸";
			break;
			
		case "4":
			strSchool = "학력무관";
			break;

		default:
			break;
		}
		String info = " === ["+company.getName()+"] 회사 채용공고 === "+"\n"+
					  "1.회사명 : "+company.getName()+"\n"+
					  "2.대표자명 : "+company.getCeo()+"\n"+
					  "3.자본금 : "+company.getSeedmoney()+"\n"+
					  "4.업종 : "+company.getJobtype()+"\n"+
					  "5.회사주소 : "+company.getAddress()+"\n"+
					  "6.회자전화번호 : "+company.getTel()+"\n"+
					  "7.채용성별 : "+gender+"\n"+
					  "8.채용연령대 : "+agemin+"세~"+agemax+"세\n"+
					  "9.채용학력 : "+strSchool+"\n";
		return info;
	}



}

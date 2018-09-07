package my.day14;

public class Sungjuk {

	private String hakbun;
	private String yearQuarter;
	private int kor;
	private int eng;
	private int math;
	private int science;
	private int society;
	
	public Sungjuk() { }
	
	public Sungjuk(String hakbun, String yearQuarter, int kor, int eng, int math, int science, int society) {
		this.hakbun = hakbun;
		this.yearQuarter = yearQuarter;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.science = science;
		this.society = society;
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getYearQuarter() {
		return yearQuarter;
	}

	public void setYearQuarter(String yearQuarter) {
		this.yearQuarter = yearQuarter;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;	
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getScience() {
		return science;
	}

	public void setScience(int science) {
		this.science = science;
	}

	public int getSociety() {
		return society;
	}

	public void setSociety(int society) {
		this.society = society;
	}
	
	//// **** 메소드의 오버로딩(OverLoading) **** ////
	public void setJumsu(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public void setJumsu(int kor, int eng, int math, int science, int society) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.science = science;
		this.society = society;
	}
	
}

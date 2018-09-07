package my.day13;
//캡슐화 한거다.은닉화
public class Sungjuk {
	
	private Student student; 
	private int kor  = -1;
	private int eng  = -1;
	private int math = -1;
	
	
	
	public Student getStudent() {
		return student;
	}
	
	
	public void setStudent(Student st) {
	
		
		if(st != null /*이거 꼭 기억해라*/ 
				&& !st.getHakbun().isEmpty()
				&& !st.getName().isEmpty()
				&& !st.getMobile().isEmpty()) {
			this.student = st;
		}
		else {
			System.out.println(">> 학생으로 사용불가한 사람입니다.");
		}
		
	}
	
	
	
	
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		if(0<=kor && kor<=100)
			this.kor = kor;
		else
			System.out.println("점수는 0과 100 사이로 입력해주세요");
	}
	
	
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		if(0<=eng && eng<=100)
			this.eng = eng;
		else
			System.out.println("점수는 0과 100 사이로 입력해주세요");
	}
	
	
	
	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		if(0<=math && math<=100)
			this.math = math;
		else
			System.out.println("점수는 0과 100 사이로 입력해주세요");
		
	}
	
	
	
	public int getTotal() {
		return kor+eng+math;
	}
	
	
	public double getAvg() {
		return Math.round((double)(kor+eng+math)/3*10)/10.0;
	}
	
	public String getHakjum() {
		/*String result="";
		switch (((kor+eng+math)/3)/10) {
		case100:
		case 90:
			result = "A";
			break;
		case 80:
			result = "B";
			break;
		case 70:
			result = "C";
			break;
		case 60:
			result = "D";
			break;

		default:
			result = "F";
			break;
		}
		
		return result*/
		
		String hakjum = "";
		
		switch ((int)getAvg()/10) {
		case 10:
		case 9 :
			hakjum = "A";
			break;
		case 8 :
			hakjum = "B";
			break;
		case 7 :
			hakjum = "C";
			break;
		case 6 :
			hakjum = "D";
			break;
		default:
			hakjum = "F";
			break;
		}
		return hakjum;	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

package my.day3.quiz;

public class Student {
	
	String hakbun;
	String name;
	byte kor;
	byte eng;
	byte math;		//인스턴스 
	
	public Student() {}		//인자가 없는 생성자!! 이거도 해줘야되
	
	public Student(String hakbun, String name, int kor, int eng, int math) {		//자바에서 ()는 생성자 아니면 메소드!!!!
		this.hakbun = hakbun;														//자바에서 정수의 기본타입은 int 이다.
		this.name = name;															//강제형변환 
		this.kor = (byte)kor;
		this.eng = (byte)eng;
		this.math = (byte)math;
	}	
	
	
	public String showInfo() {
		
		String info = "==="+name+"님의 정보 ==="
						+ "\n1. 학 번 : "+hakbun+""
						+ "\n2. 성 명 : "+name+""
						+ "\n3. 국 어 : "+kor+""
						+ "\n4. 영 어 : "+eng+""
						+ "\n5. 수 학 : "+math;
		
		return info;
	
	}
	
	public String showTotal() {
		
		String total = ">> 총 점 : "+ (kor+eng+math);
		return total;
	}
	
	public String showAvg() {
		
		String avg = ">> 평 균 : "+ (double)(kor+eng+math)/3;
		return  avg;
	}
	
	

}

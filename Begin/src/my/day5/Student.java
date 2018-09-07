package my.day5;

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
		
		String avg = ">> 평 균 : "+ Math.round((double)(kor+eng+math)/3 * 10)/10.0;
		return avg;
	}
	
	public String showHakjum() {
		
		double avg = Math.round((double)(kor+eng+math)/3 * 10)/10.0;
		
		String hakjum = "";
		
		if(avg >= 90) {
			hakjum = "A";
		}
		else if(avg >= 80) {
			hakjum = "B";
		}
		else if(avg >= 70) {
			hakjum = "C";
		}
		else if(avg >= 60) {
			hakjum = "D";
		}
		else{
			hakjum = "F";	
		}
		
		return ">> 학점 : "+hakjum;
	}
	
	public String showHakjum2() {
		double avg = Math.round((double)(kor+eng+math)/3 * 10)/10.0;
		
		//avg 가 90 이상이라면 9
		//avg 가 90 미만 80 이상이라면 8
		//avg 가 80 미만 70 이상이라면 7
		//avg 가 80 미만 60 이상이라면 6
		
		// (int)avg   92     93     90 --> 90
		// (int)avg 92/10  93/10  90/10 --> 9
		
		String hakjum = "";
		
		switch ((int)avg/10) { 		// key값은 정수형(byte, int, long), char또는 문자열만 사용가능하다.
		                       		// JDK 1.7 이후버전 부터 key값은 문자열 사용이 가능하다.
		case 10:
		case 9:
			hakjum = "A";
			break;
			
		case 8:
			hakjum = "B";
			break;
			
		case 7:
			hakjum = "C";
			break;
			
		case 6:
			hakjum = "D";
			break;

		default:
			hakjum = "F";
			break;
		}
		
		this.hakbun = hakjum;
		
		return "--학점"+hakjum;	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	 /*public String getGift() {
		
		double avg = Math.round((double)(kor+eng+math)/3 * 10)/10.0;
		String gift = "";
		
		switch ((int)avg/10) {
		case 10:
		case 9:
			gift = "놀이공원 이용권, 뷔페식사권, 치킨, 아이스크림";
			break;
			
		case 8:
			gift = "뷔페식사권, 치킨, 아이스크림";
			break;
			
		case 7:
			gift = "치킨, 아이스크림";
			break;
			
		case 6:
			gift = "아이스크림";
			break;

		default:
			gift = "꿀밤3대";
			break;
		}
		
		return ">> " + gift;
	}*/
	
	
	
	
	
	
	
	
	
	
	public String getHakjum() {
		double avg = Math.round((double)(kor+eng+math)/3 * 10)/10.0;
		
		String hakjum = "";
		
		switch ((int)avg/10) {
			case 10:
			case 9:
				hakjum = "A";
				break;
				
			case 8:
				hakjum = "B";
				break;
				
			case 7:
				hakjum = "C";
				break;
				
			case 6:
				hakjum = "D";
				break;
	
			default:
				hakjum = "F";
				break;
		}
		
		return hakjum;
	}
	
	
	public String getGift() {
		
		String gift = "";
		
		switch (getHakjum()) {
		
		case "A":
			gift += "놀이공원 이용권,";
			// gift = gift + "놀이공원이용권";
			
		case "B":
			gift += "뷔페식사권, ";
			// gift = gift(놀이공원이용권, ) + "뷔페식사권, ";
			
		case "C":
			gift += "치킨, ";
			
		case "D":
			gift += "아이스크림.";
			break;

		default:
			gift += "꿀밤3대~";
			break;
		}
		
		return ">> "+ gift;
	}
	
	
	

}

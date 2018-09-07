package my.day8;

public class Student {
	
	static int count;
	
	String hakbun;
	String passwd;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	String str;  //인스턴스 멤버변수
	
	public Student() {//객체를 만들때마다 카운트해줌 스테틱변수
		count++;   
	}
	
	public void ShowStudentInfo() { 
		
		total = kor+eng+math;
		avg = Math.round((kor+eng+math)/3.0*10)/10.0;
		
		if(avg>90)
			str = "A";
		else if(avg>80)
			str = "B";
		else if(avg>70)
			str = "C";
		else if(avg>60)
			str = "D";
		else
			str = "D";
		
		
		
		
		System.out.println("1. 학번 : "+hakbun);
		System.out.println("2. 암호 : "+passwd);
		System.out.println("3. 성명 : "+name);
		System.out.println("4. 국어 : "+kor);
		System.out.println("5. 영어 : "+eng);
		System.out.println("6. 수학 : "+math);
		System.out.println("7. 총점 : "+total);
		System.out.println("8. 평균 : "+avg);
		System.out.println("8. 학점 : "+str);	
		System.out.println("");
	}
	

}

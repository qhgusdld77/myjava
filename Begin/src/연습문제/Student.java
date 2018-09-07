package 연습문제;

public class Student {

	String name;
	long num;
	int k;
	int e;
	int m;
	
	public Student() {			//기본생성자
		
	}
	
	public Student(String name, long num, int k, int e, int m) {		//인자가있는생성자
		this.name = name;
		this.num = num;
		this.k = k;
		this.e = e;
		this.m = m;
	}
	
	public void yeah() {
		System.out.println("저는 "+num+"번 "+name+"이고\n 제 점수는 국어"+k+"점 영어"+e+"점 수학"+m+"점 입니다.");
	}

}

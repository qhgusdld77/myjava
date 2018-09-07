package my.day8;

public class Member2 {
	
	static int count;// 객체를 만들때 마다 1증가 
	//인스

	String userid;
	String passwd;
	String name;
	String addr;
	
	//기본생성자는 public으로 생략되어져 있다.
	public Member2() {
		count++;
	}
	
	
	
}

package my.day3;

public class Heowon {
	
	String userid;
	String passwd;
	String name;
	int age;
	String addr;		
	
	public void showInfo() {
		System.out.println("==="+name+"님의 정보 ===");
		System.out.println("userid => "+userid);
		System.out.println("passwd => "+passwd);
		System.out.println("age => "+age);
		System.out.println("addr => "+addr);	
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int Age) {
		this.age = age;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	

}

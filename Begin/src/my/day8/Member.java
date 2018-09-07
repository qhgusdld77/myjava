package my.day8;

import my.util.MyUtil;

public class Member {
	
	String userid;
	String passwd;
	String name;
	String addr;
	
	//private는 Member클래스에서만 사용할 수 있다.
	//MemberMain에서 객체 생성을 하면 오류 ...어떠한 객체를 만들려면 메소드로 해주면된데
	public Member() {}
	
	
	//다른 클래스에서도 접근이 가능해 public
	public boolean MakeMember(String userid,String passwd,String name,String addr) {
		
		//암호가 조건에 만족하나 안하나 먼저 따진다.
		boolean bool = MyUtil.checkPassword(passwd);
		
		if(!bool) {
			System.out.println(">> 사용불가한 암호로 인해서 회원가입 실패");
			return false;
		}
		else {
			this.userid = userid;
			this.passwd = passwd;
			this.name = name;
			this.addr = addr;
			
			System.out.println(">> 회원가입 성공");
			return true;
		}
		
	}
	
	

}

package my.day8;

import my.util.MyUtil;

public class Mamber2Main {

	public static void main(String[] args) {
		
		//멤버클래스 객체를 배열로 만들어 2개 , 초기치 null
		Member2[] memberArr = new Member2[2];
		
		String userid/*지역변수*/ = "leess";
		String passwd = "qwer1234$";
		String name = "이순신";
		String addr = "서울시 종로구";
		
		
		//검사를 먼저해 암호가 사용가능하면 객체를 생성하고 사용가능하지 않으면 else
		if(MyUtil.checkPassword(passwd)) {
			Member2 mem1 = new Member2();
			mem1.userid = userid;
			mem1.passwd = passwd;
			mem1.name = name;
			mem1.addr = addr;
			
			if(Member2.count <= memberArr.length) {
				memberArr[0] = mem1; //배열 처번째 방에 mem1을 넣는다
				System.out.println(">> 회원가입 성공");
			}
			else {
				mem1 = null;
			}
			
		}
		else {
			System.out.println(">> 회원가입 실패");
		}
		
		
		
		
		
		userid/*지역변수*/ = "habsk";
		passwd = "abcd1234$";
		name = "한석규";
		addr = "서울시 강남구";
		
		if(MyUtil.checkPassword(passwd)) {
			Member2 mem1 = new Member2();
			mem1.userid = userid;
			mem1.passwd = passwd;
			mem1.name = name;
			mem1.addr = addr;
			if(Member2.count <= memberArr.length) {
				memberArr[1] = mem1; //배열 처번째 방에 mem1을 넣는다
			System.out.println(">> 회원가입 성공");
			}
			else {
				mem1 = null;
			}
		}
		else {
			System.out.println(">> 회원가입 실패");
		}
		
		
		
		
		
		
		
		userid/*지역변수*/ = "dsk";
		passwd = "asdf1234$";
		name = "두석규";
		addr = "서울시 강북구";
		
		if(MyUtil.checkPassword(passwd)) {
			Member2 mem1 = new Member2();
			mem1.userid = userid;
			mem1.passwd = passwd;
			mem1.name = name;
			mem1.addr = addr;
			if(Member2.count <= memberArr.length) {
				memberArr[2] = mem1; //배열 처번째 방에 mem1을 넣는다
			System.out.println(">> 회원가입 성공");
			}
			else {
				mem1 = null;
			}
		}
		else {
			System.out.println(">> 회원가입 실패");
		}
		
		

	}

}

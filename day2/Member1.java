// import java.long.String;
// import java.lang.*;

public class Member1
{
	String userid;		// 아이디  (문자열)
	String pwd;			// 암호   (문자열)
	String name;		// 성명   (문자열)
	int age;			// 나이   (정수)
	String address;		// 주소   (문자열)

	// !!!! java에서 ()는 2가지만 존재한다. !!!!
	//1. 메소드(method)
	//2. 생성자(constructor)

	// ==== 생성자(constructor) 구성하기 ====
	/*
		※ 생성자(constructor)란?
		-- 객체를 생성(클래스명 객체변수명 = new 클래스명();) 할때 마다
		   자동적으로 호출되어져 실행되어지는 어떠한 행위를 기술한 것이라고 생각하면 된다.

		※ 생성자()의 지켜야할 규칙
		  1. 생성자()의 이름은 반드시 클래스명과 같아야 한다.
		  2. 생성자()는 반환타입(리턴타입)을 기술하면 안된다. (메소드는 있다)

		※ 생성자()의 주된 역할은 
			일반적으로 멤버변수(인스턴스 변수, 클래스변수(static 변수))의 
			초기화를 하고자 하는데 있다.
	*/

	public Member1()/*클래스명이오면 생성자 아니면 메소드*/ {
		System.out.println(" Member1() 생성자를 호출했습니다.");
	}

	public Member1(String userid, String pwd, String name, int age, String address) {
		this.userid/*멤버변수*/ = userid/*지역변수*/; // 멤버변수의 이름과 지역변수의 이름이 같다라면 
		                                         // 지역변수의 이름이 우선한다. !!!!!
		// this는 생성되어지는 객체를 말한다.
		// 그래서 멤머변ㅅ명과 지역변수명이 동일할 경우 구분을 짓기 위한 방법이
		// this.멤머변수명 으로 구분을 짓는다.

		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.address = address;
	}


	public void showInfo() {
		System.out.println("====================");
		System.out.println("1.아이디 : " + userid);
		System.out.println("2.암 호 : " + pwd);
		System.out.println("3.성 명 : " + name);
		System.out.println("4.나 이 : " + age);
		System.out.println("5.주 소 : " + address);
		System.out.println("====================");
	}
}

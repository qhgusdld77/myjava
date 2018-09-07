package my.day3;

import my.util.MyUtil;

public class MethodTest {

	public static void main(String[] args) {
		
		Member.showCount();	//클래스명.메소드명() --> 클래스 메소드 (static 메소드)
		
		Member me = new Member(); //새로운 객체(인스턴스) 생성  		기본생성자 호출
		me.userid = "bohyeon";
		me.pwd = "12234";
		me.name = "김보현";
		me.age = 23;
		
		// --------------------------------------객체를 생성해서 count 1됨
		Member.showCount();
		
		Member you = new Member("irin", "1234", "아이린", 30); // 객체(인스턴스) 생성 		인자가 있는 생성자 호출
		
		// --------------------------------------객체를 생성해서 count 2됨
		Member.showCount();
		
		// == 1. 리턴타입이 없는 메소드 호출하기 ==
		me.showInfo();		//인스턴스.메소드명() --> 인스턴스 메소드
		you.showInfo();
		
		// == 2. 리턴타입이 있는 메소드 호출하기 ==
		String info = me.returnShowInfo();		//인스턴스.메소드명() --> 인스턴스 메소드// String(반환타입)
		System.out.println(info);
		
		System.out.println("");
		
		info = you.returnShowInfo();
		System.out.println(info);
		
		
		// == 3. 리턴타입(반환타입)은 없고 매개변수(인자, 파라미터)가 있는 메소드 호출 하기 ==
		me.chageVal("abcd0070", 35);		//인스턴스.메소드명() --> 인스턴스 메소드// void(반환타입)//인자값에 String pwd, int age
		
		info = me.returnShowInfo();
		System.out.println(info);
		
		// == 4. 리턴타입(반환타입)은 있고 매개변수(인자, 파라미터)도 있는 메소드 호출 하기 ==
		info = me.returnChangeVal("asdf1111", 45);
		System.out.println(info);
		
		Member wonbin = new Member();  //객체(인스턴스) 생성   기본생성자로 
		wonbin.userid = "wonbin";
		wonbin.pwd = "abcd1234";
		wonbin.name = "원빈";
		wonbin.age = 41;
		// --------------------------------------객체를 생성해서 count 3됨
		Member.showCount();
		
		System.out.println("== 현재시각 ==");
		MyUtil.currentTime(); // 클래스 메소드 
		
		System.out.println("");
		System.out.println("=== 퀴즈 ===");
		int sum = MyUtil.calcurator(2,5,8);
		System.out.println("sum =>" +sum);
		// sum =>15
	}

}

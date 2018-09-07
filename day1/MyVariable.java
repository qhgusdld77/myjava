/*
	===== 변수의 종류 =====

	1. 멤버변수(member 변수) -->
		1.1 클래스변수 (== static 변수)
		1.2 인스턴스변수 (instance 변수 == non static 변수)

	-- 멤버변수(member 변수)가 사용되어지는 범위는
	   해당 클래스(지금은 MyVariable임)내에서 어디서나 사용가능하다.

	-- 멤버변수(member 변수)가 선언되어지는 위치는
	   일반적으로 해당 클래스명 바로 아래에 선언한다.

	-- 변수 선언후 값을 부여(== 변수의 초기화)하지 않더라도 
	   멤버변수(member 변수)는 자동적으로 JVM(Java Virtual Machine)이 알아서 
	   기본값을 부여해준다.
	   정수형(byte, short, int, long)타입은 기본값으로 0 으로 초기화 되고, 
       실수형(float, double)타입은 기본값인 0.0 으로 초기화 되고, 
	   char 타입은 기본값인 '' 으로 초기화 되고, 
	   Object 타입은 기본값인 null(존재하지 않는것)로 초기화 된다.

	-- 클래스변수(static 변수)에 접근을 하기 위해서는
	   객체(Objact)를 생성하지 않고도 바로 클래스명.클래스변수로 접근한다.
	   클래스변수(static 변수)는 해당 클래스로 생성되어진 객체들이 공유해서 사용된다.

	-- 인스턴스변수(non static 변수)에 접근을 하기 위해서는	
	   반드시 객체(Object)를 생성한 후 객체명.인스턴스변수로 접근한다.
       인스턴스변수(non static 변수)는 해당 객체에서만 사용하는 것이다.

	-- 클래스변수(static)는 클래스가 실행되어질때 생성되어지고,
       인스턴스변수(non static)는 객체가 생성되어질때 생성된다.

	-- 해당 프로그램이 종료되면 클래스변수(static)와
       인스턴스변수(non static)는 더이상 쓸모없는 쓰레기
       JVM 에서 가비지 컬렉터가 작동하여 자동적으로 메모리에서 소멸시켜준다.     

	
	2. 지역변수(local 변수)
	 -- 지역변수(local)가 사용되어지는 범위는 
	    지역변수(local)가 생성된 { } 내에서만 사용가능하다.

	 -- 지역변수는 선언되어진 { } 을 벗어나면 자동적으로 소멸되어진다.

	 -- 지역변수(local)는 특정 메소드내에서나, 생성자(instructor)내에서 선언되어지는 것이다.

	 -- 지역변수는 반드시 초기화를 해주어야만 사용가능하다.

*/

//import java.lang.*;

public class MyVariable 
{
	int a = 10; // 여기서 = 은 같다가 아니라 어떤 값을 대입한다는 뜻이다.
                // 그래서 = 을 대입연산자라 부른다.
	            // 명시적 초기화

	int b; // b에는 기본값인 0으로 초기화 된다.

	static int c; // c에는 기본값인 0으로 초기화 된다.


	String userid;
	String pwd;
	String name;
	static String address = "서울시 종로구";

public static void main(String[] args) 
	{

		System.out.println("address : " + address); 
		System.out.println("address : " + MyVariable.address); //권장 클래스명.클래스변수

		MyVariable myobj = new MyVariable();
		// myobj 을 클래스 MyVariable 의 객체변수라 부른다.
		// myobj 을 클래스 MyVariable 의 인스턴스()라 부른다.
		// new MyVariable(); 을 객체(object)생성이라고 하고 인스턴스화 한다고 부른다.

		System.out.println("a : " + myobj.a);
		// a : 10
		// "문자열" + 변수명 에서 +는 더하기가 아니라 문자열 결합을 뜻한다.
		// 그래서 "문자열" +10은 "문자열10" 으로 나온다.

		System.out.println("b : " + myobj.b);
		// b : 0

		System.out.println("name : " + myobj.name);
		// name : null

		System.out.println("c : " + c);			  // 비추
		System.out.println("c : " + myobj.c);	  // 비추
		System.out.println("c : " + MyVariable.c); //권장 클래스명.변수
		//

		System.out.println("==================================\n\n" );

		MyVariable me = new MyVariable();
		MyVariable you = new MyVariable();


		me.userid = "bohyeon";
		me.pwd = "bobo77";
		me.name = "김보현";

		you.userid = "irin";
		you.pwd = "aaaa11";
		you.name = "아이린";

		System.out.println("========== 객체 me의 정보 ========");
		System.out.println("me.userid => " + me.userid);
		System.out.println("me.pwd => " + me.pwd);
		System.out.println("me.name => " + me.name);

		System.out.println("\n========== 객체 you의 정보 ========");
		System.out.println("you.userid => " + you.userid);
		System.out.println("you.pwd => " + you.pwd);
		System.out.println("you.name => " + you.name);

		me.pwd = "kim77";
		//me.address = "쌍문동";
		MyVariable.address = "쌍문동";



		System.out.println("\n\n========== 객체 me의 정보 ========");
		System.out.println("me.userid => " + me.userid);
		System.out.println("me.pwd => " + me.pwd);
		System.out.println("me.name => " + me.name);
	//	System.out.println("me.address => " + me.address); // 권장하지 않음 인스턴스변수 처럼 보인다
	    System.out.println("MyVariable.address => " + MyVariable.address); //권장


		
		System.out.println("\n========== 객체 you의 정보 ========");
		System.out.println("you.userid => " + you.userid);
		System.out.println("you.pwd => " + you.pwd);
		System.out.println("you.name => " + you.name);
	//  System.out.println("you.address => " + you.address);
	    System.out.println("MyVariable.address => " + MyVariable.address);

		System.out.println("\n########## 지역변수 ###############");
		int d; // 지역변수이므로 반드시 초기화를 해주어야한다. (main메소드 안에서 선언했기 때문에 멤버변수는 초기화 안해도 되는데 지역변수는 꼭!해야되)
		d = 0;

		int e = 0;// 지역변수이므로 반드시 초기화를 해주어야한다.

		System.out.println("d : " + d);
		System.out.println("e : " + e);
	}

//	d = 10; // 지역변수는 선언되어진 { }을 벗어나면 자동으로 소멸되어지므로 오류!!
//	e = 20; // 지역변수는 선언되어진 { }을 벗어나면 자동으로 소멸되어지므로 오류!!
}
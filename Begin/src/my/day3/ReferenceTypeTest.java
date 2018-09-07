package my.day3;

public class ReferenceTypeTest {

	public static void main(String[] args) {
		
		/* === ReferenceType(참조형타입) === */
		
		Heowon me/*객체변수*/ = new Heowon();		//객체 생성
		me.userid = "suji";
		me.passwd = "pwer1234$";
		me.name = "수지";
		me.age = 23;
		me.addr = "서울시 강남구";			
		
		System.out.println("me => "+me);	
		//me => my.day3.Heowon@7852e922 출력 		/경로  @->메모리상에 올라간 주소
		
		Heowon you/*객체변수*/ = new Heowon();		//객체생성
		you.userid = "suji";
		you.passwd = "pwer1234$";
		you.name = "수지";
		you.age = 23;
		you.addr = "서울시 강남구";
		
		System.out.println("you => "+you);
		//you => my.day3.Heowon@4e25154f 출력		/패키지.클래스@메모리주소공간
		
		
		
		
		
		
		boolean bool = (me == you);
		System.out.println("bool => "+bool);
		//bool => false							//me와you는 다른 객체
			
		
		System.out.println("\n>>> 데이터 변경전 <<<");
		
		me.showInfo();
		you.showInfo();
		
		System.out.println("\n>>> 데이터 변경후 <<<");
		
		me.setUserid("bohyeon");
		me.setPasswd("abcd0010");
		me.setName("김보현");
		me.setAge(33);
		me.setAddr("쌍문동");
		
		me.showInfo();
		you.showInfo();
		
		
		
		
		
		
		System.out.println("\n####### me = you 한 후 #######");
		
		me = you;								//you에 있는 값(my.day3.Heowon@4e25154f)을 me에 넣는다	
		bool = (me == you);						//-> 주소값이 같아짐(me가 가지고 있던 (메모리공간)주소는 버리고 you의 주소를 쓴다)
		System.out.println("bool => "+bool);
		//bool => true							//주소값이 같아졌으니 true 이다 ~!
		
	//	me = new Heowon(); you와 다시 분리하고 싶으면 이렇게
		
		you.setUserid("leess");
		you.setPasswd("abck0010");
		you.setName("이순신");
		you.setAge(45);
		you.setAddr("인천광역시");
		
		me.showInfo();
		you.showInfo();
		
		
		
		
		
	}

}

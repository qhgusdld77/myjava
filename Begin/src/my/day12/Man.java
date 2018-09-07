package my.day12;

/*
 	자바에서는 상속받을 클래스는 1개만 가능하다.
 	즉, 2개 이상의 클래스로 부터 상속(== 다중상속)은 불가하다.
 	참고로 C++ 언어는 다중상속이 가능하다.
 	
 	자바에서는 인터페이스(interface)로 다중구현으로 처리한다.
*/
               

	           /*Human을 상속받겠다*/
public class Man extends Human{
	
	String goArmyDay; // 입대일자..인스턴스변수
	
	
/*public class Man extends Human, Saram{ --> 오류!

String goArmyDay; // 입대일자..인스턴스변수
*/
	
	//기본생성자
	public Man() {
		//super(); // 부모클래스 Human의 기본생성자를 호출한다.
		//super(); 는 생략되어져 있을 뿐 안써도 작동을 한다. 
		
		System.out.println("=== Man 클래스의 기본생성자 호출함!! ===");
		
		//super(); --> 오류! 부모클래스의 생성자는 자식클래스의 생성자에서  호출할때 무조건 항상 "제일 위"에 있어야된다!!!! 
	}
    
	//파라미터가 있는 생성자
	public Man(String name, float height, int weight, String goArmyDay) {
		super(name,height,weight); //부모클래스에 있는 파라미터 생성자,,이것도 "제일 위"에 있어야된다.
		this.goArmyDay = goArmyDay;
	}
	
	
	public void showGoArmyDay() { //인스턴스 메소드
		System.out.println(">>> "+/*name*//*super.name*/this.name +">> 님의 입대일자 : " + goArmyDay);
	}

	//메소드를 다시정의 하겠다..부모꺼는 상속받고 
	//메소드가 새롭게 정의 되어지면  메소드를 호출할 때 자신의 메소드를 쓴다. 부모것을 안쓴다. 부모꺼 상속받고 덧붙혀주겠다.
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("4.입대일자 : "+ goArmyDay);
		System.out.println("======================");
	}
	
	


}

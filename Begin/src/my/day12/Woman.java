package my.day12;
                 /*상속받겠다   Human을*/ 
public class Woman extends Human{
	
	String childBirthday; //출상예정일자
	
/*public class Woman extends Human, Saram{ --> 오류!

	String goArmyDay; // 입대일자..인스턴스변수
	*/
	
	//기본생성자
	public Woman() {
		//super(); // 부모클래스 Human의 기본생성자를 호출한다.
		//super(); 는 생략되어져 있을 뿐 안써도 작동을 한다. 
		
		System.out.println("=== Woman 클래스의 기본생성자 호출함!! ===");
		
		//super(); --> 오류! 부모클래스의 생성자는 자식클래스의 생성자에서  호출할때 무조건 항상 "제일 위"에 있어야된다!!!! 
	}
   
	//파라미터가 있는 생성자
	public Woman(String name, float height, int weight,String childBirthday) {
		super(name,height,weight);//부모클래스에 있는 파라미터 생성자,,이것도 "제일 위"에 있어야된다.
		this.childBirthday = childBirthday;
	}
	
	public void showChildBirthday() {
		System.out.println(">>> "+/*name*//*super.name*/this.name +">> 님의 출산일자 : " + childBirthday);
	}

	//메소드를 다시정의 하겠다..부모꺼는 상속받고 
	//메소드가 새롭게 정의 되어지면 메소드를 호출할 때 자신의 메소드를 쓴다. 부모것을 안 쓴다. 부모꺼 상속받고 덧붙혀주겠다.
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("4. 출산일자 : "+childBirthday);
		System.out.println("======================");
	}

}

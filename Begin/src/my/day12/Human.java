/*
 	============= 상속(Inheritance)에 대해서 알아본다. =============
 	상속은 어떤 클래스들을 생성할 때  추상화 되어진 결과물(멤버변수, 메소드)들이 공통적으로 
 	 가진다면 즉, 교집합이 있다라면 이것들(공통적인 멤버변수, 공통적인 메소드)만 빼내서 
 	 새로운 클래스(교집합, 부모클래스) 만들어서 관리하는 거시 개발, 유지보수 측면에서 좋다.
 	 왜냐하면 부모클래스에서 1번만 수정을 하면 자식클래스들에게 모두 적용되기 때문이다.
 	 
 	 교집합 ==> 부모클래스
 	 교집하블 내려받는(상속받는) 클래스 ==> 자식클래스
 	
*/

package my.day12;

public class Human {
	
	String name;
	float height;
	int weight;
	
	public Human() {
		System.out.println(">>> Human(휴먼)의 기본생성자를 호출했습니다.");
	}
	
	//Source-Generate Constructor using Fields로 
	public Human(String name, float height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.println("\n======================");
		System.out.println("1.성명 : " + name);
		System.out.println("2.신장 : "+height+"cm");
		System.out.println("2.체중 : "+weight+"kg");
		
	}
	
	public void hoho() {
		System.out.println("호호호");
	}
	
	

}

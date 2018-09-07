/*
	==== **** 미완성 클래스(==추상 클래스) **** ====
     
	미완성 클래스(==추상 클래스)는 객체로 생성할 수 없는 클래스로서
	주로 일반 클래스의 부모클래스로 사용된다.
	class 앞에 abstract 라는 키워드를 붙이면  미완성 클래스(==추상 클래스)가 되어진다. 
   
	미완성 클래스(==추상 클래스)는 미완성 메소드(==추상 메소드)를 가지고 있는 클래스를 말한다.
	미완성 메소드(==추상 메소드)를 두는 이유는 자식 클래스에서 메소드의 overriding(오버라이딩,재정의)을 하기 때문이다.          
      
*/

package my.day15;

//abstract public class Animal {
 public abstract class Animal {	

	static int count;
	 
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	} 
	
	abstract public void crySound();  // 미완성 메소드(== 추상 메소드)
//	public abstract void crySound();  // 미완성 메소드(== 추상 메소드)

	public Animal() {count++;}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		
		count++;
	}
	
	
	
}






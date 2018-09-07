/*
    === 인터페이스(interface)란? ===
    모든 메소드는 추상메소드(미완성 메소드)로 되어있고,
    모든 멤버변수(속성)들은 상수변수(final 변수)로 되어있는 것을 말한다.
    즉, 멤버변수(속성)들은 상수값이고, 메소드는 추상메소드(미완성 메소드)로만 구성된 것이다. 
   
    클래스의 상속은 다중 상속은 불가하지만, 인터페이스는 다중 구현은 가능하다.
 */

package my.day15.sub2;

public interface InterAnimal {

	// 인터페이스에서 선언되어진 변수는 
	// 항상 public final static 이 생략된 상수 변수이다.
	float PI = 3.14F;
//	public final static float PI = 3.14F; 와 같다.!!!
	
	// 인터페이스에서 메소드를 선언할때 접근제한자는 생략한다.
	// 접근제한자를 생략하면 자동적으로 public 이 붙으며, 또한 abstract 가 붙는다. 
	// 즉, 메소드명 앞에 public abstract 가 생략된 것이다.
	void crySound(); // 동물이 되려면 우는기능을 구현해야 한다.
	String run();    // 동물이 되려면 이동하는 방법을 알려주어야 한다.
	int showAge();   // 동물이 되려면 현재 나이를 알려주어야 한다.
	String grade(String level); // 동물이 되려면 등급의 가중치를 문자열("A","B","C","D")로 입력받아 각 동물별 등급문자열("최우수","우수","보통","저급")로 알려주어야 한다.  
	
}



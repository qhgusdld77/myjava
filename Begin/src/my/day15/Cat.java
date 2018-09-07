package my.day15;

public class Cat extends Animal {

	private String color; 
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Cat() {
    //	super(); // 생략됨
	}
	
	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	
	// === 메소드의 오버라이딩(재정의) ===
	// 조건이 부모클래스에 존재하는 메소드이어야 한다.
	// 또한 부모클래스에 존재하던 메소드의 내용물을 뺀 나머지(껍데기)는 똑같아야 한다.
	// 단, 접근지정자(접근제한자)은 부모클래스의 것과 동일하든지 아니면 
	// 부모클래스의 것보다는 제한범위가 더 큰쪽으로 해야한다.
	// 예를들어, 
	// - 부모클래스의 메소드 접근지정자가 public 이라면
	//   자식클래스에서 오버라이딩하는 메소드의 접근지정자는 public 만 가능하다.
	// - 부모클래스의 메소드 접근지정자가 protected 이라면
	//   자식클래스에서 오버라이딩하는 메소드의 접근지정자는 public 또는 protected 만 가능하다.
	// - 부모클래스의 메소드 접근지정자가 public 이라면
	//   자식클래스에서 오버라이딩하는 메소드의 접근지정자는 protected 는 불가하다.	
	@Override
	public void crySound() {
		System.out.println("야옹야옹~~");
	}

	public void printCat() {
		String str = "고양이의 이름은 "+ getName() + ", " +
	                 "나이는 " + getAge() + "살, " +
				     "색상은 " + color + "색입니다.";  
		System.out.println(str+"\n");
	}
	
	
}

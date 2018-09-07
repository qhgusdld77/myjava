package my.day15.sub2;

public class Dog extends Animal {

	private int weight;
	
	public Dog() { 
	//	super(); //생략되어져 있음
	}
	
	public Dog(String name, int weight) {
	//	this();//Dog()를 말한다. 이생성자를 부르겠다. 
		this(name, 1, weight); //  Dog(String name, int age, int weight)를 부른다.
		//생성자내에서 또다른 생성자를 부를수 있다.
		//생성자의 오버로딩!!
	}
	
	public Dog(String name, int age, int weight) {
		super(name, age);
		this.weight = weight;
	}//생성자의 오버로딩
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public void crySound() {
		System.out.println("멍멍~~");
	}

	@Override
	public String run() {
		String result = "강아지 " + getName() + "가 네발로 달립니다."; 
		return result;
	}

	@Override
	public int showAge() {
		
		return 0;
	}

	@Override
	public String grade(String level) {
		
		return null;
	}

}

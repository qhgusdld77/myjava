package my.day15.sub2;

public abstract class Animal implements InterAnimal {
	
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
	
	public Animal() {count++;}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
		
		count++;
	}

}

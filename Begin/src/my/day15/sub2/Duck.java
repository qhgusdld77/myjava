package my.day15.sub2;

public class Duck extends Animal {

	private int price;
	
	public Duck() { }
			
	public Duck(String name, int age, int price) {
		super(name, age);
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public void crySound() {
		System.out.println("꽥꽥~~");
	}

	@Override
	public String run() {
		String result = "오리 " + getName() + "가 두발로 헤엄쳐서 건너가기도 하고 두발로 걷기도 합니다.";  
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

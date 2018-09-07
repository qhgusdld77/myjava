package my.day15.sub2;

public class TestMain {

	public static void main(String[] args) {
		/*미완성클래스 받기만해 저장!,, Animal a = new Animal 이거안돼 객체를 만들지 못해 */
		Animal[] aniArr = new Animal[5];
		
		Dog dog = new Dog("뽀삐", 5, 8);
		Cat cat = new Cat("톰", 3, "검정");
		Duck duck = new Duck("도널드", 4, 5000);
		
		aniArr[0] = dog;
		aniArr[1] = cat;
		aniArr[2] = duck;
		
		for(int i=0; i<3; i++) {
			aniArr[i].crySound();
			System.out.println(aniArr[i].run());
			System.out.println("");
		}
		
		System.out.println("\n-------------------\n");
		
		for(int i=0; i<Animal.count; i++) {
				System.out.println("1.성명 : " + aniArr[i].getName()); 
				System.out.println("2.나이 : " + aniArr[i].getAge());
				
				aniArr[i].crySound();
				System.out.println(aniArr[i].run());
				System.out.println();
		}
		
	}

}

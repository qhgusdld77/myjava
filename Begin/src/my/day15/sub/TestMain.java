package my.day15.sub;

public class TestMain {

	public static void main(String[] args) {
		
		InterAnimal[] interAniArr = new InterAnimal[5];
		
		Dog dog = new Dog("뽀삐", 5, 8);
		Cat cat = new Cat("톰", 3, "검정");
		Duck duck = new Duck("도널드", 4, 5000);
		
		interAniArr[0] = dog;
		interAniArr[1] = cat;
		interAniArr[2] = duck;
		
		for(int i=0; i<3; i++) {
			interAniArr[i].crySound();
			System.out.println(interAniArr[i].run());
			System.out.println("");
		}
		
		System.out.println("\n-------------------\n");
		
		for(int i=0; i<3; i++) {
			if(interAniArr[i] instanceof Dog) {
				System.out.println("1.성명 : " + ((Dog)interAniArr[i]).getName()); 
				System.out.println("2.나이 : " + ((Dog)interAniArr[i]).getAge());
			}
			else if(interAniArr[i] instanceof Cat) {
				System.out.println("1.성명 : " + ((Cat)interAniArr[i]).getName()); 
				System.out.println("2.나이 : " + ((Cat)interAniArr[i]).getAge());
			}
			else if(interAniArr[i] instanceof Duck) {
				System.out.println("1.성명 : " + ((Duck)interAniArr[i]).getName()); 
				System.out.println("2.나이 : " + ((Duck)interAniArr[i]).getAge());
			}
			
			interAniArr[i].crySound();
			System.out.println(interAniArr[i].run());
			System.out.println("");
		}
		
	}

}

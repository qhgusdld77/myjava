package my.day15;

public class TestMain {

	public static void main(String[] args) {
		
		Animal[] aniArr = new Animal[10];
		
		Dog dog = new Dog("뽀삐", 5, 8);
		Cat cat = new Cat("톰", 3, "검정");
		Duck duck = new Duck("도널드", 4, 5000);
		
		aniArr[0] = dog;
		aniArr[1] = cat;
		aniArr[2] = duck;
		
		for(int i=0; i<Animal.count; i++) {
			aniArr[i].crySound();
		}
		
		System.out.println("\n");
		
		for(int i=0; i<Animal.count; i++) {
			if(aniArr[i] instanceof Dog) 
				((Dog)aniArr[i]).printDog();
			else if(aniArr[i] instanceof Cat)
				((Cat)aniArr[i]).printCat();
			else if(aniArr[i] instanceof Duck)
				((Duck)aniArr[i]).printDuck();
		}
		
		System.out.println("\n======================\n"); 
		
		System.out.println("dog.toString() => " + dog.toString()); 
		System.out.println("cat.toString() => " + cat.toString());
		System.out.println("duck.toString() => " + duck.toString());
		
		System.out.println(dog.toString());
		
		/*
		 dog.toString() => my.day15.Dog@7852e922
         cat.toString() => my.day15.Cat@4e25154f
         duck.toString() => my.day15.Duck@70dea4e 
		*/
		System.out.println("dog.hashCode() => " + dog.hashCode());
		System.out.println("cat.hashCode() => " + cat.hashCode());
		System.out.println("duck.hashCode() => " + duck.hashCode()); 
		/*
		  dog.hashCode() => 2018699554
          cat.hashCode() => 1311053135
          duck.hashCode() => 118352462
	    */
		
		System.out.println(Integer.toHexString(dog.hashCode())); 
		System.out.println(Integer.toHexString(cat.hashCode()));
		// 7852e922
		// Integer.toHexString(10진수) 
		// ==> 10진수를 16진수로 변경해서 문자열 형태로 보여주는 것이다.
		
		
		
		

	}

}

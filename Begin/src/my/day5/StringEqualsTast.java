package my.day5;

public class StringEqualsTast {

	public static void main(String[] args) {
		
		String name1 = new String("이순신");  
		String name2 = new String("이순신");
		
		String name3 = "강감찬";
		String name4 = "강감찬";
		
		if(name1 == name2) { 	//주소값을 비교
			System.out.println("name1과 name2는 같습니다.");
		}
		else {
			System.out.println("name1과 name2는 같지 않습니다.");
		}
		
		
		
		System.out.println("##################################");
		
		if(name3 == name4) { 	//값을 비교
			System.out.println("name3과 name4는 같습니다.");
		}
		else {
			System.out.println("name3과 name4는 같지 않습니다.");
		}
		
		
		
		
		
		
		
		
		System.out.println("-----------------------------------");
		
		if(name1.equals(name2)) {
			// name1.equals(name2) 은
			//String name1의 값("이순신")과
			//String name2의 값("이순신")을 비교해서
			//값이 동일하면 true,
			//값이 동일하지 않으면 false를 리턴시켜준다.
			System.out.println("name1과 name2의 값은 같습니다.");	
		}
		else {
			System.out.println("name1과 name2의 값은 같습니다.");
		}
		
		
		if(name3.equals(name4)) {
			// name1.equals(name2) 은
			//String name1의 값("이순신")과
			//String name2의 값("이순신")을 비교해서
			//값이 동일하면 true,
			//값이 동일하지 않으면 false를 리턴시켜준다.
			System.out.println("name3과 name4의 값은 같습니다.");	
		}
		else {
			System.out.println("name4과 name4의 값은 같습니다.");
		}
		

	}

}

/*
	==== *** Polymorphsim(다형성) *** ====
	--> 자식클래스로 생성된 객체는 부모클래스나 인터페이스(interface)의 타입으로 받을 수 있다.
	이것을 Polymorphsim(다형성)이라고 부른다.
*/
package my.day12;

public class PolymorphsimMain {

	public static void main(String[] args) {
		
		Human[] humanArr = new Human[5]; //배열 선언 부모클래스타입
		
		Human hm1 = new Human("인간1", 171.2F, 63);
		
		Man man = new Man("남자군", 180.4F, 81,"2018-11-20");
		Woman woman = new Woman("여자양", 167.4F, 52, "2018-12-09");
		
		Human hm2 = new Man("남운도", 189.4F, 71,"2018-10-20");
		Human hm3 = new Woman("여수지", 157.4F, 48, "2018-12-17");
		
		humanArr[0] = hm1; // hm1-->new Human
		humanArr[1] = man; // man-->new Man,, 배열은 Human으로 선언했지만 Man타입으로 객체를 생성한 것도 들어간다... 
		humanArr[2] = woman;//new Woman
		humanArr[3] = hm2;//new Man
		humanArr[4] = hm3;//new Man
		
		if(humanArr[0] instanceof Man) {//객체 instanceof 클래스명... humanArr[0]객체는 Man클래스로 받을수있나.. Man클래스로만들었나
			System.out.println("humanArr[0]은 Man클래스로 생성된 객체입니다.");
		}
		else{
			System.out.println("humanArr[0]은 Man클래스로 생성된 객체가 아닙니다.");
		}
		
		System.out.println();
		
		if(humanArr[1] instanceof Man) {//객체 instanceof 클래스명 
			System.out.println("humanArr[1]은 Man클래스로 생성된 객체입니다.");
		}
		else{
			System.out.println("humanArr[1]은 Man클래스로 생성된 객체가 아닙니다.");
		}
		
	
		System.out.println("\n");
		for(int i=0; i<humanArr.length; i++) {
			if(humanArr[i] instanceof Man) {
				((Man)humanArr[i]).showInfo();//강제형변환? 저장은 Human으로 다 집어넣고 다른 클래스로 바꿔서 꺼낸다.
											  //humanArr[i].showInfo는 부모클래스(Human)의 showInfo를 보여준다..4번이 없다!
			}
			else if(humanArr[i] instanceof Woman) {
				((Woman)humanArr[i]).showInfo();
			}
			else {
				humanArr[i].showInfo();
			}
		}//end of for--------------------------
			
		//어떠한 객체를 만들때 저장은 부모클래스 타입으로 받을 수 있다. 저장된 곳으로 가보면 다양한 클래스타입으로 되어있다.--> 다형성

	}

}

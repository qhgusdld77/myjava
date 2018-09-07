package my.day12;

public class InheritanceMain {

	public static void main(String[] args) {
		
		Man man1 = new Man(); //객체 생성,기본생성자호출
		man1.name = "이순신";
		man1.height = 182.5F;
		man1.weight = 75;
		man1.goArmyDay = "2018-09-25";
		
		Woman woman1 = new Woman(); //객체 생성,기본생성자호출
		woman1.name = "박보영";
		woman1.height = 165.4F;
		woman1.weight = 59;
		woman1.childBirthday = "2018-10-02";
		
		Man man2 = new Man("슈퍼맨", 198.5F, 97, "2018-10-20"); //객체 생성,파라미터가 있는 생성자 호출
		Woman woman2 = new Woman("원더우먼", 175.7F, 54, "2018-12-15");
		
		System.out.println("\n==============================\n");
		
		man1.showGoArmyDay(); //이순신 
		man2.showGoArmyDay(); //슈퍼맨

		System.out.println();
		
		woman1.showChildBirthday(); //박보영
		woman2.showChildBirthday(); //원더우먼
		
		System.out.println("\n-------------------------------\n");
		
		
		man1.showInfo(); // showInfo()는 Man클래스에 없지만 상속받아서 
		woman1.showInfo();
		
	}

}

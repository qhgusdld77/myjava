package my.day12;

public class CapsulationPersonMain {

	public static void main(String[] args) {
		
		CapsulationPerson person = new CapsulationPerson();
		//CapsulationPerson 이건 public
		person.setName("홍길동");
		person.setAge(23);
		person.setHeight(169.8);
		
		System.out.println(person.getName()+"님의 나이는"+person.getAge()+"세 신장은 "+person.getHeight()+"cm 입니다.");
		//홍길동님의 나이는 26세 신장은 178.9cm 입니다.

		
		person.showInfoPerson(); //null,0세,0.0cm...showInfoPerson는 public으로 접근가능하지만! 변수는 private으로 접근이 안된다!
	}

}

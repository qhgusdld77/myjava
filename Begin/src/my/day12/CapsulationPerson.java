/*
 	==== *** 캡슐화(은닉화) *** ====
 	
 	접근제한자(접근지정자, accessmodigifier)	자기자신클래스내부	동일패키지에있는다른클래스	다른패키지에있는 하위(자식)클래스	그외의 영역
 	--------------------------------------------------------------------------------------------------------
 	public                                    o                 o                      o               o        
 	protected                                 o                 o                      o               x
 	default(기본값     아무것도 안쓴거)                 o                 o                      x               x
 	private                                   o                 x                      x               x
 	
*/

package my.day12;

/*public 다른 클래스에서도 접근가능*/
public class CapsulationPerson {
	
	/*private 이 클래스에서만 쓰겠다. 접근제한자*/
	private String name;
	private int age;
	private double height;                    //대부분이렇게하고 유효성검사하고 값을 다시 준다.getName~~
	
	
	
	//Source-Generate Getters and Setters로 한번에 만들 수 있다.
	public void setName(String name) {//유효성검사 
		if(name.trim().isEmpty()) {
			System.out.println(">> 공백안돼");
		}
		else {
			this.name = name;
		}
	}
	public String getName() {
		return name;
	}
	
	
	
	public void setAge(int age) {//0이나 -값이 들어오면 안돼..이건 public이니까 다른 클래스에서 접근가능
		if(age < 0) {
			System.out.println(">> 나이는 0보다 커야합니다.");
		}
		else {
			this.age/*age는 private 같은클래스니까 접근가능*/ = age;
		}
	}
	public int getAge() {
		return age;
	}
	
	
	
	public void setHeight(double height) {
		if(height <= 0) {
			System.out.println(">>> 신장은 0보다 커야합니다.");
		}
		else {
			this.height = height;
		}
	}
	public double getHeight() {
		return height;
	}



	// **** CapsulationPerson 객체의 속성 정보값을 출력해주는 메소드 생성 **** //
	public void showInfoPerson() {
		System.out.println("1.성명 : "+name);
		System.out.println("2.나이 : "+age+"세");
		System.out.println("3.신장 : "+height+"cm");
	}

}

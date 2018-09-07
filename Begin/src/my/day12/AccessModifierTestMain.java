package my.day12;

/*
 	접근제한자(접근지정자, accessmodigifier)	자기자신클래스내부	동일패키지에있는다른클래스	다른패키지에있는 하위(자식)클래스	그외의 영역
 	--------------------------------------------------------------------------------------------------------
 	public                                    o                 o                      o               o        
 	protected                                 o                 o                      o               x
 	default(기본값     아무것도 안쓴거)                 o                 o                      x               x
 	private                                   o                 x                      x               x
*/

public class AccessModifierTestMain {

	public static void main(String[] args) {
		
		AccessModifierTest obj = new AccessModifierTest();
		
		System.out.println("사용자 ID : "+obj.userid);
		System.out.println("암호 : "+obj.passwd);
		System.out.println("성명 :"+obj.name);
	//	System.out.println("주소 : "+obj.address); //접근제한자 때문에 접근이 불가하다.

	}

}

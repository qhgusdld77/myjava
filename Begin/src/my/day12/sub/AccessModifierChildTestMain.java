package my.day12.sub;

import my.day12.AccessModifierTest;

/*
 	접근제한자(접근지정자, accessmodigifier)	자기자신클래스내부	동일패키지에있는다른클래스	다른패키지에있는 하위(자식)클래스	그외의 영역
 	--------------------------------------------------------------------------------------------------------
 	public                                    o                 o                      o               o        
 	protected                                 o                 o                      o               x
 	default(기본값     아무것도 안쓴거)                 o                 o                      x               x
 	private                                   o                 x                      x               x
*/



//여기는 그외의 영역  
public class AccessModifierChildTestMain {

	public static void main(String[] args) {
		
		AccessModifierTest obj = new AccessModifierTest();
		
		System.out.println("obj.userid"); // public
	//	System.out.println(obj.passwd); // 접근제한자때문에 오류발생!...protected
	//	System.out.println(obj.name); // 접근제한자때문에 오류발생!...defalut
	//	System.out.println(obj.address); // 접근제한자때문에 오류발생!...private

	}

}

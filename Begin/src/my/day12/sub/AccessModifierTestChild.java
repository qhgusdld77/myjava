package my.day12.sub;

/*
	접근제한자(접근지정자, accessmodigifier)	자기자신클래스내부	동일패키지에있는다른클래스	다른패키지에있는 하위(자식)클래스	그외의 영역
 	--------------------------------------------------------------------------------------------------------
 	public                                    o                 o                      o               o        
 	protected                                 o                 o                      o               x
 	default(기본값     아무것도 안쓴거)                 o                 o                      x               x
 	private                                   o                 x                      x               x
*/
import my.day12.AccessModifierTest; //동일 패키지는 import안해도되 다른패키지니까 해야되

public class AccessModifierTestChild extends  AccessModifierTest {
	
	String email = "super@gmail.com";
	
	public void show() {
		/*this*/super.userid = "batman";
		this.passwd = "asdf1234$";
	//	this.name //접근제한자때문에 오류발생!...defalut
	//  this.address // 접근제한자때문에 오류발생!...private
	}
	

}

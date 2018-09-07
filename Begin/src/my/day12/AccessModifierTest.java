package my.day12;

/*
 	접근제한자(접근지정자, accessmodigifier)	자기자신클래스내부	동일패키지에있는다른클래스	다른패키지에있는 하위(자식)클래스	그외의 영역
 	--------------------------------------------------------------------------------------------------------
 	public                                    o                 o                      o               o        
 	protected                                 o                 o                      o               x
 	default(기본값     아무것도 안쓴거)                 o                 o                      x               x
 	private                                   o                 x                      x               x
 	
*/

public class AccessModifierTest {
	
	public String userid = "superman";
	protected String passwd = "asdf1234$";
	String name = "이순신"; // 이게 defalut
	private String address = "서울시 종로구";

}

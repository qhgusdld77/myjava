/*
 	==== **** 사용자 정의 예외절 만들기 **** ====
 		1. Exception 클래스를 상속받는다.
 		2. 생성자를 구성해서 예외메시지(오류메시지)를 등록해주면 끝난다.
*/

package my.day17;

public class UserDefineExceptionID extends Exception{
	
	//기본생성자
	public UserDefineExceptionID() {
		super("ID명은 최소길이가 5글자 이상이어야 합니다.");
	}
	
	//파라미터가 있는 생성자
	public UserDefineExceptionID(String errorMsg) {
		super(errorMsg);
	}

}

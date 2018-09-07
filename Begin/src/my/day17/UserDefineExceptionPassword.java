/*
 	==== **** 사용자 정의 예외절 만들기 **** ====
 		1. Exception 클래스를 상속받는다.
 		2. 생성자를 구성해서 예외메시지(오류메시지)를 등록해주면 끝난다.
*/

package my.day17;

public class UserDefineExceptionPassword extends Exception {
	
	//기본생성자
	public UserDefineExceptionPassword() {
		super("암호는 최소길이가 8글자 이상 영문자, 숫자, 특수문자가 혼합되어야 합니다.");
	}
	
	//파라미터가 있는 생성자
	public UserDefineExceptionPassword(String errorMsg) {
		super(errorMsg);
	}

}

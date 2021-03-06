package my.day8;

public class ArrayTest3 {

	
	public void passwordCheck(String passwd) {
		
		if(passwd.length()/*문자열 길이! 배열길이 아니다*/<8) {
			System.out.println(">> 암호의 길이는 8글자 이상이어야 사용가능합니다.");
		}
		else {
			char[] chArr = passwd.toCharArray();
		
			boolean flagAlphabet = false, flagNumber = false, flagSpecial = false;
			
			//입력한 글자 한개한개를 배열에 넣는다
			for(int i=0; i<chArr.length; i++ ) {
			//	System.out.println("chArr["+i+"] =>"+chArr[i]);
				
				if('A' <= chArr[i] && chArr[i] <= 'Z' || 
					'a' <= chArr[i] && chArr[i] <= 'z')
					
					flagAlphabet = true; //-----------------영문자를 입력하면 true
				
				else if('0' <= chArr[i] && chArr[i] <= '9')
					flagNumber = true; //-----------------숫자를 입력하면 true
				
				else
					flagSpecial = true;
				
				}//end of for--------------------------
				
				if(flagAlphabet && flagNumber && flagSpecial)
					System.out.println(">> "+passwd+"는 암호로 사용가능합니다.");
				else 
					System.out.println(">> 암호는 영문자, 숫자, 특수기호가 혼합되어야만 사용가능합니다.");
	
		}//end of if else
	}
	
	
	
	public static void main(String[] args) {
		
		ArrayTest3 obj = new ArrayTest3();
		
		String passwd1 = "qw34$";
		obj.passwordCheck(passwd1);
		System.out.println();
		
		String passwd2 = "qwer1234";
		obj.passwordCheck(passwd2);
		System.out.println();
		
		String passwd3 = "qwer1234$";
		obj.passwordCheck(passwd3);

	}//end of main()---------------------------------

}

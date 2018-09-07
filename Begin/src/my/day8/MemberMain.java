package my.day8;


public class MemberMain {

	public static void main(String[] args) {
		
		
		//멤버클래스 객체를 배열로 만들어 5개 , 초기치 null
		Member[] memberArr = new Member[5];
		
	/*	for(int i=0; i<memberArr.length; i++)
			System.out.println("memberArr["+i+"] =>"+memberArr[i]);*/
	
	/*
	 	memberArr[0] =>null
		memberArr[1] =>null
		memberArr[2] =>null
		memberArr[3] =>null
		memberArr[4] =>null
	*/
	
	Member mem1 = new Member();
	//객체가 생성되었으면 true
	boolean bool = mem1.MakeMember("leess", "abcd1234$", "이순신", "서울시 종로구");
	
	//ㅠㅐ스워드 쓸수없으명~~
	if(!bool) mem1 = null;
	System.out.println(mem1.name);
	
	//mem1이 널이 아니면 배열속에 넣어줘라, 패스워드가 올바르면 배열속에 넣어줘라
	if(mem1 != null) {
		memberArr[0] = mem1;
	}
	
	
	
	}//end of main

}

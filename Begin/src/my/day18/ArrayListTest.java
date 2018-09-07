/*
     == ArrayList == 
     1. 출력시 저장된 순서대로 나온다.
     2. 중복된 데이터를 저장할 수 있다.
     3. 데이터를 읽어오는 속도는 ArrayList 가 LinkedList 보다 상대적으로 빠르다.
     4. 순차적으로 데이터를 추가/삭제하는 경우에는 ArrayList 가 LinkedList 보다 상대적으로 빠르다.
     5. 일반적인 데이터 추가/삭제는 데이터 중간 중간마다 발생하므로 이러한 경우에는 ArrayList 가 LinkedList 보다 상대적으로 느리다.
     6. 결과값은 ArrayList 를 사용하든지 LinkedList 를 사용하든지 동일한 결과값을 가진다.
     7. LinkedList 보다는 ArrayList 를 사용하도록 하자.
     
     ArrayList (저장소) //메모리 주소가 아니라 인덱스값
     
           유재석(0) 엄정화(1) 강호동(2) 이순신(3) 김태희(4)
           
           엄정화를 삭제한다고 하자  데이터를 지우면 순차적으로 값을 옮겨야된다. 데이터를 지운 후 옮기는 작업도 해야되
           유재석(0) 강호동(1) 이순신(2) 김태희(3)
           
           엄정화를 유재석 다음에 오게 해보자,, 그러면 데이터가 들어오고 데이터를 한 칸 씩 미는 작업도 해야되 
     
     
*/


package my.day18;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
	
	//1. Member 클래스의 객체만을 저장할 수 있는 ArrayList 객체 memberList 를 생성하시오.
		
		List<Member> memberList = new ArrayList<Member>();

	//2. Member 클래스의 객체 6개를 생성하여 memberList에 저장하세요.	
		/*
		 	youjs  eom  kanghd  leess  kimth  kangkc
		*/
		
		memberList.add(new Member("youjs","asdf1234","유재석"));
		memberList.add(new Member("eom","asdf1234","강정화"));
		memberList.add(new Member("kangggggghd","asdf1234","강호동"));
		memberList.add(new Member("leess","asdf1234","이순신"));
		memberList.add(new Member("kimth","asdf1234","김태희"));
		memberList.add(new Member("leess","asdf1234","이순신"));
		memberList.add(new Member("kangkc","asdf1234","강감찬"));
		
	//3. memberList에 저장되어진 모든 회원들의 정보를 출력하세요.	
		for(int i=0; i<memberList.size(); i++) {
			memberList.get(i).showInfo();
		}
		System.out.println("---- or ----\n");
		for(Member mem : memberList) {
			mem.showInfo();
		}

		System.out.println("[퀴즈] memberList 에 저장되어진 회원중 id가 \"kimth\"인 사람만 출력하세요.");
		//찾고자하는 아이디의 인덱스번호 몰라
		for(int i=0; i<memberList.size(); i++) {
			if("kimth".equals(memberList.get(i).getId())) {
				memberList.get(i).showInfo();
				break;
			}
		}
		
		
		
		System.out.println("[퀴즈] memberList 에 저장되어진 회원중 성이 \"강\" 씨인 사람만 출력하세요.");
		
		for(int i=0; i<memberList.size(); i++) {
			if(memberList.get(i).getName().startsWith("강"))
				memberList.get(i).showInfo();
		}
		System.out.println("---- or ----\n");
		
		for(Member mem : memberList) {
			if(mem.getName().startsWith("강"))
				mem.showInfo();
		}
		
		
		System.out.println("--- ID에 g가 들어가는 것만 출력하세요 ---");
		
		for(int i=0; i<memberList.size(); i++) {
			char[] memChar = memberList.get(i).getId().toCharArray();
			for(int j=0; j<memChar.length; j++) {
				if('g'==(memChar[j])) {
					memberList.get(i).showInfo();
					break;
				}
			}
		}
		
		
		// === memberList 에 새로운 member 객체 추가하기 ===
		memberList.add(new Member("seolh","asdf1234","설현"));
		
		// === memberList 에 새로운 member 객체 추가시 특정 인덱스에 위치하도록 하기 ===
		memberList.add(3, new Member("irin","asdf1234","아이린"));
				
		System.out.println("=== 새로운 회원 추가 === ");
		for(int i=0; i<memberList.size(); i++) {
			System.out.println("---- index : "+ i + "----");
			memberList.get(i).showInfo();
		}
		/*for(Member mem : memberList) {
		mem.showInfo();
		}*/
		
		
		System.out.println("=== memberList 에서 특정 객체 삭제하기 ===");
		memberList.remove(3); //특정 인덱스 번호(지금은 3)에 위치한 객체 삭제하기
		
		System.out.println("=== 회원삭제후 ===");
		for(int i=0; i<memberList.size(); i++) {
			System.out.println("---- index : "+ i + "----");
			memberList.get(i).showInfo();
		}
		/*for(Member mem : memberList) {
		mem.showInfo();
		}*/
		
		System.out.println("\n==== 특정 인덱스 위치에 있던 객체를 삭제하고서 새로운 객체로 대체하기 ====");
		memberList.set(3, new Member("suji","asdf1234","수지"));
		//인덱스 번호 3에 있던 객체를 삭제하고서 그 자리에 suji 객체를 넣어주는 것이다.
		
		for(int i=0; i<memberList.size(); i++) {
			System.out.println("---- index : "+ i + "----");
			memberList.get(i).showInfo();
		}
		
		System.out.println("\n[퀴즈] 성이 \"강\" 씨인 회원만 삭제하세요");
		for(int i=0; i<memberList.size(); i++) {
			if(memberList.get(i).getName().startsWith("강"))
				memberList.remove(i--);	
		}
		for(int i=0; i<memberList.size(); i++) {
			System.out.println("---- index : "+ i + "----");
			memberList.get(i).showInfo();
		}
		
		System.out.println("\n=== memberList 에 저장되어진 모든 객체 삭제하기 ===");
		memberList.clear();//모든 객체 삭제하기 이건 용기가 있는데 내용물 걷어내는거
	//	memberList = null; //이건 memberList를 없애버리는거 용기를 없애버리는거
		
		for(int i=0; i<memberList.size(); i++) {
			System.out.println("---- index : "+ i + "----");
			memberList.get(i).showInfo();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//end of main()---------------------------------------------

}

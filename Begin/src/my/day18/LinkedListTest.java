/*
     == LinkedList == 
     1. 출력시 저장된 순서대로 나온다.
     2. 중복된 데이터를 저장할 수 있다.
     3. 데이터를 읽어오는 속도는 LinkedList 가 ArrayList 보다 상대적으로 느리다.
     4. 순차적으로 데이터를 추가/삭제하는 경우에는 LinkedList 가 ArrayList 보다 상대적으로 느리다.
     5. 일반적인 데이터 추가/삭제는 데이터 중간 중간마다 발생하므로 이러한 경우에는 LinkedList 가  ArrayList 보다 상대적으로 빠르다.
     6. 결과값은 ArrayList 를 사용하든지 LinkedList 를 사용하든지 동일한 결과값을 가진다.
     7. LinkedList 보다는 ArrayList 를 사용하도록 하자.
     
     LinkedList (저장소) //연결되어진 리스트,,주소를 찾아간다. 그래서 ArrayList보다 느리다.  
                                                                                                             
	 (null)유재석(1372자신의 메모리주소)
	 --- 연결(Link) ---(앞서 존재하던 메모리주소1372)엄정화(3236자신의 메모리주소)
	 --- 연결(Link) ---(앞서 존재하던 메모리주소3236)강호동(1034자신의 메모리주소)
	 --- 연결(Link) ---(앞서 존재하던 메모리주소1034)이순신(2340자신의 메모리주소)
	 --- 연결(Link) ---(앞서 존재하던 메모리주소2340)김태희(5236자신의 메모리주소)
	 
	 데이터를 지우면 자신의 메모리주소를 참조하고 있던 뒤에 데이터한태 자신이 참조하고 있던 메모리 주소를 넘겨주고 삭제된다.
	 
*/


package my.day18;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		
		//1. Member 클래스의 객체만을 저장할 수 있는 LinkedList 객체 memberList 를 생성하시오.
			
			List<Member> memberList = new LinkedList<Member>();

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
			
			/*for(Member mem : memberList) {
				mem.showInfo();
			}*/
			System.out.println("=== 새로운 회원 추가 === ");
			for(int i=0; i<memberList.size(); i++) {
				System.out.println("---- index : "+ i + "----");
				memberList.get(i).showInfo();
			}
			
			System.out.println("=== memberList 에서 특정 객체 삭제하기 ===");
			memberList.remove(3); //특정 인덱스 번호(지금은 3)에 위치한 객체 삭제하기
			
			/*for(Member mem : memberList) {
				mem.showInfo();
			}*/
			System.out.println("=== 회원삭제후 ===");
			for(int i=0; i<memberList.size(); i++) {
				System.out.println("---- index : "+ i + "----");
				memberList.get(i).showInfo();
			}
			
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

	}

}

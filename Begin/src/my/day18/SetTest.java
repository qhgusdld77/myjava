/*
     == HashSet == 
     1. 출력시 저장된 순서가 유지되지 않는다.
     2. 중복된 데이터를 저장할 수 없다.
               그러므로 Collection 내의 중복된 요소들을 저장하지 않고자 할때 많이 사용된다.
               
     == LinkedHashSet ==
     1. 출력시 저장된 순서가 유지된다.
     2. 중복된 데이터를 저장할 수 없다.
                  그러므로 Collection 내의 중복된 요소들을 저장하지 않고자 할때 많이 사용된다. 
                  
                         
	 Set은  terator()!!!
	 (Iterator<Member> it = memberHashSet.iterator();)
*/
package my.day18;

import java.util.*;

public class SetTest {

	public static void main(String[] args) {
		System.out.println("\n======== HashSet ========\n");
		
		//1. Member 클래스의 객체만을 저장할 수 있는 HashSet 객체 memberHashSet 를 생성하시오.
		Set<Member> memberHashSet = new HashSet<Member>();
		
		//2. Member 클래스의 객체 6개를 생성하여 memberHashSet에 저장하세요.
		memberHashSet.add(new Member("youjs","asdf1234","유재석"));
		memberHashSet.add(new Member("eom","asdf1234","강정화"));
		memberHashSet.add(new Member("kanghd","asdf1234","강호동"));
		memberHashSet.add(new Member("leess","asdf1234","이순신"));
		memberHashSet.add(new Member("kimth","asdf1234","김태희"));
		memberHashSet.add(new Member("kangkc","asdf1234","강감찬"));
		
  //----------------------------------------------------------------//
		//이거 헷갈려 잘 안써 그래서 HashMap써
		
		Member mem1 = new Member("suji","asdf1234","수지");
		Member mem2 = new Member("suji","asdf1234","수지");
		
		memberHashSet.add(mem1);
		memberHashSet.add(mem2);
		
  //----------------------------------------------------------------//
		Member mem3 = new Member("car","asdf1234","차은우");
		Member mem4 = new Member("gold","asdf1234","차금우");
		
		mem4 = mem3;
		
		memberHashSet.add(mem3);
		memberHashSet.add(mem4);
		
		//3. memberHashSet에 저장되어진 모든 회원들의 정보를 출력하세요.
		Iterator<Member> it/*임시 저장공간*/ = memberHashSet.iterator();
		
		while(it.hasNext()/*있냐*/) {
			Member member = it.next();
			member.showInfo();//순서대로 출력안돼
		}
		
		//4. memberHashSet에 저장되어진 모든 회원들에서 id가 "kimth"인 사람의 정보를 출력하세요.
		System.out.println("[퀴즈] memberHashSet 에 저장되어진 회원중 id가 \"kimth\"인 사람만 출력하세요.\n");
		
		it = memberHashSet.iterator();//이거 안쓰면 아무것도 안나와,, 위에서 다 써서 저장공간이 다 비어있어서,, 다시 한번 생성해줘야해
		
		while(it.hasNext()) {
			Member member = it.next();
			if("kimth".equals(member.getId()))
				member.showInfo();
		}
		
		/*//5. memberHashSet에 저장되어진 모든 회원들에서 id가 "kimth"인 사람의 정보를 삭제하세요.
		System.out.println("[퀴즈] memberHashSet 에 저장되어진 회원중 id가 \"kimth\"인 사람만 삭제하세요.\n");
		
		it = memberHashSet.iterator();
		
		while(it.hasNext()) {
			Member member = it.next();
			if("kimth".equals(member.getId())) {
				memberHashSet.remove(member);
				break;
			}
				
		}
		System.out.println("=== 삭제한 후 전체 조회 ===");
		it = memberHashSet.iterator();
		
		while(it.hasNext()있냐) {
			Member member = it.next();
			member.showInfo();//순서대로 출력안돼
		}*/
		
		//5. memberHashSet에 저장되어진 모든 회원들에서 id가 "suji"인 사람의 정보를 삭제하세요.
			System.out.println("[퀴즈] memberHashSet 에 저장되어진 회원중 id가 \"suji\"인 사람만 삭제하세요.\n");
			//HashMap을 써서해라
			
			it = memberHashSet.iterator();
			
			while(it.hasNext()) {
				Member member = it.next();
				if("kimth".equals(member.getId())) {
					memberHashSet.remove(member);
					break; //이거 수지 한개만 삭제되
				}
					
			}
			System.out.println("=== suji 삭제한 후 전체 조회 ===");
			it = memberHashSet.iterator();
			
			while(it.hasNext()/*있냐*/) {
				Member member = it.next();
				member.showInfo();//순서대로 출력안돼
			}
		
		
		
		System.out.println("\n===== LinkedHashSet =====\n");
		/*
		 	LinkedHashSet은 입력한 순서대로 저장되고 출력된다. HashSet은 순서대로 출력이 안돼 그거만 차이나 똑같으
		*/
			
			//1. Member 클래스의 객체만을 저장할 수 있는 HashSet 객체 memberHashSet 를 생성하시오.
			Set<Member> memberLinkedHashSet = new HashSet<Member>();
			
			//2. Member 클래스의 객체 6개를 생성하여 memberHashSet에 저장하세요.
			memberLinkedHashSet.add(new Member("youjs","asdf1234","유재석"));
			memberLinkedHashSet.add(new Member("eom","asdf1234","강정화"));
			memberLinkedHashSet.add(new Member("kanghd","asdf1234","강호동"));
			memberLinkedHashSet.add(new Member("leess","asdf1234","이순신"));
			memberLinkedHashSet.add(new Member("kimth","asdf1234","김태희"));
			memberLinkedHashSet.add(new Member("kangkc","asdf1234","강감찬"));
			
	  //----------------------------------------------------------------//
			//이거 헷갈려 잘 안써 그래서 HashMap써
			
			Member mem5 = new Member("suji","asdf1234","수지");
			Member mem6 = new Member("suji","asdf1234","수지");
			
			memberLinkedHashSet.add(mem5);
			memberLinkedHashSet.add(mem6);
			
	  //----------------------------------------------------------------//
			Member mem7 = new Member("car","asdf1234","차은우");
			Member mem8 = new Member("gold","asdf1234","차금우");
			
			mem4 = mem3;
			
			memberLinkedHashSet.add(mem7);
			memberLinkedHashSet.add(mem8);
			
			//3. memberLinkedHashSet에 저장되어진 모든 회원들의 정보를 출력하세요.
			Iterator<Member> it2/*임시 저장공간*/ = memberLinkedHashSet.iterator();
			
			while(it2.hasNext()/*있냐*/) {
				Member member = it2.next();
				member.showInfo();//순서대로 출력안돼
			}
			
			//4. memberLinkedHashSet에 저장되어진 모든 회원들에서 id가 "kimth"인 사람의 정보를 출력하세요.
			System.out.println("[퀴즈] memberHashSet 에 저장되어진 회원중 id가 \"kimth\"인 사람만 출력하세요.\n");
			
			it = memberLinkedHashSet.iterator();//이거 안쓰면 아무것도 안나와,, 위에서 다 써서 저장공간이 다 비어있어서,, 다시 한번 생성해줘야해
			
			while(it2.hasNext()) {
				Member member = it2.next();
				if("kimth".equals(member.getId()))
					member.showInfo();
			}
			
			/*//5. memberLinkedHashSet에 저장되어진 모든 회원들에서 id가 "kimth"인 사람의 정보를 삭제하세요.
			System.out.println("[퀴즈] memberLinkedHashSet 에 저장되어진 회원중 id가 \"kimth\"인 사람만 삭제하세요.\n");
			
			i2 = memberLinkedHashSet.iterator();
			
			while(it2.hasNext()) {
				Member member = it2.next();
				if("kimth".equals(member.getId())) {
					memberHashSet.remove(member);
					break;
				}
					
			}
			System.out.println("=== 삭제한 후 전체 조회 ===");
			it2 = memberLinkedHashSet.iterator();
			
			while(it2.hasNext()있냐) {
				Member member = it.next();
				member.showInfo();//순서대로 출력안돼
			}*/
			
			//5. memberLinkedHashSet에 저장되어진 모든 회원들에서 id가 "suji"인 사람의 정보를 삭제하세요.
				System.out.println("[퀴즈] memberLinkedHashSet 에 저장되어진 회원중 id가 \"suji\"인 사람만 삭제하세요.\n");
				
				it2 = memberLinkedHashSet.iterator();
				
				while(it2.hasNext()) {
					Member member = it2.next();
					if("kimth".equals(member.getId())) {
						memberLinkedHashSet.remove(member);
						break; //이거 못써 수지 한개만 삭제되
					}
						
				}
				System.out.println("=== suji 삭제한 후 전체 조회 ===");
				it2 = memberLinkedHashSet.iterator();
				
				while(it2.hasNext()/*있냐*/) {
					Member member = it2.next();
					member.showInfo();//순서대로 출력안돼
				}

	}//end of main()----------------------------

}

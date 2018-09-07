/*
    === Map 계열 ===
    1. HashMap 과 Hashtable 이 있다.
    2. Map 계열은 List 계열(Vector, ArrayList)처럼 index 가 사용되어 저장되는 것이 아니라, 
       Map 계열은 key값과 value값을 쌍으로 사용하여 저장하는데  
               데이터 저장시 사용되는 메소드는 put(String key, Object value)메소드를 사용한다.
               이때"key"값은 반드시 "고유한 값"을 가져야 하고, value값은 중복된 값이 와도 괜찮다.
    3. Map 계열에 저장된 key값들은 순서와는 상관없이 저장된다.  
    4. Map 계열에 저장된 value값을 추출하려면 key를 이용해서 가져오는데 
       value 값의 추출은 get(String key) 메소드를 사용한다.
*/

package my.day18;

import java.util.*;

/*import java.util.Collection;
import java.util.HashMap;
import java.util.Set;*/

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String, Member> memberMap = new HashMap<String, Member>();
		
		memberMap.put("youjs", new Member("youjs","asdf1234","유재석"));
		memberMap.put("eom", new Member("eom","asdf1234","강정화"));
		memberMap.put("kanghd", new Member("kanghd","asdf1234","강호동"));
		memberMap.put("leess", new Member("leess","asdf1234","이순신"));
		
		//value값은 중복허용하지만 key값은 중복안돼
		memberMap.put("kimth", new Member("kimth","asdf1234","김태희"));
		memberMap.put("kangkc", new Member("kimth","asdf1234","김태희"));
		//key값 중복되면
		memberMap.put("leess", new Member("leess","asdf1234","이순신"));// 중복안돼
		memberMap.put("leess", new Member("leess","asdf1234","Lee SunSin"));// 덮어씌운다
		
		
		

		System.out.println("[퀴즈] memberMap 에 저장되어진 회원중 id가 \"leess\"인 사람만 출력하세요.");
		//특정한 것을 찾고싶다면 HashMap
		Member mem = memberMap.get("leess");
		mem.showInfo();
		
		System.out.println("[퀴즈] memberMap 에 저장되어진 모든 회원의 정보를 출력하세요.");
		//이때는 ArrayList
		/*
			== Keset() ==
		 	memberMap 에 저장된 모든 키 값들을 안다면 추출이 가능할 것이다.
		 	memberMap 에 저장된 모든 키 값들을 알려주는 메소드가 keySet() 메소드이다.
		*/
		
		//Set(인터페이스)도 저장소 중에 한개다..중복은 절대 허용하지 않는다
		Set<String> keysets = memberMap.keySet();
		for(String key : keysets) {
			System.out.println("key => "+key);
		}
		
		System.out.println();
		System.out.println("=== keySet() 메소드를 사용하여 memberMap 에 저장된 모든 value 값 출력하기 ===");
		//순서대로 출력은 안된다. 순서대로 출력하고 싶으면List써라
		for(String key : keysets) {
			Member member = memberMap.get(key);
			member.showInfo();
		}
		
		
		System.out.println("=== value() 메소드를 사용하여 memberMap 에 저장된 모든 value 값 출력하기 ===");
		Collection<Member> collect = memberMap.values();
		
		for(Member member :collect) {
			member.showInfo();
		}//이것도 되네
		
		System.out.println("------------------------------------------------------");
		/*
		 	HashMap객체명.values() 메소드는
		 	HashMap객체명에 저장된 value값만 뽑아주는 메소드이다.
		 	Collection<V> 은 단독으로는 사용불가하며,
		 	iterator() 라는 메소드를 사용하여 Iterator 타입으로 
		 	변경해야만 사용가능하다.
		*/
		
		Iterator<Member> itMember = collect.iterator();
		
		while (itMember.hasNext()/*있나 없나만 확인*/) {
		/*
		 	itMember.hasNext() 은 저장소 itMember에 저장되어진 Member 를 하나하나씩 
		 	조사해서 존재하면 true를 리턴 존재하지 않으면 false를 리턴해주는 메소드이다.
		*/
			Member member = itMember.next();
			//itMember.next() 은 저장소 itMember 에서 저장되어진  Memger를 꺼내오는 메소드이다.
			member.showInfo();
		}
			
		System.out.println("[퀴즈] memberMap 에 저장되어진 회원중 id가 \"leess\"객체를 삭제하세요.\n");
		
		memberMap.remove("leess");
		
		System.out.println("=== leess 삭제후 전체 조회 ===");
		for(String key : keysets) {
			System.out.println("key => "+key);
		}
		System.out.println();
		
		itMember = collect.iterator();
		
		while (itMember.hasNext()) {
			Member member = itMember.next();
			member.showInfo();
		}
		


	}//end of main()----------------

}

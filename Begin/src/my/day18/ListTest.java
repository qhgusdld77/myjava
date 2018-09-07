/*
 	==== 배열(Array)과 자료구조(Collection)의 차이점 ====
 	
 	1. 배열(Array)은 오로지 동일한 데이터 타입만 들어가는 저장소이다.
                배열(Array)은 그 크기가 한번 정해지면 크기를 변경할 수 없다!!
       int[] arr = new int[5] --> int만 들어가 double,String 안돼
 		
 	2. 자료구조(Collection)은 동일한 타입의 객체가 아니더라도
                객체타입이기만 하면 모두 들어가는 저장소이다.
                자료구조(Collection)은 저장되는 크기가 자동적으로 늘어난다!!
                
                웹이서 가장 많이 사용하는 대표적인 collection 타입은 
       List 계열과  Map이다.
       
       ------------------------------------------------------------------
                       Web에서 주로 사용                       게임프로그래밍에서 주로 사용
                    (Single Thread 방식)       (Multi Thread 방식)
       ------------------------------------------------------------------             
         List 계열                  ArrayList                 Vector
         Map 계열                       HashMap                 Hashtable
       
       
       ArrayList 및 HashMap 은 Multi Thread를 지원안해주므로 가볍다(메모리를 적게 쓴다)
       Vector 및 Hashtable 이 Multi Thread를 지원해주므로 무겁다(메모리를 많이 쓴다)
       
       Multi Thread를 지원해주느냐 안해주느냐만 차이가 있을뿐 그 나머지 기능은 동일하다.
  	   
*/


/*
   JDK 1.5 부터 제네릭(Generic)타입이 새로 추가되었는데, 제네릭(Generic)을 이용함으로써 잘못된 타입이
       사용될 수 있는 문제를 컴파일 과정에서 제거할 수 있게 되었다. 
       프로그램 실행시 타입 에러가 발생하여 작동이 멈추는 것보다는 컴파일시에 타입에러가 발생하도록 하여 
       프로그램 실행시 에러를 발생하지 않도록 사전에 방지하는 것이 좋기 때문이다.
       
         ▷ 제네릭(Generic)은 컬렉션(자료구조) 즉, 쉽게 말해서 객체들을 저장(수집)하는 구조적인 성격을 보강하기 위해 제공하는 것이다.
         ▷ 간단히 예를 들자면 컵이라는 특정 객체가 있다고 하자. 
          이 컵은 물만 담을 수 있는 물컵 , 또는 이 컵은 쥬스만 담을 수 있는 쥬스 컵. 이렇게 지정해주도록 하는 것이  제네릭(Generic) 이다.    
    
         ▷  JDK 1.5 부터 제네릭(Generic)타입이 새로 추가되면서, 특정 컬렉션(자료구조)에 저장되어질 특정한 객체 타입을 명시하여
         실행하기전 컴파일 단계에서 특정한 객체 타입이 아니면 에러를 발생토록 하여 저장이 불가능하도록 만들었다.
         즉, 특정 컬렉션(자료구조)에 저장되어질 객체의 타입을 제한하도록 만든 것이다.
    
        ▷   제네릭(Generic)타입을 사용하기 이전에는  컬렉션(자료구조)에 저장되어진 객체들을 하나씩 검출하여 객체 타입을 확인할 수 밖에 없었다.
     Object 로 부터 상속받은 객체는 모두 저장이 가능했던 이전의 버전들과는 달리 보다 체계적이라 할 수 있다.
      
        ▷ 제네릭(Generic)타입을 사용함으로써 별도의 형 변환(Casting)이 필요없이 <> 사이에 선언하였던 객체자료형으로 검출되어 편리하다.       
    
        ▷ 제네릭(Generic)타입에 있어서 1개 글자로 된 영문대문자는 영문대문자 아무것이나 사용해도 무관하다.
     -- 그런데 관습상 객체가 제네릭(Generic)타입으로 사용될때 자료형(Type)이라고 나타내고 싶을때는 <T>라고 쓰고,
                  어떠한 요소(Element)이라고 나타내고 싶을때는 <E>라고 쓰고, 
        key값이라고 나타내고 싶을때는 <K>라고 쓰고, Value값이라고 나타내고 싶을때는 <V>라고 쓴다.      
        
*/

package my.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ListTest {

	public static void main(String[] args) {

		Vector vt = new Vector(5,3);//용량5 꽉차면 3씩 증가
		
		System.out.println("벡터 vt 의 용량 : "+vt.capacity());
		//벡터 vt 의 용량 : 5
		System.out.println("벡터 vt 에 저장된 현재 크기 : "+vt.size());
		//벡터 vt 에 저장된 현재 크기 : 0
		System.out.println();
		
		String[] strArr = {"일순신","이순신","삼순신","사순신","오순신"};		
		Member[] memArr = {new Member("hongkd","qwer1234","홍길동"),
    						new Member("leekd","qwer1234","이길동"),
							new Member("kimkd","qwer1234","김길동"),
							new Member("parkkd","qwer1234","박길동") 
							};
		
		vt.add(strArr[0]);
		//벡터에 요소(element)넣기
		//Vector객체명.add(넣어야할 객체);
		
		for(int i=1; i<strArr.length; i++) {
			vt.add(strArr[i]);
		}
		
		System.out.println("벡터 vt 의 용량 : "+vt.capacity());
		//벡터 vt 의 용량 : 5
		System.out.println("벡터 vt 에 저장된 현재 크기 : "+vt.size());
		//벡터 vt 에 저장된 현재 크기 : 5
		System.out.println();
		
		
		
		//용량이 다 채워졌는데 늘어난다 3씩
		vt.add(memArr[0]);
		
		System.out.println("벡터 vt 의 용량 : "+vt.capacity());
		//벡터 vt 의 용량 : 8(5+3)
		System.out.println("벡터 vt 에 저장된 현재 크기 : "+vt.size());
		//벡터 vt 에 저장된 현재 크기 : 6
		System.out.println();
		
		for(int i=1; i<memArr.length; i++) {
			vt.add(memArr[i]);
		}
		
		System.out.println("벡터 vt 의 용량 : "+vt.capacity());
		//벡터 vt 의 용량 : 11(8+3)
		System.out.println("벡터 vt 에 저장된 현재 크기 : "+vt.size());
		//벡터 vt 에 저장된 현재 크기 : 9
		
		System.out.println("=============== ArrayList =====================");
		
		//어떠한 객체를 만들어서 사용할때 이클래스의 부모클래스든 뭐든?? 몰라 둘다 똑같은거래
	//	ArrayList list = new ArrayList();
		List list = new ArrayList();
		
		System.out.println("ArrayList list 의 현재크기 => "+list.size());
		//ArrayList list 의 현재크기 => 0
		
		for(int i=0; i<strArr.length/*5개*/; i++) {
			list.add(strArr[i]); // list에 데이터 입력하기 .. 메소드 add!!! 기억해라 
		}
		
		System.out.println("ArrayList list 의 현재크기 => "+list.size());
		//ArrayList list 의 현재크기 => 5
		
		for(int i=0; i<memArr.length/*4개*/; i++) {
			list.add(memArr[i]); // list에 데이터 입력하기 .. 메소드 add!!! 기억해라 
		}
		
		System.out.println("ArrayList list 의 현재크기 => "+list.size());
		//ArrayList list 의 현재크기 => 9
		
		Integer[] intArr = {new Integer(100),new Integer(200),new Integer(300)};
		
		for(int i=0; i<intArr.length/*3개*/; i++) {
			list.add(intArr[i]); // list에 데이터 입력하기 .. 메소드 add!!! 기억해라 꼭 기억해라ㅏㅏ
		}
		
		System.out.println("ArrayList list 의 현재크기 => "+list.size());
		//ArrayList list 의 현재크기 => 12
		
		System.out.println("\n>>> 데이터 꺼내오기 <<<\n");
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) instanceof String) {
				System.out.println(i+"."+(String)list.get(i)/*get()값을 꺼내온다.*/);
			}
			else if(list.get(i) instanceof Member) {
				System.out.println(i+"."+((Member)list.get(i))/*생략가능.toString()*/);
			}
			else if(list.get(i) instanceof Integer) {
				System.out.println(i+"."+(Integer)list.get(i));
			}
			else
				System.out.println(list.get(i));
			
		}
		
		
		System.out.println("================ Generic ======================");
		
		List<String> nameList = new ArrayList<String>();//String 타입의 객체만 받겠다. 용량은 무한대
		//<E> 을 Generic 이라고 부르는데 JDK 1.5버전 이후 부터 사용되었다.
		//<E> 의 E는 Element를 뜻하는 것으로 클래스명이 들어온다.
		//nameList 에 저장되는 객체는 <E>의 E에 들어오는 클래스만 가능하다는 말이다.
		
		for(int i=0; i<strArr.length; i++) {
			nameList.add(strArr[i]);
		}
		
		List<Member> memberList = new ArrayList<Member>();
		
		for(int i=0; i<memArr.length; i++) {
			memberList.add(memArr[i]);
		}
		
		List<Integer> intList = new ArrayList<Integer>();
		
		intList.add(new Integer(90));
		intList.add(85);// int 타입인 85를 자동적으로 자바가 new Integer(85)로 해준다.
				        // 이것을 "auto Boxing" 이라고 부른다.
		
		System.out.println("\n>>> 데이터 꺼내오기 <<<");
		
		for(int i=0; i<nameList.size(); i++) {
			System.out.println(nameList.get(i));
		}
		
		for(Member mem : memberList) {
			System.out.println(mem);
		}
		
		for(Integer i : intList) {
			System.out.println(i);
		}
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		for(int i : intList) {    //intList에 저장되어진 Integer 객체타입을 자동적으로 int 타입으로 변경해주는것이다.
			System.out.println(i);//즉, Wrapper 클래스의 객체타입으로 되어진 것을 자동적으로 
			                      //원시형타입으로 변경해주는 것을 "auto UnBoxing" 이라 부른다.
		}
		
		
	}//end of main()-----------------

}

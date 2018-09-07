/*

	=== 스레드(Thread)와 프로세스(Process) 개요 ===
	스레드의 개념을 살펴보기 전에 먼저 프로세스(Process)개념 부터 살펴보기로 하자.

	프로세스란 현재 메모리에 로드되어 CPU의 실행권을 가지고 있는 인스턴스를 의미한다.
	즉, 현재 메모리에 로드되어 실행중인 어떠한 프로그램을 말한다.
	메모장을 클릭하면 하나의 프로세스를 실행하는 것이고, 만약 메모장을 클릭하고서
	동영상 플레이어를 실행했다라면 이것은 두 개의 프로세스가 실행되는 것이다.
	이렇게 여러개의 프로세스가 하나의 CPU에서 실행되는 것을 '멀티태스킹(Multi-tasking)' 이라고 부른다.
	1개의 CPU를 가지고 있는 컴퓨터는 하나의 프로세스만이 CPU의 실행권을 가지고 실행된다.
	하지만 CPU는 아주 작은 시간으로 쪼개어 여러 프로세스를 실행해주기 때문에 사람에게는
	동시에 여러개의 프로세스가 실행되는 것처럼 보여질 뿐이다.
	이러한 프로세스는 각각의 자원을 가지며 실행되어지는데, 프로세스가 실행되기 위해서는 
	프로세스마다 각자의 메모리 영역을 가지고 디스크에 저장된 파일을 읽고 쓰기 위해 
	파일입출력 스트림을 가지게 된다. 하나의 프로세스(A 프로세스)에서 
	다른 프로세스(B 프로세스)로 전환하는 것을 문맥교환(context switching)이라고 부르는데,
	A 프로세스의 자원들을 저장해 둔 다음 B 프로세스에 필요한 자원을 다시 불러서 실행된다.
	그런데 이러한 문맥교환(context switching)은 상당한 시간적 낭비를 초래하므로
	여러개의 CPU를 장착하여 여러개의 프로세스를 처리하도록 하는 '멀티프로세스(Multi-process)' 를 
	사용하는 것이 좋다.	

	이제 스레드에 대해서 알아보기로 하자.
	스레드란 하나의 프로세스 안에서 실행되는 세부작업 단위로서 여러개의 스레드(Multi-thread)가 모여서
	하나의 프로세스를 이루게 된다. 예를들어 네이트온 같은 메신저의 경우 채팅하면서 파일을 다운로드 받거나
	음성대화를 나눌 수 있는 것이 가능한 이유는 해당 프로그래밍 멀티스레드로 작성되어 있기 때문이다.
	여기서 우리가 알아야 할 내용은 하나의 프로세스안에 있는 여러개의 스레드끼리는 자원을 공유한다는 것이다.(CPU공유)
	스레드는 각자 작업시 자원을 공유해서 작업을 하므로 스레드간에 제어권을 넘길때 실행하던 자원을 저장하고 
	다시 불러오는 과정이 없다. 그래서 스레드간에 교착상태(DeadLock)와 같은 문제가 발생되지 않도록 
	동기화(Synchronization)에 신경을 쓰면서 프로그래밍을 해야 한다.
	    ※ 참고 
	  교착상태(DeadLock)이란?
	  - 두 스레드가 자원을 점유한 상태에서 서로 상대방 스레드가 점유한 자원을 사용하려고 기다리다가
	    진행이 멈춰있는 상태를 말한다.   	

	자바는 멀티스레드(Multi-thread)를 지원해주는 프로그래밍 언어이다.
*/

package my.day19;

public class NoThreadMain {

	public static void main(String[] args) {
		NoThreadWho who = new NoThreadWho();
		NoThreadMyname myname = new NoThreadMyname();
		
		who.whoareyou();
		myname.mynameis();
		
		/*
		 	who.whoareyou(); 메소드를 먼저 호출했기 때문데
		 	NoThreadWho 클래스이 인스턴스의 who가 CPU의 실행권을 
		 	계속가지면서 실행하므로 결과값은 who are you?만 출력된다.
		*/

	}

}

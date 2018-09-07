package my.day19.sub;

public class JoinThreadMain {
//join()현재 실행중인 스레드가 끝날때 까지 다른거 못해

	public static void main(String[] args) {
		
		Join1 join1 = new Join1();//Runnable인터페이스를 구현한 객체 이 객체는 Thread객체가 아니다 양보못해
		join1.setId("leess");
		join1.setPasswd("asdf1234$");
		
		Join2 join2 = new Join2();
		join2.setName("이순신");
		join2.setEmail("less@gmail.com");
		
		Join3 join3 = new Join3();
		join3.setTel("010-2652-8564");
		join3.setAddr("서울시 종로구");
		
		
		//Thread 객체를 생성한다. 생성자 인자로 Runnable를 구현한 클래스 객체를 지정한다.
		Thread thr1 = new Thread(join1);
		Thread thr2 = new Thread(join2);
		Thread thr3 = new Thread(join3);
		
/*      
 		=== 먼저 아래의 것을 해보면 순서가 뒤죽박죽으로 나온다.
 			뒤죽박죽 결과를 확인한 후 주석문을 처리한다. ===
 			
        thr2.start();
		thr3.start();
		thr1.start();//JVM이 스케줄러에 의해서 순서없이 처리한다.
*/
		
		try {
			thr2.start();
			thr2.join();//InterruptedException발생할 수 있다.
			/*thr2.join(); 은 스레드 thr2가 종료될때 까지 다른 스레드는 block이 되어진다.
		   	    스레드 thr2가 종료되어지는 순간 block 되어진 다른 스레드들은 다시 동작하게 된다.*/
			
			thr3.start();
			thr3.join();
			
			thr1.start();
			thr1.join();
			
			
		} catch (InterruptedException e) {
			//InterruptedException 은 만약 스레드가 시스템 내부적으로 join하지 못하는 오류가 발생할 경우에 일어나는 익셉션이다.
			//운영체제가 꼬인거야 스레드가 join해서 멈춰야되는데 멈추지 못해서 발생되는 
			e.printStackTrace();//어디가 잘못되었나 추적
		} 
		
		
		
		

	}//end of main()----------------------

}

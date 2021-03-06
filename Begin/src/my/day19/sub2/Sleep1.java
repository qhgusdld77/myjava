/*
	 ==== Thread.sleep(밀리초) 메소드  ====
	  
	   스레드는 기본적으로 우선순위 방식으로 실행이 되기 때문에 ,
	   우선순위가 낮은 스레드는 만약에 최악의 경우 running 되지 못하고 항상 runnable 상태로 있을수도 있게 된다.
	   이런 상태를 기아,굶주림(starvation)상태라고 한다.
	   이러한 최악의 굶주림 상태를 방지하기 위해서 우선순위가 낮은 스레드에게도 실행될 수 있는 기회를 주어야 한다.
	   이런 경우 우선순위가 높은 스레드가 우선순위가 낮은 스레드에게 실행권을 주는 방법이
	   Thread.sleep(밀리초) 메소드를 사용하는 것이다.
	   인자값에 지정된 밀리초 시간 동안 실행중인 스레드는 block 이 되어지게 하는 것이다.
	   이 밀리초 시간동안 우선순위가 낮은 스레드가 실행하도록 하는 것이다.
	   그러므로 스레드로 작동할 클래스 생성시 run() 메소드 오버라이딩에서
	   sleep(밀리초)메소드는 일반적으로 항상 기입을 해주는 것을 원칙으로 한다.       
*/


package my.day19.sub2;
//Runnable 인터페이스를 구현하는 클래스를 작성한다.

public class Sleep1 implements Runnable, InterSleep{
	
	private String id;
	private String passwd;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	@Override
	public void run() {
		
		showInfo();
		
		try {
			Thread.sleep(2000);//밀리초만큼 멈춘다
			//Thread.sleep(밀리초);
			//500밀리초(0.5초) 동안 자신의 스레드가 block 하도록 한다.
			
		} catch (InterruptedException e) {
			//InterruptedException 은 만약 스레드가 시스템 내부적으로 join하지 못하는 오류가 발생할 경우에 일어나는 익셉션이다.
			e.printStackTrace();//어디가 잘못되었나 추적
		}
		
		showInfo();
		
	}

	@Override
	public void showInfo() {
		System.out.println("======== Sleep1 ========");
		System.out.println("▶아이디 : "+id+", 암호 : "+passwd+"\n\n");
		
	}

}

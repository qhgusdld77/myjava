package my.day19.sub2;

public class Sleep2 implements Runnable, InterSleep{
	
	private String name;
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
		System.out.println("======== Sleep2 ========");
		System.out.println("▶성명 : "+name+", 이메일 : "+email+"\n\n");
		
	}

}

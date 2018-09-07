/*
 	=== Thread.yield() 메소드 ===
 	스레드의 우선순위가 동등한 다른 스레드에게 실행기회를 넘기는 것이다.
*/

package my.day19.sub3;

public class Yield implements Runnable{
	
	
	private String id;
	private String passwd;
	
	public Yield() {}
	
	public Yield(String id, String passwd) {
		super();
		this.id = id;
		this.passwd = passwd;
	}
	
	
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
	
	
	public void showInfo() {
		System.out.println("======== Yield ========");
		System.out.println("▶아이디 : "+id+", 암호 : "+passwd+"\n\n");
		
	}
	
	
	@Override
	public void run() {
		
		if("guest".equals(id)) {
			Thread.yield();
			/*
			 	id가 guest 이라면 현재 실행중인 스레드가 block 되고
			 	우선순위가 동등한 다른 스레드에게 실행기회를 넘긴다.
			 	Thread.yield(); 메소드의 작동은 운영체제에 따라 
			 	UNIX, Linux 에서는 잘 작동하지만 
			 	Windows 에서는 안될 수 있다.
			*/
		}
		showInfo();
		
	}
	

}

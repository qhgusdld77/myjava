/*
	===== 동기화(synchronized) ===== 
	- 공유된 데이터에서 하나의 특정메소드를 여러 스레드들이 순차적으로 줄을서서 실행하는 것 
	- 자바에서는 키워드 synchronized를 통해 해당 작업(입금, 인출)에 lock 을 걸어서
	  먼저 작업 중이던 스레드가 작업을 완전히 마치기 전 까지는 해당 작업(입금, 인출)에 lock 이 걸려져 있으므로  
	  설령 다른 스레드에게 제어권이 넘어간다 하더라도 다른 스레드는 lock 이 걸려진 해당 작업(입금, 인출)에 접근을 할 수 없도록 만든다.
	  먼저 작업 중이던 스레드가 작업이 끝나면 해당 작업(입금, 인출)에 걸려진 lock 은 자동적으로 풀리게 되므로
	  그제서야 다른 스레드는 해당 작업(입금, 인출)을 할 수 있게 된다.  
	
	 여러 스레드가 하나의 데이터를 공유할 수 있다.
	 공유 메커니즘은 성능 및 자원의 효율성에서는 좋지만 데이터 일관성에 있어서는 문제가 발생될 수 있다.
	 여러 스레드가 하나의 데이터를 공유할때 하나의 스레드가 해야하는 작업이 끝날때 까지 
	 그 데이터는 다른 스레드에게 공유되지 않도록 해야 하는데, 
	 이것을 해결하는 방법으로 자바에서는 synchronized 키워드를 사용하여 해결한다.
	 
	==== >>> 동기화(synchronized)를 처리하는 2가지 방법 <<< ====
	
	1. 동기화 메소드를 사용하는 방법
	   
	   접근지정자  synchronized  리턴타입  메소드명() {
	    .......
	    .......
	  }
	 
	  --> 메소드 선언시 synchronized 키워드를 지정하는 방법이다. 
	    이 방법은 메소드내의 모든 코드가 동기화된다.
	    따라서 특정 스레드가 이 메소드의 모든 내용을 모두 수행할 때까지 다른 스레드는 block 된다.
	  
	  
	2. 동기화 블럭을 사용하는 방법 (추천)
	   
	   접근지정자  리턴타입  메소드명() {
	      .......
	    synchronized(공유객체) {
	      .......
	    }
	      .......
	  } 
	   
	 --> 메소드내에서 synchronized 키워드 블럭을 사용하는 것이다. 
	         이 방법은 메소드내의 모든 코드가 아닌 synchronized 블럭만 동기화 된다. 
	         따라서 전체 메소드를 동기화하는 방법보다 더 효율적이다.
	 
	동일한 클래스의 같은 메소드를 동시에 여러 스레드가 호출해도 
	synchronized(동기화)에 의하여 순차적으로 스레드들이 실행된다.
	예를 들어, 동일한 통장계좌에 잔액이 100만원이 있을때 
	남편과 아내가 동시에 입금하는 스레드와 출금하는 스레드를 여러번 동시에 실행시켰을 경우
	통장계좌에 입금과 출금 처리가 순차적으로 실행을 해서 기록을 해야 되는데, 
	그렇지 않은 경우 입출금 스레드의 실행순서를 우리가 알수가 없으므로
	통장계좌에 입금과 출금 처리가 이상하게 기록 될 수 있게 된다.             
*/

package my.day19.sub5;

public class SyncBankbook { // 통장 클래스(데이터)
	
	private String account;		//통장 계좌번호
	private long balance; 		//잔고액
	
	public SyncBankbook() {}
	
	public SyncBankbook(String account, long balbance) {
		this.account = account;
		this.balance = balbance;
	}
	
	

	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balbance) {
		this.balance = balbance;
	}
	
	
	
	
	
	
	// ============================= 동기화 처리를 한 입금 메소드 ================================ //
//	public synchronized void deposit (long money) { //방법1
		
	public void deposit (long money) {
		
		System.out.println(">>> 동기화와는 관련없는 내용(입금) <<<");
		
		synchronized (this) {//방법2
			
			System.out.println("*** 입금업무시작 ***");
			//돈을 넣어주면 기존잔액에 입금액만큼더해 
			balance += money;
			System.out.println("계좌번호 : "+account+ " 입금액 => "+money+", 입금후 잔액 =>"+balance);
			System.out.println("*** 입금업무완료 ***\n");
		}
		
	}
	
	
	
	
	
	// ============================= 동기화 처리를 한 출금 메소드 ============================= //
//	public synchronized void withdraw(long money) { //방법1
	
	public void withdraw(long money) {//방법2
		
		synchronized (this) {
			//기존잔액이 출금하려는 잔액보다 작으면 안돼
			if(balance - money < 0) {
				
				System.out.println(">>> 동기화와는 관련없는 내용(출금) <<<");
				
				System.out.println("*** 출금업무시작 ***");
				System.out.println("계좌번호 : " +account+ " 잔액부족! 현재금액 => "+balance+", 출금요청금액 =>"+money);
				System.out.println("*** 출금업무완료 ***\n");
				return;//메소드가 종료되니까 여기서 끝나 else 안써도되지 
				
			}
			
			System.out.println(">>> 동기화와는 관련없는 내용(출금) <<<");
			
			System.out.println("*** 출금업무시작 ***");
			balance -= money;//출금
			System.out.println("계좌번호 : "+account+ " 출금액 => "+money+", 출금후 잔액 =>"+balance);
			System.out.println("*** 출금업무완료 ***\n");
			}
				
	}

}

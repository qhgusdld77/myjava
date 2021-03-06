package my.day19.sub5;

public class DownmoneyRunnable implements Runnable {

	private SyncBankbook bankbook;
	private long downmoney;
	
	public DownmoneyRunnable() {}

	public DownmoneyRunnable(SyncBankbook bankbook, long downmoney) {
		this.bankbook = bankbook;
		this.downmoney = downmoney;
	}




	public SyncBankbook getBankbook() {
		return bankbook;
	}

	public void setBankbook(SyncBankbook bankbook) {
		this.bankbook = bankbook;
	}

	public long getDownmoney() {
		return downmoney;
	}

	public void setDownmoney(long downmoney) {
		this.downmoney = downmoney;
	}




	@Override
	public void run() {
		
		try {
			Thread.sleep(500);//500밀리초(0.5초) 동안 스레드가 block 하도록 한다.
			
			bankbook.withdraw(downmoney);
			//bankbook(공유하는 특정계좌)에 돈을 입금한다.
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			return;//오류가 발생되면 끝내라
		} 
	}
	
	
	
	

}

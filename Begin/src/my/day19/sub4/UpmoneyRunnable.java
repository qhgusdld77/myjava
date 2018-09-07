package my.day19.sub4;

public class UpmoneyRunnable implements Runnable {//멀티스레드

	private NoSyncBankbook bankbook;
	private long upmoney;
	
	public UpmoneyRunnable() {}
	
	
	public UpmoneyRunnable(NoSyncBankbook bankbook, long upmoney) {
		this.bankbook = bankbook;
		this.upmoney = upmoney;
	}




	public NoSyncBankbook getBankbook() {
		return bankbook;
	}

	public void setBankbook(NoSyncBankbook bankbook) {
		this.bankbook = bankbook;
	}

	public long getUpmoney() {
		return upmoney;
	}

	public void setUpmoney(long upmoney) {
		this.upmoney = upmoney;
	}




	@Override
	public void run() {
		
		try {
			Thread.sleep(500);//500밀리초(0.5초) 동안 스레드가 block 하도록 한다.
			
			bankbook.deposit(upmoney);
			//bankbook(공유하는 특정계좌)에 돈을 입금한다.
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			return;//오류가 발생되면 끝내라
		} 
		
		
	}//end of run()---------------------------
	
	
	
	

}

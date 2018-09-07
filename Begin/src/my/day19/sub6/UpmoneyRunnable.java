package my.day19.sub6;

public class UpmoneyRunnable implements Runnable {

	private SyncBankbook bankbook;
	private long upmoney;
	
	public UpmoneyRunnable() {}
	
	
	public UpmoneyRunnable(SyncBankbook bankbook, long upmoney) {
		this.bankbook = bankbook;
		this.upmoney = upmoney;
	}




	public SyncBankbook getBankbook() {
		return bankbook;
	}

	public void setBankbook(SyncBankbook bankbook) {
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

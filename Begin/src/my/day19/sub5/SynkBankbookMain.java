package my.day19.sub5;

public class SynkBankbookMain {

		public static void main(String[] args) {

			SyncBankbook bankbook = new SyncBankbook("123-4-5678", 10000);
			//공유 통장 데이터 1개 생성. 초기 금액은 10000원

	   // ===================== 입금 스레드 구현 객체 10개 생성(가족열명을 만들었다고 생각해라 ) ================================= //
			                  //(공유 통장 데이터 1개를 가족 10명이 동시에 입금한다라고 생각하자)
			
			UpmoneyRunnable[] uprunArr = new UpmoneyRunnable[10];
			Thread[] thrupArr = new Thread[10];
			
			for(int i=0; i<uprunArr.length; i++) {
				UpmoneyRunnable uprunnable = new UpmoneyRunnable(bankbook, 1000);
				//bnakbook(공통으로 사용), 1000원씩 입금하는걸 만든거야 10개
				
				uprunArr[i] = uprunnable;
				thrupArr[i] = new Thread(uprunArr[i]/*Runnable 을 구현한 객체*/);
				//매번 스레드를 만들어서 넣어주고 넣어주고...
				
			}
			
			
		// =================================== 출금 스레드 구현 객체 10개 생성 =========================================== //
			                         //(공유 통장 데이터 1개를 가족 10명이 동시에 출금한다라고 생각하자)
			
			DownmoneyRunnable[] downrunArr = new DownmoneyRunnable[10];
			Thread[] thrdownArr = new Thread[10];
			
			for(int i=0; i<downrunArr.length; i++) {
				DownmoneyRunnable downrunnable = new DownmoneyRunnable(bankbook, 1000);
				//bnakbook(공통으로 사용), 1000원씩 출금하는걸 만든거야 10개
				
				downrunArr[i] = downrunnable;
				thrdownArr[i] = new Thread(downrunArr[i]/*Runnable 을 구현한 객체*/);
				//매번 스레드를 만들어서 넣어주고 넣어주고...
				
			}
			
			
			
			
			
			for(int i=0; i<thrupArr.length; i++) {
				thrupArr[i].start();// 동일한 데이터(동일통장)에 대해 10개의 입금 스레드들을 작동시킨다.
				thrdownArr[i].start();// 동일한 데이터(동일통장)에 대해  10개의 출금 스레드들을 작동시킨다.
			}
			

		}//end of main()--------------------------------------------


}

package my.day19.sub3;

public class YieldMain {

	public static void main(String[] args) {

		// **** Runnable 객체 생성하기 **** //
		Yield[] yieldArr = new Yield[5];
		
		yieldArr[0] = new Yield("leess","asdf1234$");
		yieldArr[1] = new Yield("guest","asdf1234$");
		yieldArr[2] = new Yield("eom","asdf1234$");
		yieldArr[3] = new Yield("silverwo","asdf1234$");
		
		// **** Thread 객체 생성하기 **** //
		
		Thread[] threadArr = new Thread[5];
		
		threadArr[0] = new Thread(yieldArr[0]);
		threadArr[1] = new Thread(yieldArr[1]);
		threadArr[2] = new Thread(yieldArr[2]);
		threadArr[3] = new Thread(yieldArr[3]);
		
		for(int i=0; i<4; i++) {
			System.out.println("스레드 우선순위 : "+threadArr[i].getPriority());
		}
		/*
			스레드 우선순위 : 5
			스레드 우선순위 : 5
			스레드 우선순위 : 5
			스레드 우선순위 : 5
		*/
		
		System.out.println("\n-------------------------------------------\n");
		
		for(int i=0; i<4; i++) {
			threadArr[i].start();
		}
		

	}//end of main()------------------------------

}

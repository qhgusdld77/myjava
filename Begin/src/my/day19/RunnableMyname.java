package my.day19;

public class RunnableMyname extends Parent implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("저는 JAVA 입니다~~");
			super.goodmorning();
		}
		
	}

}

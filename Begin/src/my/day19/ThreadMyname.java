package my.day19;

public class ThreadMyname extends Thread{
	
	@Override
	public void run() {
		while(true) {
			System.out.println("my name is JAVA~~");
		}
	}

}

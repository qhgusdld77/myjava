package my.day19.sub2;

public class SleepThreadMain {

	public static void main(String[] args) {

		Sleep1 sleep1 = new Sleep1();
		sleep1.setId("leess");
		sleep1.setPasswd("qwer1234$");
		
		Sleep2 sleep2 = new Sleep2();
		sleep2.setName("이순신");
		sleep2.setEmail("leess@gamil.com");
		
		Thread thr1 = new Thread(sleep1);
		Thread thr2 = new Thread(sleep2);
		
		//---우선순위 기본값 5,, 우리가 우선순위를 다르게 줄수있다. 
		System.out.println("스레드 thr1의 우선순위 : "+ thr1.getPriority());
		//스레드 thr1의 우선순위 : 5
		
		System.out.println("스레드 thr2의 우선순위 : "+ thr2.getPriority());
		//스레드 thr2의 우선순위 : 5
		
		thr1.setPriority(7);//우선순위를 바꿔주었다.
		thr2.setPriority(3);
		
		System.out.println("--------------------------------------");
		
		System.out.println("스레드 thr1의 우선순위 : "+ thr1.getPriority());
		//스레드 thr1의 우선순위 : 7
		
		System.out.println("스레드 thr2의 우선순위 : "+ thr2.getPriority());
		//스레드 thr2의 우선순위 : 3
		
		System.out.println("\n======================================\n");
		
		thr1.start();
		thr2.start();
		
	}

}

package 연습문제;

public class School {

	   public static void main(String[] args) {
		Student PMG = new Student();
		PMG.name = "김보현";
		PMG.num = 9603261111111L;
		PMG.k = 100;
		PMG.e = 90;
		PMG.m = 80;
		
		PMG.yeah();
		
		System.out.println("\n-----------------------\n");
		
		Student HONG = new Student("김보현",96032622222222l,10,20,30);
		
		HONG.yeah();
	}

}

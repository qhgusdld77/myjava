package 연습문제;

public class Suhak {
	int a;
	int b;
	int c;
	
	public static void plusplus(int a, int b, int c) {
		System.out.println(""+(a+b+c)+"");
	}
	
	public static int plusplus2(int a, int b, int c) {
		return a+b+c;
	}
	
	public double plusplus3(int a, int b, int c) {
		return (double)(a+b+c);
	}
	
	public int myRound(double a) {  // 리턴타입은 내가 나타내고자 하는 것이 리턴타입이다.
		if(a-(int)a >= 0.7) {
			return (int)a+1;
		}
		else {
			return (int)a;
		}
	}

	public static void main(String[] args) {
		
		Suhak yoon = new Suhak();
		
		plusplus(3,10,7); // 20
		
		System.out.println(plusplus2(3,10,7)); // int타입, 20
		
		String str = Double.toString(yoon.plusplus3(3,10,7));
		System.out.println(str); // 20.0
		
		System.out.println(yoon.myRound(3.7)); // 4
		System.out.println(yoon.myRound(3.6)); // 3
		
		
	}
}

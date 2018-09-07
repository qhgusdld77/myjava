package 연습문제;

public class qwer {
	
	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1; i<=20; i++) {
			if(!(i%2==0 || i%3==0)) {
				sum += i;			
		}
	}
		System.out.println(sum);
			sum = 0;
			for(int i=1; i<11; i++) {
				for(int j=1; j<=i; j++) {
					sum += j;
				}
					
			}
			System.out.println(sum);
		int i =0;
		sum = 0;
		int n = 100000;
		for(i=1; i<n; i++) {			
				if(i%2==0) {
					sum -= i;
				}
				else {
					sum += i;
				}
				if(sum >= 100)
			break;
			
		}
		 {
			System.out.println(i);
		}
		 
		 
	}
}
package 연습문제;

public class ABC {
	
	public static void hello(int a) {
		for(int i=0; i<a; i++) {
			System.out.println("Hello Java");
			
		}
	}
	
	public void hello2(int b) {
		for(int i=0; i<b; i++) {
			System.out.println("Hello Java~~");
		}
	}
	
	public ABC() {
	}
	
	public ABC(int c) {
		for(int i=0; i<c; i++) {
			System.out.println("Hello Java##");
		}
		
	}
	
	int dambae;
	int lighter;
	
	public ABC(int d, int e) {
		this.dambae = d;
		this.lighter = e;
		System.out.println("나는 담배가 "+d+"개 있고, 라이터는 "+e+"개 있어");
	}
		
	public static void main(String[] args) {
		
		/*System.out.println("Hello Java");
		System.out.println("Hello Java");
		System.out.println("Hello Java");*/
		System.out.println("=== 문제1 ===");
		ABC.hello(5);
		System.out.println("");
		
		System.out.println("=== 문제2 ===");
		ABC abc = new ABC();
		abc.hello2(3);
		System.out.println("");
				
		System.out.println("=== 문제3 ===");
		ABC abcd = new ABC(3);  // 생성자(인자가있는)
		System.out.println("");
		
		System.out.println("=== 문제4 ===");
		ABC abcdef = new ABC(20,1);
		// 나는 담배가 20개있고, 라이터는 1개있어
		System.out.println(abcdef.dambae);
		System.out.println("");
		
	} // end of main()--------------
}

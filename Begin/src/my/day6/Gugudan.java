package my.day6;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		/*
		 	2*1=2	3*1=3	4*1=4	5*1=5	6*1=6	7*1=7	8*1=8	9*1=9
			2*2=4	3*2=6	4*2=8	5*2=10	6*2=12	7*2=14	8*2=16	9*2=18
			2*3=6	3*3=9	4*3=12	5*3=15	6*3=18	7*3=21	8*3=24	9*3=27
			2*4=8	3*4=12	4*4=16	5*4=20	6*4=24	7*4=28	8*4=32	9*4=36
			2*5=10	3*5=15	4*5=20	5*5=25	6*5=30	7*5=35	8*5=40	9*5=45
			2*6=12	3*6=18	4*6=24	5*6=30	6*6=36	7*6=42	8*6=48	9*6=54
			2*7=14	3*7=21	4*7=28	5*7=35	6*7=42	7*7=49	8*7=56	9*7=63
			2*8=16	3*8=24	4*8=32	5*8=40	6*8=48	7*8=56	8*8=64	9*8=72
			2*9=18	3*9=27	4*9=36	5*9=45	6*9=54	7*9=63	8*9=72	9*9=81
		 	
		*/
		
		System.out.println("========= 구구단 ==========\n");
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<8; j++) {
				String str = (j+2<9)?"\t":"\n";
				System.out.print((j+2)+"*"+(i+1)+"="+((j+2)*(i+1))+str);
			}
		}

		
		

		
		System.out.println("-------------- 단 입력 ----------------------");
		
		/*
		 	>>몇단볼래? => 7
		 	=== 7단 ===
		 	7*1
			7*2
			7*3
			7*4
			7*5
			7*6
			7*7
			7*8
			7*9
		*/
		

		Scanner sc = new Scanner(System.in);
		Gugudan obj = new Gugudan();
		
		for(;;/*무한루프*/) {
			
			try {
				System.out.print(">> 몇 단 볼래? =>");
				int n = Integer.parseInt(sc.nextLine());
				
				System.out.println("=== "+n+"단 ===");
				obj.showInfo(n);	//인스턴스메소드// 객체 생성을 하고! 객체명.메소드명();
				
				
				System.out.println("-------------->>> 누적치 합 구하기 ----------------------");
				/*
				 	>> 시작 수 => 1
				 	>> 종료 수 => 10
				 	>> 결과 : 1부터 10까지의 누적의 합은 55입니다.
				*/
				
				System.out.print(">> 시작 수 => ");
				int startno = Integer.parseInt(sc.nextLine());
				
				System.out.print(">> 종료 수 => ");
				int endno = Integer.parseInt(sc.nextLine());
				
				obj.nujukSum(startno, endno);
				
				break;                      
			} catch (NumberFormatException e) {
				System.out.println(">>> 정수만 입력하세요!!");
			//	continue; 쓰나마나 똑같은거다 한번 써 본거다
			}
			
		}// end of for-----------------------------------------
		
		sc.close();
		
		

	}//end of main------------------------------------------------------------------
	
	public void showInfo(int n) {
		for(int i=0; i<9; i++) {
			System.out.println(n+"*"+(i+1)+"="+n*(i+1));
		}
	}
	
	
	
	public void nujukSum(int startno, int endno) {
		int sum =0;
		for(int i=startno; i<=endno; i++) {
			sum += i;	
		}
		System.out.println(">> 결과: "+startno+"부터 "+endno+"까지의 누적의 합은 "+sum+"입니다.");
	}
	
	
	
	
	
	
	
	
	

}

package 연습문제;

import java.util.Scanner;

public class Ex4_9 {

	public static void main(String[] args) {
/*		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
				sum += str.charAt(i)-'0';			
		}

		System.out.println("sum="+sum);*/
		
		
	//	Scanner sc = new Scanner(System.in);
		
	/*	for(;;) {
			int num = 0;
			try {
				System.out.print("숫자를 입력하세요 : ");
				num = Integer.parseInt(sc.nextLine());
				
			} catch (Exception e) {
				System.out.println("숫자가 너무 커요");
				break;
			}
			int sum = 0;
			
			do {
				if(num<10) {
					sum+=num;
					break;
				}
				else {
					sum+= num%10;
					num = num/10;
				}
				
			} while (true);
				
			System.out.println("sum="+sum);
		}*/ //---------땡
		
		int num = 12345;
		int sum = 0;
				
		do {
			if(num<10) {
				sum += num;
				break;
			}
			else {
				sum += num%10;  // 5+4+3+2+1
				num = num/10;  // 1234, 123, 12, 1
			}
		} while (true);
		
		System.out.println("sum =" + sum);
		
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		// 배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for(int i=0; i<ballArr.length; i++) {
			int j = (int)(Math.random()*ballArr.length);
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
			
		}
		
		// 배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
	//	System.arraycopy(ballArr,0,ball3,0,3);
		for(int i=0; i<ball3.length; i++) {
			ball3[i] = ballArr[i];
		}
				
		for(int i=0; i<ball3.length; i++) {
			System.out.println(ball3[i]);
		}
		
		
		for(int i=1; i<=9; i++) {			
			for(int j=1; j<=3; j++) {
				int x = j+1+((i-1)/3)*3;
				int y = i%3==0? 3:i%3;
				
				if(x>9)
					break;
				
				System.out.print(x+"*"+y+"="+x*y+"\t");
				
			}
			System.out.println();
			if(i%3==0)
				System.out.println();
		}	
		
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		
		for(int i=0; i<answer.length; i++) {
			for(int j=0; j<counter.length; j++)
				if(answer[i] == j+1)
					counter[j] += 1;	
					
		}		
		for(int i=0; i<counter.length; i++) {
			System.out.print(counter[i]);
			for(int j=0; j<counter[i]; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		int[] intArr = new int[5];
		
		for(int i=0; i<intArr.length; i++) {
			intArr[i]=((int)(Math.random()*50))+1;
			System.out.println(intArr[i]);
		}
			
		int max=0;
		int min=0;
		
		for(int i=0; i<intArr.length; i++) {
			if(max<=intArr[i])
				max=intArr[i];
		}
		min = intArr[0];
		for(int j=0; j<intArr.length-1; j++) {
			if(min>=intArr[j+1])
				min=intArr[j+1];
		}	
		System.out.println(max+"-"+min+"="+(max-min));
		
		double[] doubleArr = new double[3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("임의의 소수를 입력하시오");
		
		double sum1 = 0;
		double avg = 0;
		
		
		for(int i=0; i<doubleArr.length; i++) {
			try {
				doubleArr[i] = Double.parseDouble(sc.nextLine());
				sum1 += doubleArr[i];

			}catch (NumberFormatException e) {
				System.out.println("숫자만 입력하세요");
				i--;
			}		
		}
		avg = Math.round(sum1/doubleArr.length *10)/10.0;
		
		System.out.println("평균 : " + avg);
			
		// 10개의 값을 스캐너로 입력받고, 그 값들의 평균을 출력하라(소수점아래 첫째자리까지만)
		
		System.out.println("문자열을 입력하세요.");
		sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		int n = str.length();
		
		char[] charArr = new char[n];
		charArr = str.toCharArray();
		
		char[] tempArr = new char[n];
		
		for(int i=0; i<n; i++) {
			tempArr[i] = charArr[n-i-1];
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(tempArr[i]);
		}
		
	}
}


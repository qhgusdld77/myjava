package io.day1;

import java.io.IOException;

public class InputStreamTest3 {

	public static void main(String[] args) throws IOException {
		 int input = 0;
		 int totalByte = 0;//byte 수 누적용도
		 
		 while((input = System.in.read()) != -1) {
			// 키보드로 Ctrl+C(강제종료)를 누르지 않으면 계속실행해라 
			 
			 
			 if(input != 13 && input != 10) {
				 //키보드로 부터 입력받은 것이 엔터가 아니라면
				totalByte++;
				System.out.write(input);
				System.out.flush();
				
			 }
			 else {
				 System.out.println();
				 //키보드로 부터 입력받은 것이 엔터이라면
			 }
		}		 
		 System.out.println("입력받은 byte 수 : " +totalByte+"byte 입력함");
		 
		 System.in.close();
		 System.out.close();
		 

	}//end of main--------------

}

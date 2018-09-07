package io.day1;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileInputStream;

public class FileInputStream2 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("읽을 파일의 이름(절대경로)을 입력 =>");
			
		Scanner sc = new Scanner(System.in);
		
		String filename = sc.nextLine();
		//파일명 입력 --> 데이터 소스가 된다.
		//C:\iotestdata\korea2.txt
		
		byte[] dataArr = new byte[64];
		int inputLength = 0;
		int totalByte = 0;
		
		try {
			FileInputStream fist = new FileInputStream(filename);
			
			while((inputLength = fist.read(dataArr)) != -1) {
				/*
					fist.read(dataArr) 메소드는 해당 파일에서 
					데이터를 배열 dataArr 크기인 64byte씩 읽어서 
					읽어온 크기를 int 타입으로 리턴해서inputLength 에 넣어준다.
					이어서 읽어온 내용물은 배열 dataArr에 저장시킨다.
					
					만약에 파일의 내용물에서 읽어들일 데이터가 없다라면 -1을 리턴시켜준다.
					즉, 파일속의 내용물이 끝이 아니라면 계속해서 while{}을 
					실행하라는 말이다
				*/
				System.out.write(dataArr, 0, inputLength);// 모니터(콘솔화면)에 출력
				System.out.flush();
				
				totalByte += inputLength;
			}//end of while-----------------------
			
		fist.close();
		
		}catch(FileNotFoundException e) {
			System.out.println(filename+"파일은 없습니다.");
			e.printStackTrace();
		}catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		System.out.println("\n==================");
		System.out.println("총"+totalByte+"bytes");
		System.out.println("==================");
		
		sc.close();
		
	}//end of main()----------------

}

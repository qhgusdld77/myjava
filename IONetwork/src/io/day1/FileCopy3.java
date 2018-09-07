package io.day1;

import java.io.*;
import java.util.Scanner;

public class FileCopy3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println("복사할 원본파일명(절대경로) 입력 => ");
		String srcFilename = sc.nextLine();
				
		System.out.println("목적 파일명(절대경로) 입력 => ");
		String targetFilename = sc.nextLine();
		
		
		System.out.println("소스파일 : " +srcFilename);
		System.out.println("목적파일 : " +targetFilename);
		
		try {
			//FileInputStream 생성 : 접속점이 파일인 것으로 특정 파일에 빨대를 꽂아 파일의 내용물을 1byte 기반으로 빨아들이는 입력노드 스트림이다.
			FileInputStream fist = new FileInputStream(srcFilename);
			
			//FileOutputStream 생성 : 접속점이 파일인 것으로 특정 파일에 빨대를 꽂아 파일의 내용물을 1byte 기반으로 기록해주는 출력노드 스트림이다.
			FileOutputStream fost = new  FileOutputStream(targetFilename);
			
			byte[] dataArr = new byte[64];
			int inputLength = 0;
			int totalByte = 0;
			
			while((inputLength = fist.read(dataArr)) != -1) {
				
				fost.write(dataArr, 0, inputLength);//파일에 쓰기
				fost.flush();
				
				totalByte += inputLength;
				
			}//end of while-------------
			
			System.out.println("\n복사완료  총"+totalByte+"byte 복사됨");
			
			fost.close();
			fist.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("파일의 경로가 올바르지 않습니다.");
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("파일의 경로가 올바르지 않습니다.");
			e.printStackTrace();
		}
		
		
		
		sc.close();
	}//end of main--------------------------------

}

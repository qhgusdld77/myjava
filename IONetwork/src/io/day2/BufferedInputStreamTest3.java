package io.day2;

import java.io.*;
import java.util.Scanner;

//파일로 부터 읽어와 파일에 복사 
public class BufferedInputStreamTest3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("복사할 원본파일명(절대경로) 입력 => ");
		String srcFilename = sc.nextLine();
				
		System.out.println("목적 파일명(절대경로) 입력 => ");
		String targetFilename = sc.nextLine();	
		
		
		try {
			File srcFile = new File(srcFilename); //파일객체를 만들어
			
			// 입력노드스트림 ==> 파일 FileInputStream
			FileInputStream fist = new FileInputStream(srcFile);//여기에 오리발 달자
			
			// 입력노드스트림에 보조(필터)스트림(BufferedInputStream)을 장착한다.
			BufferedInputStream bist = new BufferedInputStream(fist, 10240);//이거 오리발
			//노드스트림인 System.in(키보드)에 필터스트림(보조스트림)을 장착함.
			//필터스트림(보조스트림)의 용량은 10240 byte가 된다.
			//--------------BufferedInputStream 안쓰면 1byte씩 읽어서 뿌려야되 이건 10240 까지 읽을수 있어--------------//
			
			
			File targetFile = new File(targetFilename);
			
			// 출력노드스트림 ==> 파일FileOutputStream
			FileOutputStream fost = new FileOutputStream(targetFile);//여기에 오리발 달자
			
			// 출력노드스트림에 보조(필터)스트림(BufferedOutputStream)을 장착한다.
			BufferedOutputStream bost = new BufferedOutputStream(fost, 10240);//오리발, 복사되어질 경로가 들어갔다targetFilename
			//노드스트림인 System.out(파일)에 필터스트림(보조스트림)을 장착함.
			//필터스트림(보조스트림)의 용량은 10240 byte가 된다.
			
			byte[] dataArr = new byte[1024];
			
			int inputLength = 0;
			int totalByte = 0;
			int sharpCount = 0;
			
			while((inputLength = bist.read(dataArr)) != -1) {
				bost.write(dataArr/*여기에 저장되어진*/, 0, inputLength/*이 길이만큼*/);
				bost.flush();
				
				totalByte += inputLength;
				
				/*String str = (line%50==0)?"\n":"";
				System.out.print("#"+str);
				line++;*/
				
				if(inputLength == 1024) {
					System.out.print("#");
					sharpCount++;
				}
				if(sharpCount%50 == 0)
					System.out.println();
				
				
			}//end of while--------------------------------
			
			System.out.println("----------------------------------------------------");
			System.out.println("총"+totalByte+"bytes 읽고 "+targetFilename+"파일에 복사됨");
			System.out.println("----------------------------------------------------");
			
			
			
			bost.close();
			fost.close();
			
			bist.close();
			fist.close();
			
		}catch(FileNotFoundException e) {
			System.out.println(">> 파일의 경로명이 올바르지 않습니다.");
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
		
			
			
	
	}//end of main--------------------------------------------------

}

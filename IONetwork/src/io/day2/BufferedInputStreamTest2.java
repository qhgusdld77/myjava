package io.day2;

import java.io.*;

//파일로 부터 읽어와(FileInputStream) 파일에 복사(FileOutputStream)
//배열 크기만큼읽어와
public class BufferedInputStreamTest2 {

	public static void main(String[] args) {
			
			try {
				String srcFilename = "C:/iotestdata/Tulips.jpg";//소스파일이름
				File srcFile = new File(srcFilename/*여기다 경로 써도되*/); //파일객체를 만들어
				long srcFileSize = srcFile.length(); //원본파일 크기
				
				// 입력노드스트림 ==> 파일 FileInputStream
				FileInputStream fist = new FileInputStream(srcFile);//여기에 오리발 달자
				
				// 입력노드스트림에 보조(필터)스트림(BufferedInputStream)을 장착한다.
				BufferedInputStream bist = new BufferedInputStream(fist, 4096);//이거 오리발
				//노드스트림인 System.in(키보드)에 필터스트림(보조스트림)을 장착함.
				//필터스트림(보조스트림)의 용량은 1024 byte가 된다.
				//--------------BufferedInputStream 안쓰면 1byte씩 읽어서 뿌려야되 이건 1024 까지 읽을수 있어--------------//
				
				
				String targetFilename = "c:/iotestdata2/튜울립.jpg";//폴더명은 존재해야되,,실제 파일 만들어야되
				File targetFile = new File(targetFilename);
				
				// 출력노드스트림 ==> 파일FileOutputStream
				FileOutputStream fost = new FileOutputStream(targetFile);//여기에 오리발 달자
				
				// 출력노드스트림에 보조(필터)스트림(BufferedOutputStream)을 장착한다.
				BufferedOutputStream bost = new BufferedOutputStream(fost, 4096);//오리발, 복사되어질 경로가 들어갔다targetFilename
				//노드스트림인 System.out(파일)에 필터스트림(보조스트림)을 장착함.
				//필터스트림(보조스트림)의 용량은 1024 byte가 된다.
				
				byte[] dataArr = new byte[512];
				
				int inputLength = 0;
				int totalByte = 0;
				
				int whileCount = 0; //while문 몇번 
				while((inputLength = bist.read(dataArr/*128단위만큼 읽어들일거야*/)) != -1) {
					bost.write(dataArr/*여기에 저장되어진*/, 0, inputLength/*이 길이만큼*/);
					bost.flush();
					
					totalByte += inputLength;
					whileCount++;
					int percent =(int)(((double)totalByte/srcFileSize)*100);
					
					System.out.println(percent+"%복사중...");
				}//end of while--------------------------------
				
				System.out.println("----------------------------------------------------");
				System.out.println("whileCount : "+whileCount);
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
			
			
			
	
		}//end of main--------------------------------------------------

}

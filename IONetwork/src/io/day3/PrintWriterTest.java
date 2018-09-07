/*
	소스 -- 파일 "C:/iotestdata/myprofile.txt"
		  FileReader	  
	필터스트림(보조스트림, 오리발) BufferedReader

		  
	목적지 -- 파일 "C:/iotestdata/myprofile복사2.txt"
		    FileWriter
	필터스트림(보조스트림, 오리발) BufferedWriter / PrintWriter
*/

//PrintWriter
package io.day3;

import java.io.*;

//C:\myjava\IONetwork\bin>
//java io.day3.BufferedReaderWriterTest
public class PrintWriterTest {

	public static void main(String[] args) {
		try {
			//소스파일이름
			String srcFilename = "C:/iotestdata/myprofile.txt";
			
			//2byte기반의 입력노드스트림 생성(빨대꽂기)
			FileReader fReader = new FileReader(srcFilename);
			
			//필터스트림(보조스트림, 오리발)을 노드스트림에 장착하기
			BufferedReader bufReader = new BufferedReader(fReader, 1024);//기본 버퍼크기는 512 byte 이다.
			
		//-------------------------------------------------------------------------------------------//
			
			//목적지 파일 이름
			String targetFilename ="C:/iotestdata/myprofile복사2.txt";//이거 생성 
			
			//2byte기반의 출력노드스트림 생성(빨대꽂기)
			FileWriter fWriter = new FileWriter(targetFilename);
			
			//출력 필터스트림(보조스트림, 오리발)을 노드스트림에 장착하기
			PrintWriter printWriter = new PrintWriter(fWriter, true);
			// new PrintWriter(fWriter, true)에서 두번재 파라미터인 값에 true를 주면
			// 개행문자(엔터)를 만날때 마다 자동으로 flush()메소드가 작동한다는 말이다./*autoFlush*/
			
			String strLine = "";
			
			//한줄씩읽어와 return타입이 String 마지막이 null이니까
			while( (strLine = bufReader.readLine()) != null) {
				//bufReader.readLine() 메소드는 1줄 단위로 읽어와서
				//읽어온 내용을 String 타입으로 반환해준다.
				//1줄을 읽어오되 엔터 전까지 읽어온다.
				
				printWriter.println(strLine);
				
			}//end of while---------------------------------
			
			System.out.println("\n>>> 파일복사완료 <<<");
			
			bufReader.close();
			printWriter.close();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			
		}
				
		
		
		
		

	}//end of main()---------------------------------------

}

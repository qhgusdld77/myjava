/*
	소스 - 입력노드 스트림 키보드(System.in) => 1byte기반 
			           | 	
	브릿지 스트림 InputStreamReader => 1byte를 2byte로 변경
	                   |
	목적지 - 출력 노드 스트림 FileWriter => 2byte기반
*/
//C:\myjava\IONetwork\bin>
//java io.day3.InputStreamReaderTest

package io.day3;

import java.io.*;
public class InputStreamReaderTest {

	public static void main(String[] args) {
		
		try {
			InputStreamReader istReader = new InputStreamReader(System.in/*1byte기반*/);
			// 키보드에서 입력하는 것은 1byte 기반인데 이것을 2byte 기반으로 변경한다.
			
			String fileName = "c:/iotestdata/오늘의날씨.txt";//없는파일
			FileWriter fWriter = new FileWriter(fileName);//IOException일어나서 try catch
			//fWriter에 키보드에서 입력한 것을 
			
			int input = 0;
			
			while((input = istReader.read()) != -1) {
				fWriter.write(input);
				fWriter.flush();
			}
			
			System.out.println("\n >>> 종료합니다. <<<");
			
			fWriter.close();
			istReader.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

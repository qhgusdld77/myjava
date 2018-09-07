/*
	소스 - "c:/iotestdata/오늘의날씨.txt" FileReader => 2byte기반 
			           | 	
	브릿지 스트림 OutputStreamWriter => 2byte를 1byte로 변경
	                   |
	목적지 - 출력 노드 스트림 System.out => 1byte기반
*/
//C:\myjava\IONetwork\bin>
//java io.day3.OutputStreamWriterTest

package io.day3;

import java.io.*;
public class OutputStreamWriterTest {

	public static void main(String[] args) {
		
		try {
			String fileName = "c:/iotestdata/오늘의날씨.txt";
			FileReader fr = new FileReader(fileName);
			
			OutputStreamWriter osWriter = new OutputStreamWriter(System.out);
			
			int input = 0;
			
			while((input = fr.read()) != -1) {
				osWriter.write(input);
				osWriter.flush();
			}
			
			fr.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//end of main-------------------

}

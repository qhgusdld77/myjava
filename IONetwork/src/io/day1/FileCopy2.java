/*
	==== 파일복사하기 ====
	C:\iotestdata\korea2.txt 을 읽어다가 
	C:\iotestdata\korea2copy.txt 파일을 생성하시오.
	
	byte[64] 크기는 64byte로 사용해서
*/

package io.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy2 {

	public static void main(String[] args) throws IOException {
		
		String filename = "C:\\iotestdata\\korea2.txt";
		String filecopy = "C:\\iotestdata\\koreacopy2.txt";
		
		byte[] dataArr = new byte[64];
		int inputLength = 0;
		int totalByte = 0;
		
		try {
			FileInputStream fist = new FileInputStream(filename);
			FileOutputStream fost = new FileOutputStream(filecopy);
			
			
			while((inputLength = fist.read(dataArr)) != -1) {
				
				fost.write(dataArr, 0, inputLength);
				fost.flush();
				totalByte += inputLength;
			}
			
			fist.close();
			fost.close();
			
		} catch (FileNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("복사완료");
		System.out.println("총"+totalByte+"bytes");
		

	}//end of main---------------------------------------------

}

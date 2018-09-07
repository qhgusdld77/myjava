/*
	==== 파일복사하기 ====
	C:\iotestdata\korea.txt 을 읽어다가 
	C:\iotestdata\koteacopy.txt 파일을 생성하시오.
	
	1byte 씩
*/

package io.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy1 {

	public static void main(String[] args) throws IOException {

		String filename = "C:\\iotestdata\\korea.txt";
		String filecopy = "C:\\iotestdata\\koreacopy.txt";
		
		int input = 0;
		int totalByte = 0;
		
		try {
			
			FileInputStream fist = new FileInputStream(filename);
			FileOutputStream fost = new FileOutputStream(filecopy);
			
			while((input = fist.read()) != -1) {
				
				fost.write(input);
				fost.flush();
				totalByte++;
			} //end of while------------------------------------------------
			
			fist.close();
			fost.close();
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("복사완료");
		System.out.println("총"+totalByte+"bytes");
		
		
		
		
		
		
		
				
		

	}//end of main----------------------------

}

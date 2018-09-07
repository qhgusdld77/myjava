package boTest;

import java.io.*;

public class Filemaker {
	
//cd C:\myjava\IONetwork\bin	
//java boTest.Filemaker C:\iotestdata\내일의날씨.txt
	public static void main(String[] args) {
		
		//파일 생성, 내용입력
		try {
			String fileName = args[0];
			File file = new File(fileName);
			
			FileOutputStream fost = new FileOutputStream(file);
			
			int input = 0;
			
			
			while((input = System.in.read()) != -1) {
				fost.write(input);
				fost.flush();
				
			}
			fost.close();
			
			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}

		
		
		
		
		
		
		
		
		
		
		
	}

}

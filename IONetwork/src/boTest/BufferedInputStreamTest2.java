package boTest;

import java.io.*;
import java.util.Scanner;

public class BufferedInputStreamTest2 {
//파일로 부터 읽어와(FileInputStream) 파일에 복사(FileOutputStream)
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		try {
			File file = new File("C:\\iotestdata\\korea.txt");
			FileInputStream fis = new FileInputStream(file);
			
			FileOutputStream fos = new FileOutputStream(sc.nextLine());
			
			byte[] dataArr = new byte[128];
			int inputLength = 0;
			
			while((inputLength = fis.read(dataArr)) != -1) {
				fos.write(dataArr, 0, inputLength);
				fos.flush();
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("찾으려는 경로없음");
			e.printStackTrace();
		}
		
		
		
	}

}

package boTest;

import java.io.*;

public class BufferedInputStreamTest {

	public static void main(String[] args) throws IOException {
		//키보드 입력 , 모니터 출력, 파일 출력 
		BufferedInputStream bis = new BufferedInputStream(System.in, 1024);
														  /*키보드 입력*/
		BufferedOutputStream bos = new BufferedOutputStream(System.out, 1024);
															/*모니터 출력*/
		String file = "C:\\iotestdata\\파일덮어쓰기.txt";
		FileOutputStream fos = new FileOutputStream(file, false);
		//파일 출력
		
		int input;
		while((input = bis.read()) != -1) {
			bos.write(input);
			bos.flush();
			
			fos.write(input);
			fos.flush();
		}
		
		
		
		
	}

}

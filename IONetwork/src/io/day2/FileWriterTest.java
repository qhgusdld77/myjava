/*
	>>>>> FileReader / FileWriter <<<<<
	-노드스트림 : 파일과 연결
	-2byte 기반 문자 스트림
	
*/
package io.day2;

import java.io.*;

//FileReader로 파일을 읽어서 FileWriter로 파일 복사 


public class FileWriterTest {

	public static void fileCopy(String srcfileName, String targetFileName) throws FileNotFoundException, IOException {

		//해당 파일과 노드 연결 생성(빨대꽂기)
		FileReader fr = new FileReader(srcfileName);//파일 읽어와
		
		//해당 타겟파일에 노드 연결 생성(빨대꽂기)
		FileWriter fw = new FileWriter(targetFileName);
		
		char[] charArr = new char[10];
		int charLength = 0;//읽어들인 길이
		
		do {	
			charLength = fr.read(charArr);//파일로 부터 10글자씩 읽어온다. 2byte를 읽어옴
							 			  //읽어들인 글자수(길이)는 dataLength 에 저장시킨후
										  //읽어들인 글자는 char[] 타입의 배열인 dataArr에 저장시킨다.
										  //그런데 파일 손상이 되었을시 IOException 이 발생된다.
			if(charLength != -1) {//파일에다가 기록을 할거야
				fw.write(charArr, 0, charLength);
				fw.flush();
			}

		} while (charLength != -1);//end of do while-------------------------------
		
		System.out.println(">>> 파일복사 완료 <<<");
		
		fr.close();//빨대제거
		fw.close();

	}
	
	
	public static void main(String[] args) {
		//읽어들일 파일명은 명령줄 인자(파라미터)로 주겠다.
		
		try {
			FileWriterTest.fileCopy(args[0]/*원본파일*/,args[1]/*복사된파일*/);
			//args[0]에 c:/myjava/sample.txt 로 할 것이다.            이파일을
			//args[0]에 c:/myjava/sampleCopy.txt 로 할 것이다.        복사
			
		} catch (FileNotFoundException e) {
			System.out.println(args[0] + "이라는 파일은 없습니다.");
		} catch (IOException e) {
			System.out.println(args[0] + "파일이 손상되었습니다.");
		}
		

	}


}

package io.day2;

import java.io.*;

public class FileReaderTest2 {
	
	
//Reader 	
	
	
//cmd에서 실행 
//C:\myjava\IONetwork\bin>
//java io.day2.FileReaderTest2 c:/myjava/sample.txt
	
	public static String reading(String fileName) throws FileNotFoundException, IOException {
		
		//해당 파일과 노드 연결 생성(빨대꽂기)
			FileReader fr = new FileReader(fileName);
			
			char[] charArr = new char[10];
			int charLength = 0;//읽어들인 길이
			String returnData = "";//리턴되어질 데이터,, 여기에 누적 ,, 
			
			do {	
				charLength = fr.read(charArr);//파일로 부터 10글자씩 읽어온다. 2byte를 읽어옴
								 			  //읽어들인 글자수(길이)는 dataLength 에 저장시킨후
											  //읽어들인 글자는 char[] 타입의 배열인 dataArr에 저장시킨다.
											  //그런데 파일 손상이 되었을시 IOException 이 발생된다.
				if(charLength != -1) {
					String str = new String(charArr, 0,charLength);//읽어들인 글자 하나 만들어
					//new String(charArr, 0,charLength);은 
					//char[] 타입의 배열인 dataArr에서 0번째 인덱스 그자부터 
					//charLength 갯수만큼 뽑아서 String 타입을 만든다는 말이다.
					returnData += str;
				}
					
					
			} while (charLength != -1);//end of do while-------------------------------
			
			
			fr.close();//빨대제거
			
			return returnData;

	}

	public static void main(String[] args) {
		//읽어들일 파일명은 명령줄 인자(파라미터)로 주겠다.
		
		try {
			String str = FileReaderTest2.reading(args[0]);
			//args[0]에 c:/myjava/sample.txt 로 할 것이다.
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			System.out.println(args[0] + "이라는 파일은 없습니다.");
		} catch (IOException e) {
			System.out.println(args[0] + "파일이 손상되었습니다.");
		}
		

	}

}

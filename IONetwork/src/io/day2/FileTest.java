/*
	>>>>> File 클래스 <<<<<
	자바에서 File 클래스의 객체라함은 파일 및 폴더(디렉토리)를 다 포함한다.
*/

package io.day2;

import java.util.Scanner;
import java.io.*;

public class FileTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("탐색기에 존재하는 파일명을 입력하세요 : ");
		String fileName = sc.nextLine();
		//c:/iotestdata/Tulips.jpg
		
		File file1 = new File(fileName);
		
		System.out.println("파일명 : "+file1.getName());
		//file1.getName(); 은 파일명을 알려주는 것이다.
		//파일명 : Tulips.jpg
		
		long fileSize = file1.length();
		System.out.println("파일크기 : "+fileSize);
		//파일크기 : 620888
		System.out.println("파일의 상대경로 : "+ file1.getPath());
		//파일의 상대경로 : c:\iotestdata\Tulips.jpg
		System.out.println("파일의 절대경로 : "+file1.getAbsolutePath());
		//파일의 절대경로 : c:\iotestdata\Tulips.jpg
		
//---------------------------------------------- 디렉토리 생성하기 ----------------------------------------------//
		
		System.out.println("===========================================");
		System.out.println(">>>> 디렉토리 생성하기 <<<<");
		
		File dir = new File("MyDir");
	//	File dir = new File("C:\\myjava\\IONetwork\\MyDir"); 와 같다 
		
		String result = dir.exists()?"존재함":"존재하지 않음"; 
		System.out.println(dir.getName()+"은 "+result);
		
		boolean bool = false;
		
		if(!dir.exists()) {// 해당 디렉토리가 없으면 
			bool = dir.mkdir(); // 디렉토리 MyDir 을 생성해라.
			
			result = bool?"디렉도리 생성 성공":"디렉토리 생성 실패";
			
			System.out.println("MyDir"+result);
			
		}
		
		if(dir.exists()) {//해당 디렉토리가 있으면
			System.out.println("MyDir 디렉토리의 상대경로 : "+ dir.getPath());
			//MyDir 디렉토리의 상대경로 : MyDir
			
			System.out.println("MyDir 디렉토리의 절대경로 : "+ dir.getAbsolutePath());
			//MyDir 디렉토리의 절대경로 : C:\myjava\IONetwork\MyDir
			
		}
		
//---------------------------------------------- 디렉토리(폴더) 삭제하기 ----------------------------------------------//
		
		System.out.println("===========================================");
		System.out.println(">>>> 디렉토리(폴더) 삭제하기 <<<<");
		/*
			디렉토리(폴더) 삭제는 삭제하려는 해당 디렉토리(폴더)가 빈폴더 일때만 삭제가 가능하지 
			폴더속에 서브폴더나 파일이 존재하면 디렉토리(폴더) 삭제가 안된다.
			c:/myjava/IONetwork 아래에 TestDir 이라는 빈폴더를 하나 생성한 후 
			아래와 같이 한다.
		*/
		
		File dir2 = new File("TestDir");
		if(dir2.exists()) {
			bool = dir2.delete();
			result = bool?"디렉도리 삭제 성공":"디렉토리 삭제 실패";
			System.out.println("TestDir"+result);
					
		}
		
//---------------------------------------------- 파일 생성하기 ----------------------------------------------//
		
		System.out.println("===========================================");
		System.out.println(">>>> 파일 생성하기 <<<<");
		File file2 = new File("테스트.txt");
//		File file2 = new File("C:\\myjava\\IONetwork\테스트.txt"); 와 같다 
		
		if(!file2.exists()) {//해당 파일이 존재하지 않으면
			
			try {
				
				file2.createNewFile();//파일 생성하기
				System.out.println("테스트.txt의 상대경로 : "+file2.getPath());
				
				System.out.println("테스트.txt의 절대경로 : "+file2.getAbsolutePath());
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
		
//---------------------------------------------- 파일 삭제하기 ----------------------------------------------//
	
			System.out.println("===========================================");
			System.out.println(">>>> 파일 삭제하기 <<<<");	
			
			bool = file2.delete();//파일 삭제하기
			result = bool?"파일 삭제 성공":"파일 삭제 실패";
			System.out.println("테스트.txt"+result);
		
		sc.close();

	}//end of main-------------------------------------

}

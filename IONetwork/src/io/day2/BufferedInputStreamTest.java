/*
   >>>>> BufferedInputStream 와 BufferedOutputStream <<<<<
   -- 1 byte 기반 스트림.
   -- 필터스트림(다른말로 보조스트림 이라고 부른다.)
   -- 단독으로 사용할 수 없고, 반드시 노드스트림에 장착되어 사용되는 것이다.
           마치 수영장에서 오리발처럼 보조기구로 사용한다.
           이것을 사용하면 오리발처럼 속도가 향상되므로 많이 사용한다.
           -----------------------------
           Filter Stream = 보조스트림
           Node Stream에 Filter Stream를 달아 
			    내발                            오리발
	               속도가 빨라져
           --------------------------------
   -- 읽어올 데이터를 매번 1 byte 마다 읽고,쓰고 한다라면 입.출력에 너무 많은 시간이 소요된다.
           그래서 쓰는 작업없이 메모리 버퍼에 데이터를 한꺼번에 쭉~~ 읽기만 하여 모아두면
           그만큼 쓰는 작업이 없으므로 읽기 속도는 빨라질 것이다.
           그리고 나서 메모리 버퍼에 읽어서 모아두었던 내용을 한방에 쓰기를 하면 매번 1byte 씩 쓰는 것보다
           속도가 빨라진다.
           
    BufferedInputStream 와  BufferedOutputStream 의 기본 버퍼크기는 512 byte 이다.                                                 
 */

package io.day2;

import java.io.*;

/*
   [예제]
       필터스트림(보조스트림)을 이용해서 키보드로 부터 입력받고(System.in),
       입력받은 그 내용을 모니터(콘솔화면)에 출력하고(System.out),
       또한 동시에 파일에도 출력해본다(FileOutputStream).
       
    >>> 데이터소스 : 키보드(System.in --> 노드스트림)
                 + 필터스트림(보조스트림)으로 BufferedInputStream 을 사용함.
    
    >>> 데이터목적지 : 모니터(System.out --> 노드스트림)
                  + 필터스트림(보조스트림)으로  BufferedOutputStream 을 사용함.
                  
                                     파일(FileOutputStream --> 노드스트림)
                  + 필터스트림(보조스트림)으로  BufferedOutputStream 을 사용함.   
*/
//1byte씩읽어와 배열 안씀

public class BufferedInputStreamTest {
	
	//C:\myjava\IONetwork\bin>
	//java io.day2.BufferedInputStreamTest
	//글자 입력하기~~~~

	public static void main(String[] args) {
		
		try {
			// 입력노드스트림 ==> 키보드(System.in)
			// 입력노드스트림에 보조(필터)스트림(BufferedInputStream)을 장착한다.
			BufferedInputStream bist = new BufferedInputStream(System.in, 1024);
			//노드스트림인 System.in(키보드)에 필터스트림(보조스트림)을 장착함.
			//필터스트림(보조스트림)의 용량은 1024 byte가 된다.
			//--------------BufferedInputStream 안쓰면 1byte씩 읽어서 뿌려야되 이건 1024 까지 읽을수 있어--------------//
			
			
			
			// 출력노드스트림 ==> 모니터(System.out)
			// 출력노드스트림에 보조(필터)스트림(BufferedOutputStream)을 장착한다.
			BufferedOutputStream bost1 = new BufferedOutputStream(System.out/*파일 객체 filename가 들어와도되*/, 1024);
			//노드스트림인 System.out(모니터)에 필터스트림(보조스트림)을 장착함.
			//필터스트림(보조스트림)의 용량은 1024 byte가 된다.
			
			
			String filename = "c:/iotestdata/나의소개.txt";// 나의소개 파일에 덮어쓰기 할거야
			FileOutputStream fost = new FileOutputStream(filename/*,false 파일 덮어쓰기*/);
			
			
			// 출력노드스트림 ==> 파일(FileOutputStream)
			// 출력노드스트림에 보조(필터)스트림(BufferedOutputStream)을 장착한다.
			BufferedOutputStream bost2 = new BufferedOutputStream(fost, 1024);
			//노드스트림인 System.out(모니터)에 필터스트림(보조스트림)을 장착함.
			//필터스트림(보조스트림)의 용량은 1024 byte가 된다.
			
			int input = 0;
			int totalByte = 0;
			
			int whileCount = 0; //while문 몇번 
			
				  /*이건 매번 1바이트씩 쌓아 배열을 쓰자*/
			while((input = bist.read()) != -1) {
				bost1.write(input);
				bost1.flush();
				
				bost2.write(input);
				bost2.flush();
				
				totalByte++;
				whileCount++;
			}
			
			System.out.println("----------------------------------------------------");
			System.out.println("whileCount : "+whileCount);
			System.out.println("총"+totalByte+"bytes 읽고"+filename+"파일에 씀");
			System.out.println("----------------------------------------------------");
			
			bost2.close();
			fost.close();
			
			bost1.close();
			System.out.close();
			
			bist.close();
			System.in.close();
			
		}catch(FileNotFoundException e) {
			System.out.println(">> 파일의 경로명이 올바르지 않습니다.");
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		
	
	}//end of main--------------------------------------------------

}
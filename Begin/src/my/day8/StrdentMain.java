package my.day8;

import java.util.Scanner;

import my.util.MyUtil;

public class StrdentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Student[] studentArr = new Student[3]; //학생 객체를 담을수있는 배열 선언,배열은 사이즈가 정해져있어 가장큰 단점이다.
		/*	-------------
		 	| 0 | 1 | 2 |	
		 	-------------
		*/
		boolean isDuplicateHakbum = false;
		
		do {
			if(Student.count < studentArr.length) {// 배열의 사이즈보다 카운트가 작으면 배열을 만든다
				
				String hakbun = "";
				
				
				do {
					isDuplicateHakbum = false; //초기치 false 
					System.out.print(">> 학번 : "); //학번이 중복되면 안된다. 학번이 중복되면 객체 생성이 되면안된다.
					hakbun = sc.nextLine();		  //배열속에 저장되어지진것과 내가 입력한 것 비교해야딘다. 비교대상 main()메소드의studentArr
												  // my.util에서 비교할 수 없다 여기서 해야되
					
					
					
						///////////////////// 학번중복검사하기 ///////////////////////////
					
						for(int i=0; i<Student.count; i++) { //비교대상을 Student.count로 해야된다.
							
							//입력한 학번이 중복되면 isDuplicateHakbum가 true가 되서  while문을 빠져나가지 못해 
							if(hakbun/*입력한 학번*/.equals(/*학생객체에 들어있는(기존에존재하는) 학번*/studentArr[i].hakbun)){
								System.out.println(">> 기존에 사용하는 학번이므로 새로운 학번을 입력하세요.");
								isDuplicateHakbum = true;	//학번이 중복된 경우 
								break;
							}
							
						}//end of for--------------------
						
						////////////////////////////////////////////////////////////
	
					} while (isDuplicateHakbum);//학번이 중복되면 다시 돌아가 dowhile을 빠져나가지 못해
				
				
				
				
				

				System.out.print(">> 암호 : ");//이건 내가 입력한 글자가 올바른가만 본다.
				String passwd = sc.nextLine();
				
				System.out.print(">> 성명 : ");
				String name = sc.nextLine();
				
				System.out.print(">> 국어 : ");
				int kor = Integer.parseInt(sc.nextLine());
				
				System.out.print(">> 영어 : ");
				int eng = Integer.parseInt(sc.nextLine());
				
				System.out.print(">> 수학 : ");
				int math = Integer.parseInt(sc.nextLine());
				
				if(MyUtil.checkPassword(passwd)) {//암호가 올바른가 , 맞을때만 객체생성됨 학생 생성
					
					Student student = new Student();//객체가 생성됨,카운트+1 
					
					student.hakbun = hakbun;
					student.passwd = passwd;
					student.name = name;
					student.kor = kor;
					student.eng = eng;
					student.math = math;
					System.out.println("[학생수 "+Student.count+"명 생성/정원"+studentArr.length+"명]");
					
					studentArr[Student.count - 1] = student; //학생객체를 배열에 집어넣어라
				}
				else {
					System.out.println(">>> 학생 생성실패");
				}
				
			}
			else {//배열의 크기보다 카운ㅌ가 크면 
				System.out.println(">> 정원이 도달했으므로 학생정보 입력불가합니다.");
				break;
			}
				
			
			
		} while (true); //학생입력완료-------------
		
		
		
		
		System.out.println(">>> 입력한 학생 정보 보기1 <<<");
		
		for(int i=0; i<studentArr.length; i++) {
			studentArr[i].ShowStudentInfo();
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		
		System.out.println(">>> 입력한 학생 정보 보기2 <<<");
		
		
		//학번검색
		
		//확장된 for문
		for(Student st : studentArr) {//(배열이 저장된 배열의 타입?/배열명)
			st.ShowStudentInfo();
		}
		
		System.out.println("\n\n");
		
		System.out.println(">> 검색하실 학번=> ");
		String searchHakbun = sc.nextLine();
		
		

		boolean isSearchHakbun = false;
		
		for(Student st : studentArr) {
			if(st.hakbun.equals(searchHakbun)) {
				st.ShowStudentInfo();
				isSearchHakbun = true;
				break;
			}	
		}//end of for
		
		if(!isSearchHakbun)
			System.out.println(">> 검색하려는 학번 "+searchHakbun+" 는 존재하지 않습니다.");
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}//end of main-------------------

}

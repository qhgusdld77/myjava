package my.day16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Student[] studentArr = new Student[3];
		
		studentArr[0] = new Student("kh001","한석규",93);
		studentArr[1] = new Student("kh002","두석규",72);
		studentArr[2] = new Student("kh003","세석규",86);
		
		Scanner sc = new Scanner(System.in);
		
		for(Student st : studentArr) {
			st.comment(st.getHakbun(), sc);
		}
		
		
		for(Student st :studentArr) {
			st.printInfo();
		}
		
		System.out.println("===============");
		
		System.out.println("학번을 입력하세요");
		String searchHakbun = sc.nextLine();
		
		Student searchStudent = null;
		for(Student st : studentArr) {
			searchStudent = st.search(searchHakbun);
			if(searchStudent != null) {
				searchStudent.printInfo();
				break;
			}
			/*if(st.getHakbun().equals(hak))
				st.printInfo();*/
		}
		
		if(searchStudent == null)
			System.out.println(">>> 검색하신 학번 "+searchHakbun+"은 존재하지 않습니다.");
		
		
		sc.close();
	}//end of main-----------

}

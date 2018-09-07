package io.day4;

import java.util.*;

public class MainTest {

	public static void main(String[] args) {
		
		//Student stud1 = new Student("한석규", 21, "서울시 강동구");
		Student stud2 = new Student("두석규", 22, "서울시 강서구");
		Student stud3 = new Student("세석규", 23, "서울시 강남구");
		Student stud4 = new Student("네석규", 24, "서울시 강북구");
		
		List<Student> studList = new ArrayList<Student>();
		
		studList.add(new Student("한석규", 21, "서울시 강동구"));
		studList.add(stud2);
		studList.add(stud3);
		studList.add(stud4);
		
		SerializableTest serial = new SerializableTest();
		serial.objectToFileSave(studList, "c:/iotestdata/serializable/students.dat");
	    //직렬화 시켜주는 메소드 호출 객체를 쪼갠거
	//----------------------------------------------------------------------------------------------//
		
		Object obj = serial.getObjectFromFile("c:/iotestdata/serializable/students.dat");
		//역직렬화 시켜주는 메소드 호출
		
		if(obj != null) {
			@SuppressWarnings("unchecked")
			List<Student> resultList = (List<Student>)obj;
			
			System.out.println(">>> 파일에 저장된 객체 정보 출력하기 <<<");
			for(Student stud : resultList) {
				System.out.println(stud);
			}
		}
		else {
			System.out.println(">>> 파일에 저장된 객체 정보가 없습니다. <<<");
		}
		
	}//end of main--------------------------------------------------------------------------

}

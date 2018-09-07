package my.day17;

public class ExceptionTest1 {

	public static void main(String[] args) {
		
		String[] subjectArr = {"Java","Oracle","JSP"};
		
		try {
			for(int i=0; i<subjectArr.length+1; i++) {
			System.out.println(subjectArr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(">>> 배열의 인덱스 범위가 초과 되었습니다. 확인하세요");
		}
		
		

	}

}

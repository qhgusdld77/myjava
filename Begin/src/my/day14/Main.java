package my.day14;

public class Main {
	    	
	public static void main(String[] args) {
	
		Common[] commonArr = new Common[10];	
		
		commonArr[0] = new Common("comm01", "qwer1234$", "공공인", "gong@gmail.com"); 
		
		commonArr[1] = new Student("stu01", "qwer1234$", "김상원", "kimsw@gmail.com"
			        	          , "hak001", "kim@naver.com", "수상경력 아주 많음"); 
		
		commonArr[2] = new Guardian("guard001", "qwer1234$", "상원아빠", "kim@naver.com"
				                   , "회사원", "02-345-4546"); 
		
		for(int i=0; i<Common.count; i++) {
			if(commonArr[i] instanceof Student) {
				((Student)commonArr[i]).showInfo();
			}
			else if(commonArr[i] instanceof Guardian) {
				((Guardian)commonArr[i]).showInfo();
			}
		}
		
		System.out.println("\n========================\n"); 
		
		for(int i=0; i<Common.count; i++) {
			commonArr[i].showInfo();
		}
		
		System.out.println("\n#########################\n");
		
		// **** 학생으로 로그인 한다는 가정하에 합니다. **** //
		String studentid = "stu01";    
		String password = "qwer1234$";
		
		for(int i=0; i<Common.count; i++) {
			commonArr[i].login(studentid, password);
		}
		
		System.out.println("\n");
		
		for(int i=0; i<Common.count; i++) { 
			if(commonArr[i] instanceof Student) {
			   Common common = ( (Student)commonArr[i] ).login(studentid, password);
			   Student stud = (Student)common;
			   stud.showInfo();
			}
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~\n");
		
		for(int i=0; i<Common.count; i++) { 
			if(commonArr[i] instanceof Student) {
			   Common common = commonArr[i].login(studentid, password);
			   common.showInfo();
			}
		}
		
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
		
		for(int i=0; i<Common.count; i++) { 
			if(commonArr[i] instanceof Student) {
			   commonArr[i].login(studentid, password);
			}
		}
		
		
		
	}

}

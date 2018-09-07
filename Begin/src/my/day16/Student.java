package my.day16;

import java.util.Scanner;

public class Student implements Inter1, Inter2, Inter3 {
	
	private String hakbun;
	private String name;
	private int point;
	private String hakjum;
	private String comment;

	@Override
	public Student search(String hakbun) {
		Student student = null;
		if(hakbun != null && hakbun.equals(this.hakbun))//입력받은 학번이 
			student =  this;
		
		return student;
	}

	@Override
	public void comment(String hakbun, Scanner sc) {
		 Student student = search(hakbun);
		 
		 if(student != null) {
			 System.out.println(">> 1. 성명: "+student.name );
			 System.out.println(">> 2. 점수: "+student.point );
			 System.out.println(">>> 코멘트를 입력하세요(입력종료 하려면 엔터후 exit를 입력) <<< " );
			 
			 StringBuilder sb = new StringBuilder();
			 
			 String str = "";
			 do {
				str = sc.nextLine();
				if("exit".equalsIgnoreCase(str.trim())/*대소문자 구분안하고*/)
					break;
				else
					sb.append(str+"\n");
			} while (true);
			 
			 student.comment = sb.toString();
			 
		 }
		 else {
			 System.out.println(">>> 존재하지 않는 학생이라서 코멘트를 입력할 수 없습니다.");
		 }
		
	}

	@Override
	public void printInfo() {
		System.out.println("1.학번: "+ hakbun);
		System.out.println("2.성명: "+ name);
		System.out.println("3.점수: "+ point);
		System.out.println("4.학점: "+ hakjum);
		System.out.println("5.코멘트=> ");
		System.out.println(comment+"\n");
	}

	public String getHakbun() {
		return hakbun;
	}

	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		if(point < 0)
			this.point = 0;
		else if(point > 100)
			this.point = 100;
		else
			this.point = point;
		
		switch (this.point/10/*그냥 point로하면 0이나 100넘은 수가 들어올수도 있다.*/) {
		case 10:
		case 9:
			hakjum = "A";
			break;
			
		case 8:
			hakjum = "B";
			break;
			
		case 7:
			hakjum = "C";
			break;
			
		case 6:
			hakjum = "D";
			break;

		default:
			hakjum = "F";
			break;
		}
	}

	public String getHakjum() {
		return hakjum;
	}

	
	

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
	public Student() {}

	public Student(String hakbun, String name, int point) {
		this.hakbun = hakbun;
		this.name = name;
		setPoint(point);//
	}
	
	

}

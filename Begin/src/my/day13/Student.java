package my.day13;

import my.util.MyUtil;

public class Student {

	private String hakbun = ""; //학번
	private String name = "";   //학생명
	private String mobile = ""; //연락처  
	
	//="" 아난며 ㄴ java.lang.NullPointerException 초기화해줘야되
	
	
	public String getHakbun() {
			return hakbun;
	}
	
	public void setHakbun(String hakbun) {
		if(hakbun.trim().isEmpty())
			System.out.println(">>학번을 공백만으로는 불가합니다.");
		else 
		this.hakbun = hakbun;
	}
	
	
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name.trim().isEmpty()) 
			System.out.println(">>이름을 공백만으로는 불가합니다.");
		else
		this.name = name;
	}
	
	
	
	
	public String getMobile() {
		return mobile;
	}
	
	public void setMobile(String mobile) {
		
		if(MyUtil.checkNumber(mobile) && mobile.length() == 10 || mobile.length() == 11 || mobile.startsWith("010"))
			this.mobile = mobile;
		else 
			System.out.println(">>연락처는 10글자 11글자의 숫자 이여야합니다.");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

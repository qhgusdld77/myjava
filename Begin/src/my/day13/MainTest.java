package my.day13;

public class MainTest {

	public static void main(String[] args) {

		Sungjuk[] sungjukArr = new Sungjuk[3];
		
		Student st1 = new Student();
		st1.setHakbun("kh001");
		st1.setName("한석규");
		st1.setMobile("01026528564");
		
		Sungjuk sj1 = new Sungjuk();
		sj1.setStudent(st1);
		sj1.setKor(90);
		sj1.setEng(91);
		sj1.setMath(93);
		
		if(sj1.getStudent() != null) //성적클래스속에 getStudent가 null이 아니면 배열속에 넣어라		
		sungjukArr[0] = sj1;
		
		
		
		////////////////////////////////////////////////////////////////
		
		Student st2 = new Student();
		st2.setHakbun("");
		st2.setName("   ");
		st2.setMobile("01026528564");
		
		Sungjuk sj2 = new Sungjuk();
		sj2.setStudent(st2);
		sj2.setKor(80);
		sj2.setEng(81);
		sj2.setMath(83);
		
		if(sj2.getStudent() != null)
		sungjukArr[1] = sj2;
		
		System.out.println(sungjukArr[0].getHakjum());
	//	System.out.println(sungjukArr[1].getHakjum()); // java.lang.NullPointerException
		
		System.out.println("-----------------------------");
		
		System.out.println(sungjukArr[0].getStudent().getName());
	//	System.out.println(sungjukArr[1].getStudent().getName()); //java.lang.NullPointerException

		
	
		
		
		Student st3 = new Student();
		st3.setHakbun("kh003");
		st3.setName("세석규");
		st3.setMobile("01039447152");
		
		Sungjuk sj3 = new Sungjuk();
		sj3.setStudent(st3);
		sj3.setKor(80);
		sj3.setEng(81);
		sj3.setMath(83);
		
		if(sj3.getStudent() != null) //성적클래스속에 getStudent가 null이 아니면 배열속에 넣어라		
		sungjukArr[1] = sj3;
		
		
		Student st4 = new Student();
		st4.setHakbun("kh004");
		st4.setName("네석규");
		st4.setMobile("01051140141");
		
		Sungjuk sj4 = new Sungjuk();
		sj4.setStudent(st4);
		sj4.setKor(70);
		sj4.setEng(71);
		sj4.setMath(73);
		
		if(sj4.getStudent() != null) //성적클래스속에 getStudent가 null이 아니면 배열속에 넣어라		
		sungjukArr[2] = sj4;
		
		////////////////////////////////////////////////////////////////////
		
		System.out.println("\n>>>> 학생성적입력완료 <<<<");
		System.out.println("\n----------------------------------------------------");
		System.out.println("학생명	국어	영어	수학	총점	평균	학점\n");
		/*for(int i=0; i<sungjukArr.length; i++)
		{
			System.out.println(sungjukArr[i].getStudent().getName()+"\t"+sungjukArr[i].getKor()
					+"\t"+sungjukArr[i].getEng()+"\t"+sungjukArr[ i].getMath()+"\t"+sungjukArr[i].getTotal()
					+"\t"+sungjukArr[i].getAvg()+"\t"+sungjukArr[i].getHakjum());
		}*/
		
		for(Sungjuk sj : sungjukArr) {
			String info = sj.getStudent().getName()+"\t"+sj.getKor()+"\t"+sj.getEng()+"\t"+sj.getMath()+"\t"
			+sj.getTotal()+"\t"+sj.getAvg()+"\t"+sj.getHakjum();
			System.out.println(info);
		}
		System.out.println("\n----------------------------------------------------");
		
		
		

	}

}

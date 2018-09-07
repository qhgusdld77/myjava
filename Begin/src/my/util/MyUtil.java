package my.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class MyUtil {
	
	public static void currentTime() {
		Date now = new Date();
		String today = String.format("%tF %tT %tA", now, now, now);
		System.out.println(today);
	}
	
	
	
	public static int calcurator(int a, int b, int c) {
		return a+b+c;
	}
	
	
	
	public static int random(int a, int b) {
		//랜덤한 정수 = (int)(Math.random()*구간범위) + 시작값;
		
		return (int)(Math.random()*(b-a+1))+a;
	}
	
	
	
	
	public static int random2(int a, int b){
		Random rnd = new Random();
		return rnd.nextInt(b-a+1)+a;
	}
	
	
	
	public static boolean checkPassword(String passwd) {
		
		if(passwd.length() < 8) {//암호 8글자 미만일때
			
			System.out.println(">> 암호는 8글자 이상이어야 합니다.");
			return false;
		}
		
		
		else {//암호 8글자 이상일때
			char[] chArr = passwd.toCharArray();
			boolean flagAlphabet = false, flagNumber = false, flagSpecial = false;
			
			
			for(int i=0; i<chArr.length; i++) {
				if('A' <= chArr[i] && chArr[i] <= 'Z' ||
					'a' <= chArr[i] && chArr[i] <= 'z')
					flagAlphabet = true;
				else if('0' <= chArr[i] && chArr[i] <= '9')
					flagNumber = true;
				
				else
					flagSpecial = true;
				
			}//end of for------------------------
			
			
			
			//영문자,숫자,특수문자를 모두 사용했을때 암호로 사용할 수 있다.
			if(flagAlphabet && flagNumber && flagSpecial) {
				System.out.println(">>"+passwd+"는 암호로 사용가능합니다.");
				return true;
			}
			else {
				System.out.println(">> 암호는 영문자, 숫자, 특수기호가 혼합되어야만 사용가능합니다.");
				return false;
			}
		}

	}
	
	
	public static String currentTime2() {
		
		Calendar currentdate = Calendar.getInstance();
		
		int year = currentdate.get(Calendar.YEAR);
		
		int month = (currentdate.get(Calendar.MONTH)+1);
		String strMonth = month<10? "0"+month : String.valueOf(month);
		
		int day = currentdate.get(Calendar.DATE);
		String strDay = day<10?"0"+day:String.valueOf(day);
		
		int minute = currentdate.get(Calendar.MINUTE);
		String strminute = minute<10? "0"+minute : String.valueOf(minute);
		
		int second = currentdate.get(Calendar.SECOND);
		String strsecond = second<10? "0"+second : String.valueOf(second); 
		
        String today = year+"-"+strMonth+"-"+strDay;
       
        today += " " +currentdate.get(Calendar.HOUR_OF_DAY)+":"+strminute+":"+strsecond;
        
        switch (currentdate.get(Calendar.DAY_OF_WEEK)) {
			case 1:
				today += " 일요일";
				break;
			case 2:
				today += " 월요일";
				break;	
			case 3:
				today += " 화요일";
				break;
			case 4:
				today += " 수요일";
				break;
			case 5:
				today += " 목요일";
				break;
			case 6:
				today += " 금요일";
				break;	
			case 7:
				today += " 토요일";
				break;
		}
        
        return today;
		
	}
	
	
	
	
	
	
	public static boolean checkNumber(String num) {
		char[] chArr = num.toCharArray();
		
		 boolean flagNumber = false; //깃발 초기치 false
		 
		 for(int i=0; i<chArr.length; i++) {
			 if(!('0' <= chArr[i] && chArr[i] <= '9')) { // 입력한 값이 숫자가 아니라면
				 flagNumber = true;                      // 깃발 true		 
				 break;                                  // for문을 빠져나간다,, 입력한 값중 하나라도 숫자가 아니면 깃발이 true
				                                         // 가 되서 나온다.
			 }
		 }//end of for-----------
		 
		 if(!flagNumber)	// 숫자가 아닌문자가 있어서 깃발 참인 상태로나온다면  (!참)--> 거짓 반환
			 return true;   // 반대로 모두 숫자라서 for문을 통과하지 않고 바로 if로오면 (!거짓) --> 참반환
		 else
			 return false;	// 최소한 숫자이외의 다른문자가 1개 이상 포함된 경우
		
	}
	
	
	
	

}

package my.day13.sub;

import java.util.Scanner;

import my.util.MyUtil;

public class JobMain {
	
	//Gujikja 객체와 Commpany객체 저장시키는 배열 
	Common[] commonArr = new Common[100]; //구직자와 회사저장되는 공간
	
	//Recruit 객체를 저장시키는 배열
	Recruit[] recruitArr = new Recruit[50];

	// ********************************* 초기메뉴를 보여주는 기능 **************************************** //
	public static void startMenu() {
		
		System.out.println("\n======== 초기 Menu ========");
		System.out.println("1. 구직자등록");
		System.out.println("2. 구인회사등록");
		System.out.println("3. 로그인(구직자)");
		System.out.println("4. 로그인(구인회사)");
		System.out.println("5. 로그인(관리자)");
		System.out.println("6. 종료");
		System.out.println("==========================");
		System.out.print(">> 메뉴번호 선택 => ");
		
	}//end of startMenu()------------------------
	
	
	// ****************************** 구직자로 로그인 했을때 보여주는 메뉴 메소드 **************************************** //
		public static void gujikjaMenu() {
			
			System.out.println("\n===== >>> 구직자 Menu <<< =====");
			System.out.println("1. 나의 정보 조회");
			System.out.println("2. 나의 정보 변경");
			System.out.println("3. 모든 채용공고 조회");
			System.out.println("4. 구인회사 ID 검색");
			System.out.println("5. 특정 업종 채용공고 조회");
			System.out.println("6. 로그아웃");
			System.out.println("7. 회원탈퇴");
			System.out.println("=============================");
			System.out.print(">> 메뉴번호 선택 => ");
			
		}//end of startMenu()------------------------
		
	// ****************************** 관리자로 로그인 했을때 보여주는 메뉴 메소드 **************************************** //
		
		public static void adminMenu() {
			
			System.out.println("\n===== >>> 관리자 Menu <<< =====");
			System.out.println("1. 모든 구직자 정보 조회");
			System.out.println("2. 모든 구인회사정보 조회");
			System.out.println("3. 특정 구직자 삭제");
			System.out.println("4. 특정 구인회사 삭제");
			System.out.println("5. 로그아웃");
			System.out.println("=============================");
			System.out.print(">> 메뉴번호 선택 => ");
			
		}//end of startMenu()------------------------
				
				
				
	// ****************************** 구인회사로 로그인 했을때 보여주는 메뉴 메소드 **************************************** //
		public static void companyMenu() {
			
			System.out.println("\n===== >>> 구인회사 Menu <<< =====");
			System.out.println("1. 우리회사 정보 조회");
			System.out.println("2. 우리회사 변경");
			System.out.println("3. 모든 구직자 ID 조회");
			System.out.println("4. 특정 구직자 ID 조회");
			System.out.println("5. 채용공고 하기");
			System.out.println("6. 로그아웃");
			System.out.println("7. 회원탈퇴");
			System.out.println("=============================");
			System.out.print(">> 메뉴번호 선택 => ");
			
		}//end of companyMenu()------------------------
		
		
	
		
	
	// *********************초기메뉴 1. 구직자를 등록(생성)해주는 기능 ************************************ //
	
	public void registerGujikja(Scanner sc) {
		
		String id = "";
		String passwd = "";
		String name = "";
		String birthday = "";
		int gender = 0;
		String address = "";
		int school = 0;
		String mobile = "";
		String hopejob = "";
		int hopemoney = 0;
		
		boolean boolUserid = false;
		boolean boolPasswd = false;
		boolean boolName = false;
		boolean boolBirthday = false;
		boolean boolMobile = false;
		boolean boolHopemoney = false;
		
		
		
	   // 1.아이디값 입력받기==========================================================================
		do {
			System.out.print("▷아이디 => ");// 이건 일단 한번나와야되 do-while이다.
			id = sc.nextLine();
			
			
	        //---------------------- 아이디 공백 검사 --------------------------//
			boolUserid = id.trim().isEmpty(); // boolUserid 이 참인경우는 userid가 "","   " 공백이다.
			
			 if(boolUserid) // "","   " 공백이 있으면 아이디로 쓸수없다
				 System.out.println(">>> 아이디는 공백만으로 사용불가 합니다. 다시 입력해주세요.");	
			//-----------------------------------------------------------//
			 
			 
			  
			 else { // userid가 공백이 아닌 값을 넣은경우 .. 공백검사 통과됬을때
				 
			//---------------------- 아이디 중복 검사 -------------------------//	
				 for(int i=0; i<Common.count; i++) {//구직자로 들어온 아이디만 검사를 해야되는데 commonArr는 구인회사도 다 들어가있
					 if(commonArr[i] instanceof Gujikja && // 구직자이라면~~!
					     id.equals(commonArr[i].getId())) { 
						 System.out.println("이미 사용하고 있는 아이디입니다.");
						 boolUserid = true; 
						 break;//id가 중복이 아닌 고유한 값이라면 
					 }
					 else {
						 boolUserid = false; 
					 }
				 }//end of for---------------
			//------------------------------------------------------------//	
				 
			 }
			
			 
		} while (boolUserid);//end of while------------
		
		
		
		// 2. 암호 입력받기=========================================================================
		do {
			System.out.print("▷암 호 => ");
			passwd = sc.nextLine();
			boolPasswd = MyUtil.checkPassword(passwd);
			
			if(boolPasswd)//boolPasswd가  true이면 빠져나와
				break;
		} while (true);
		
		
		
		// 3. 이름 입력받기==========================================================================
		do {
			System.out.print("▷이 름 => ");
			name = sc.nextLine();
			
			boolName = name.trim().isEmpty();
			
			if(boolName)// name.trim().isEmpty()이거는  비어있으면 true ..비어있으면 이름으로 입력불가
				System.out.println(">>> 이름은 공백만으로 사용불가 합니다. 다시 입력해주세요.");
			else // false일때 빠져나감
				break;
		} while (boolName);
		
		
		
		// 4. 생년월일 입력받기==========================================================================
		do {
			System.out.print("▷생년월일(예: 19960326) => ");
			birthday = sc.nextLine();
			               /*글자수 제한한다*/ 
			boolBirthday = birthday.length()==8 && MyUtil.checkNumber(birthday);
			
		} while (!boolBirthday); // boolBirthday가 참이라면 do-while을 빠져나간다
		                         // boolBirthday가 거짓이다 --> 글자수를 넘었거나 숫자가 아닌다른 문자가 들어감,, 빠져나가지 못해
		
		
		// 5. 성별 입력받기==========================================================================
		do {
			System.out.print("▷성 별(1.남자/2.여자) => ");
			String strgender = sc.nextLine();
			switch (strgender) {
				case "1":
				case "2":					
					break;
	
				default:
					System.out.println("1 또는 2를 입력해주세요.");
					continue;//1,2가 아닌 다른 문자 입력시 
					
			}//end of switch-------------
			
			if("1".equals(strgender) || "2".equals(strgender)) {
				gender = Integer.parseInt(strgender);//gender를 int타입으로 선언해줬다.  
				break; //while문 빠져나옴
			}
		} while (true);
		
		
		
		// 6. 주소 입력받기==========================================================================
		do {
			System.out.print("▷주 소 => ");
			address = sc.nextLine();
			   /*주소가.공백제외하고.비어있으면 */
			if(!address.trim().isEmpty())
				break; // 입력값이 비어있지않으면 빠져나옴
		} while (true);
		
		
		// 7. 학력 입력받기==========================================================================
		do {
			System.out.print("▷학 력(1.대졸이상/2.초대졸/3.고졸/4.고졸미만) => ");
			String strSchool = sc.nextLine();
			switch (strSchool) {
			case "1":
			case "2":
			case "3":
			case "4":
				break;

			default:
				continue;//1,2,3,4 가아니면 못빠져나가
			}//end of switch
			
			if("1".equals(strSchool) || "2".equals(strSchool) || 
			   "3".equals(strSchool) || "4".equals(strSchool)) {
				
				school = Integer.parseInt(strSchool);
				break; //
			}
			
		} while (true);
		
		
		
		// 8. 휴대폰번호 입력받기==========================================================================
		do {
			System.out.print("▷휴대폰 번호(예: 0101231234) => ");
			mobile = sc.nextLine();
			int length = mobile.length();
			
			boolMobile = MyUtil.checkNumber(mobile) && (length == 10 || length == 11);
			
		} while (!boolMobile);
		
		
		
		// 9. 희망직종 입력받기==========================================================================
		do {
			System.out.print("▷희망직종 => ");
			hopejob = sc.nextLine();
			   /*주소가.공백제외하고.비어있으면 */
			if(!hopejob.trim().isEmpty())
				break; // 입력값이 비어있지않으면 빠져나옴
		} while (true);
		
		
		// 10. 희망연봉 입력받기==========================================================================
		do {
			System.out.print("▷희망연봉 => ");
			String strhopejob = sc.nextLine();		
			
			 boolHopemoney = MyUtil.checkNumber(strhopejob);
			
			 if(boolHopemoney) {
				 hopemoney = Integer.parseInt(strhopejob);
				 break;
			 }
		} while (true);
		
		
		//구직자로 회원가입 여부를 물어본다.
		System.out.print(">>> 회원가입여부 확인(1.예/2.취소) => ");
		String yn = sc.nextLine();
		
		if(!"1".equals(yn)) {
			System.out.println(">>> 구직자 회원가입을 취소 했습니다.");
		}
		else if("1".equals(yn) && Common.count == commonArr.length) {
			System.out.println("\n>>> 정원이 초과했으므로 구직자 회원가입이 불가합니다.");
			
		}
		else {
			// Gujikja 객체 생성(회원가입) 
			// 올바른 값이 올때까지 객체를 생성하지않는다!! 그래서 구직자를 등록(생성)해주는 기능 다음에 객체를 생성한다. 
			Gujikja gujikja = new Gujikja(id, passwd, name, birthday, gender, address, school, mobile, hopejob, hopemoney);
			
			//생성한 구직자 객체를 배열속에 넣는다
			commonArr[Common.count-1] = gujikja;//생성되어진객체는 구직자지만 common클래스로 받을 수있다=>다형성
			System.out.println(">>> 구직자 회원가입 성공");
			System.out.println("["+Common.count+" 번째/전체 :"+commonArr.length+"명]");
		}
		

		
	 
	}//end of registerGujikja()*******************************************************************************
	
	// *********************초기메뉴 2. 구인회사 등록(생성)해주는 기능 ***************************************************** //
		public void registercompany(Scanner sc) {
			
		    
			
			System.out.print("▷아이디 => ");
			String id = sc.nextLine(); 

			System.out.print("▷암호 => ");
			String passwd = sc.nextLine();
			
			System.out.print("▷성명 => ");
			String name = sc.nextLine();
			
			System.out.print("▷주소 => ");
			String address = sc.nextLine();
			
			System.out.print("▷대표번호 => ");
			String tel = sc.nextLine();
			
			System.out.print("▷대표자명=> ");
			String ceo = sc.nextLine();
			
			System.out.print("▷자본금 => ");
			long seedmoney = Long.parseLong(sc.nextLine());
			
			System.out.print("▷업종 => ");
			String jobtype = sc.nextLine();

			Company comp = new Company(id, passwd, name, address, tel ,ceo, seedmoney, jobtype);
			commonArr[Common.count-1] = comp;
			
		}//end of registerCompany()*******************************************************************************

		
		
	//****************************초기메뉴 3. 로그인(구직자) 을 해주는 메소드 생성 *******************************************//

	public Gujikja loginGujikja(Scanner sc) {
		
		Gujikja gujikja = null;
		
		System.out.print("\n아이디 => ");
		String userid = sc.nextLine();
		
		System.out.print("암 호 => ");
		String passwd = sc.nextLine();
		
		String first = passwd.substring(0, 1);
		String middle = passwd.substring(1,passwd.length()-1);
		String last = passwd.substring(passwd.length()-1);
		
		passwd = last+middle+first;
		
		/*		    
		    (자식객체) 부모객체; --yes 공통으로 가지는 것은 넘길 수 있어 
		    (부모객체) 자식객체; --no  자식만 가지는 것을 넘깃 수는 없어 
		 	
		 	(Common) Gujikja; --no // Gujikja에 희망직종 성별,,,Common에 없어서 이렇게는 안돼
		 	
		 	(Gujikja) Common; --yes // Common에 있는 변수들은 Gujikja가 상속받아서 다 쓸수있어 
		 	
		 	(남자) 사람; --yes
		 	(여자) 사람; --yes
		 	(사람) 남자; --no 남자만 가지는 기능을 공통적으로 할 수 없어
		*/
		
		
		
		for(int i=0; i<Common.count; i++) {
			//commonArr안에 들어있는  Gujikja일때만 Company일때는 안된다.
			if(commonArr[i]/*이객체가*/ instanceof Gujikja/*이거냐*/) {
				
				//리턴되어진 값이Common 타입인데 (Gujikja)타입으로 바꾸어준다.
				gujikja = (Gujikja)commonArr[i].login(userid, passwd);//login()메소드 호출,,commonArr[i]안에 내가 입력한 아이디와 암호가 있는지
				
				if(gujikja != null) {
					System.out.println(">>로그인 성공");
					break;
				}	
			}
		}//end of for-------------------------------------
		if(gujikja==null)
			System.out.println(">>로그인 실패");
		return gujikja;
	}//end of loginGujikja()**************************************************************************************
	
	
	//****************************초기메뉴 4. 로그인(구인회사) 을 해주는 메소드 생성 *******************************************//
	public Company loginCompany(Scanner sc) {
			
			Company company = null;
			
			System.out.print("\n아이디 => ");
			String companyid = sc.nextLine();
			
			System.out.print("암 호 => ");
			String passwd = sc.nextLine();
			
			String first = passwd.substring(0, 1);
			String middle = passwd.substring(1,passwd.length()-1);
			String last = passwd.substring(passwd.length()-1);
			
			passwd = last+middle+first;
			
			for(int i=0; i<Common.count; i++) {

				if(commonArr[i]/*이객체가*/ instanceof Company/*이거냐*/) {
					
					//리턴되어진 값이Common 타입인데 (Gujikja)타입으로 바꾸어준다.
					company = (Company)commonArr[i].login(companyid, passwd);//login()메소드 호출,,commonArr[i]안에 내가 입력한 아이디와 암호가 있는지
					
					if(company != null) {
						System.out.println(">>로그인 성공");
						break;
					}	
				}
			}//end of for-------------------------------------
			if(company==null)
				System.out.println(">>로그인 실패");
			return company;
		}//end of loginCompany()**************************************************************************************
	
	
	
	//**************************** 초기메뉴 5. 로그인(관리자) 을 해주는 메소드 생성 *******************************************//

		public boolean loginadmin(Scanner sc) {
			
			
			System.out.print("▷아이디 => ");
			String adminid = sc.nextLine();
			
			System.out.print("▷암 호 => ");
			String passwd = sc.nextLine();
			
			if("admin".equals(adminid) && "asdf1234$".equals(passwd)) {
				System.out.println("로그인 성공");
				return true;
			}
			else {
				System.out.println("로그인 실패");
				return false;
			}
		}//end of loginadmin()**************************************************************************************
	
	
		
	//****************************** 구직자 메뉴번호2. 나의 정보 변경해주는 메소드 생성 *******************************************//
	
	public void updateGujikja(Gujikja me, Scanner sc) {

		System.out.print("▷암호 => ");
		String passwd = sc.nextLine();
		
		System.out.print("▷성명 => ");
		String name = sc.nextLine();
		
		System.out.print("▷생년월일(예: 19930820) => ");
		String birthday = sc.nextLine();
		
		System.out.print("▷주소 => ");
		String address = sc.nextLine();
		
		System.out.print("▷학력(1.대졸이상  2.초대졸  3.고졸  4.고졸미만) => ");
		String strSchool = sc.nextLine();
		int school = Integer.parseInt(strSchool);
		
		System.out.print("▷휴대폰번호 => ");
		String mobile = sc.nextLine();
		
		System.out.print("▷희망직종 => ");
		String hopejob = sc.nextLine();
		
		System.out.print("▷희망급여 => ");
		String strHopeMoney = sc.nextLine();
		int hopemoney = Integer.parseInt(strHopeMoney);
		
		me.setPasswd(passwd);
		me.setName(name);
		me.setBirthday(birthday) ;
		me.setAddress(address);
		me.setSchool(school) ;
		me.setTel(mobile) ;
		me.setHopejob(hopejob) ;
		me.setHopemoney(hopemoney) ;
		
		for(int i=0; i<Gujikja.count; i++) {
			if(commonArr[i] instanceof Gujikja &&
				commonArr[i].getId().equals(me.getId()) ) {
				commonArr[i] = me;
				break;
			}
		
		}
	}//end of updateGujikja()**********************************************************************************	
	
	
	private void updateCompany(Company me, Scanner sc) {
		System.out.print("▷암호 => ");
		String passwd = sc.nextLine();
		
		System.out.print("▷성명 => ");
		String name = sc.nextLine();

		System.out.print("▷주소 => ");
		String address = sc.nextLine();

		System.out.print("▷휴대폰번호 => ");
		String mobile = sc.nextLine();
		
		System.out.print("▷대표자명=> ");
		String ceo = sc.nextLine();
		
		System.out.print("▷자본금 => ");
		long seedmoney = Long.parseLong(sc.nextLine());
		
		System.out.print("▷대표자명=> ");
		String jobtype = sc.nextLine();
		
		me.setPasswd(passwd);
		me.setName(name);
		me.setAddress(address);
		me.setTel(mobile) ;
		me.setCeo(ceo);
		me.setSeedmoney(seedmoney);
		me.setJobtype(jobtype);
		
		
	}
	
	//****************************** 구직자 메뉴번호7. 회원탈퇴를 해주는 메소드 생성 *******************************************//
	
	public void deleteMeGujikja(String userid) {
		
		int deleteIndex = 0;
		
		for(int i=0; i<Common.count; i++) {			
			if(commonArr[i].getId().equals(userid)) {
				deleteIndex = i;
				break;
			}// 로그인한 아이디가 몇번방에 있는지 찾음
		}//end of for--------------------------------
		
		/*
		 	Common.count가 5인 배열의 방번호가 0 1 2 3 4 
		 	                            1 2 3 4 null
		 	0번째 방이 삭제된다라면 deleteIndex 는 0이 되고 
		 	방을 옮기는 4번의 작업이 일어나야 한다.
		 	
		 	1번째 방이 삭제된다라면 deleteIndex 는 1이 되고 
		 	방을 옮기는 3번의 작업이 일어나야 한다.
		 	
		 	2번째 방이 삭제된다라면 deleteIndex 는 2이 되고 
		 	방을 옮기는 2번의 작업이 일어나야 한다.
		 	
		 	3번째 방이 삭제된다라면 deleteIndex 는 3이 되고 
		 	방을 옮기는 1번의 작업이 일어나야 한다.
		 	
		 	4번째 방이 삭제된다라면 deleteIndex 는 4이 되고 
		 	4번째 방은 null이 된다.
		*/
		
		if(deleteIndex == Common.count-1) {
			commonArr[deleteIndex] = null;
		}
		else {
			for(int i=0; i<(Common.count-1-deleteIndex); i++) {
				if(commonArr[i] instanceof Gujikja) {
					commonArr[deleteIndex+i] = commonArr[deleteIndex+1+i];
					commonArr[deleteIndex+1+i] = null;
				}
				
			}
		}
		
		Common.count--; // 구직자 카운트 수는 1감소  1 2 3 4 null,,
		System.out.println(">>> 회원탈퇴 성공");
	}//end of deleteMeGujikja()*********************************************************************************
	
	
	//****************************** 구인회사 메뉴번호7. 회원탈퇴를 해주는 메소드 생성 *******************************************//
	
	public void deleteMeCompany(String userid) {
		
		int deleteIndex = 0;
		
		for(int i=0; i<Common.count; i++) {			
			if(commonArr[i].getId().equals(userid)) {
				deleteIndex = i;
				break;
			}// 로그인한 아이디가 몇번방에 있는지 찾음
		}//end of for--------------------------------
		
		/*
		 	Common.count가 5인 배열의 방번호가 0 1 2 3 4 
		 	                            1 2 3 4 null
		 	0번째 방이 삭제된다라면 deleteIndex 는 0이 되고 
		 	방을 옮기는 4번의 작업이 일어나야 한다.
		 	
		 	1번째 방이 삭제된다라면 deleteIndex 는 1이 되고 
		 	방을 옮기는 3번의 작업이 일어나야 한다.
		 	
		 	2번째 방이 삭제된다라면 deleteIndex 는 2이 되고 
		 	방을 옮기는 2번의 작업이 일어나야 한다.
		 	
		 	3번째 방이 삭제된다라면 deleteIndex 는 3이 되고 
		 	방을 옮기는 1번의 작업이 일어나야 한다.
		 	
		 	4번째 방이 삭제된다라면 deleteIndex 는 4이 되고 
		 	4번째 방은 null이 된다.
		*/
		
		if(deleteIndex == Common.count-1) {
			commonArr[deleteIndex] = null;
		}
		else {
			for(int i=0; i<(Common.count-1-deleteIndex); i++) {
				if(commonArr[i] instanceof Company) {
					commonArr[deleteIndex+i] = commonArr[deleteIndex+1+i];
					commonArr[deleteIndex+1+i] = null;
				}
				
			}
		}
		
		Common.count--; // 구직자 카운트 수는 1감소  1 2 3 4 null,,
		System.out.println(">>> 회원탈퇴 성공");
	}//end of deleteMeGujikja()*********************************************************************************
	
	
	// *** 구인회사 메뉴번호5. 채용공고를 해주는 메소드 생성 ***
	public void guin(Company loginCompany, Scanner sc) {

		System.out.print("▷채용성별[1.남/2.여/3.성별무관] => ");
		String gender = sc.nextLine();
		
		System.out.print("▷채용최소나이 => ");
		String agemin = sc.nextLine();
		
		System.out.print("▷채용최대나이 => ");
		String agemax = sc.nextLine();
		
		System.out.print("▷채용학력[1.대졸이상 /2.초대졸/3.고졸/4.학력무관] => ");
		String school = sc.nextLine();
		
		/*Recruit recruit = new Recruit();
		recruit.setCompany(loginCompany);
		recruit.setGender(gender);
		recruit.setAgemin(Integer.parseInt(agemin));
		recruit.setAgemax(Integer.parseInt(agemax));
		recruit.setSchool(school);*/
		
		
		if(Recruit.count < recruitArr.length) {
			Recruit recruit = new Recruit(loginCompany,gender,Integer.parseInt(agemin),Integer.parseInt(agemax),school);
			
			recruitArr[Recruit.count-1] = recruit;
			
			
			System.out.println("\n==== 등록하신 채용정보 결과화면 =====");
			System.out.println(recruit.getRecruitInfo());
		}
		else
			System.out.println(">>> 채용공고 최대치를 초과했으므로 채용공고는 불가합니다. <<<");
		
		
	}//*******************************************************
	
	
	//**구직자 메뉴번호3. 모든 채용공고 조회해주는 메소드
	public void showAllGuin() {
		for(int i=0; i<Recruit.count; i++) {
			System.out.println(recruitArr[i].getRecruitInfo());
			System.out.println();
		}
	}
	//**************************************************
	
	//****************************** 관리자 메뉴번호3. 특정 구직자 삭제해주는 메소드 생성 *******************************************//
	
	public void deleteTheGujikja(Scanner sc) {
		
		System.out.print("▷삭제할 구직자 ID => ");
		String id = sc.nextLine();
		
		boolean isExists = false;
		
		for(int i=0; i<Common.count; i++) {			
			if(commonArr[i] instanceof Gujikja &&
				commonArr[i].getId().equals(id)) {
				isExists = true;
				break;
			}
		}
		
		if(isExists)
			deleteMeGujikja(id);
		else
			System.out.println(">>> 삭제하시려는 구직자 ID "+id+" 는 존재하지 않습니다.");		
		
	}//end of deleteTheGujikja()******************************************************************************
	
	//****************************** 관리자 메뉴번호3. 특정 구인회사 삭제해주는 메소드 생성 *******************************************//
	
		public void deleteTheCompany(Scanner sc) {
			
			System.out.print("▷삭제할 구인회사 ID => ");
			String id = sc.nextLine();
			
			boolean isExists = false;
			
			for(int i=0; i<Common.count; i++) {			
				if(commonArr[i] instanceof Company &&
					commonArr[i].getId().equals(id)) {
					isExists = true;
					break;
				}
			}
			
			if(isExists)
				deleteMeCompany(id);
			else
				System.out.println(">>> 삭제하시려는 구인회사 ID "+id+" 는 존재하지 않습니다.");		
			
		}//end of deleteTheGujikja()******************************************************************************
	
		
	
		
	
	//*********************************************** main() *************************************************//
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String stratmenuNo = "";
		JobMain jobapp = new JobMain(); // 인스턴스 메소드 호출위해서 객체를 만들어야된다.
		
		//Gujikja ,,하나의 데이터형으로 생각해라
		Gujikja loginGujikja/*로그인 된 구직자*/ = null;
		Company loginCompany = null;
		
		do {
			JobMain.startMenu(); //메뉴메소드 호출
			stratmenuNo= sc.nextLine(); // 
			
			switch (stratmenuNo) {
				case "1": // 구직자 등록(생성)
					jobapp.registerGujikja(sc); // registerGujikja()메소드 호출,,메소드에 스캐너 넘겨준다
					break;
				case "2":
					jobapp.registercompany(sc);
					break;
				case "3": // 로그인 (구직자) 
					{
						loginGujikja = jobapp.loginGujikja(sc);// loginGujikja()메소드 호출,,로그인 검사 시도
						/*로그인된 구직자*/
						
						if(loginGujikja != null) { // 로그인 성공했으면..
							String gujikjaMenuno=""; 
							
							do {
								JobMain.gujikjaMenu(); // 구직자 메뉴 보여주기 
								gujikjaMenuno= sc.nextLine();
								boolean isBreak = false;
								
								//구직자 메뉴 번호를 입력하면~~
								switch (gujikjaMenuno) {
								case "1": // 나의 정보 조회 
									System.out.println(loginGujikja.getGujikjaInfo());
									break;
								case "2": // 나의 정보 변경
									jobapp.updateGujikja(loginGujikja,sc);
									break;
								case "3": // 모든 채용공고 조회
									jobapp.showAllGuin();
									break;
								case "4": // 구인회사 ID 검색
									break;
								case "5": // 특정 업종 채용공고 조회
									break;
								case "6": // 로그아웃
									isBreak = true;
									break; 
								case "7": // 회원탈퇴(구직자 배열 commonArr에서 자신의 객체를 null로 만든다)
									jobapp.deleteMeGujikja(loginGujikja.getId());
														/*로그인된 구직자.고유한 값=아이디*/				
									isBreak = true;
									break;
								default:
									System.out.println("1~7번중에 선택해주세요.");
									continue;
								} //end of switch----------------
								
								if(isBreak)
									break;
								
							} while (true);
		
						}//end of if
					}
					break;
				case"4": //로그인 (구인회사)
				{
					loginCompany = jobapp.loginCompany(sc);
					boolean isBreak = false;
					
					if(loginCompany != null) { // 로그인 성공했으면..
						String companyMenuno = ""; 
						
						do {//구인회사 메뉴보여주기
							JobMain.companyMenu(); 
							companyMenuno= sc.nextLine();
							
							
							switch (companyMenuno) {
							case "1": 
								System.out.println(loginCompany.getCompanyInfo());
								break;
							case "2": 
								jobapp.updateCompany(loginCompany,sc);
								break;
							case "3":
								for(int i=0; i<Common.count; i++) {
									if(jobapp.commonArr[i] instanceof Gujikja) {
										System.out.println(((Gujikja)jobapp.commonArr[i]).getGujikjaInfo());
										//commonArr[i] 인스턴스 객체?jobapp 
										System.out.println();
									}
								}
								break;
							case "4": //특정구직자 ID 검색
								break;
							case "5"://채용공고하기 
								jobapp.guin(loginCompany, sc);
								break;
							case "6": //로그아웃
								isBreak = true;
								break; 
							case "7": 
								jobapp.deleteMeCompany(loginCompany.getId());			
								isBreak = true;
								break;
							default:
								System.out.println("1~7번중에 선택해주세요.");
								continue;
							} //end of switch----------------
							
							if(isBreak)
								break;
							
						} while (true);
	
					}//end of if
				}
					break;
				case"5":
					boolean loginadmin = false;
					loginadmin = jobapp.loginadmin(sc);
					String adminno="";
					do {
						if(loginadmin) {
							JobMain.adminMenu();
							adminno = sc.nextLine();
							
							switch (adminno) {
							case "1": // 모든 구직자정보 출력
								for(int i=0; i<Common.count; i++) {
									if(jobapp.commonArr[i] instanceof Gujikja) {
									    //연산순서가 형변환이 제일 마지막에 일어난다 그래서  ((Gujikja)jobapp.commonArr[i]) 이렇게 괄호를 
										//해줘야 형변환이 일어나서.getGujikjaInfo()를 할 수 있다.
										System.out.println(((Gujikja)jobapp.commonArr[i]).getGujikjaInfo());
										//commonArr[i] 인스턴스 객체?jobapp 
										System.out.println();
									}
								}
								break;
							case "2": // 모든 구인회사정보 출력
								for(int i=0; i<Common.count; i++) {
									if(jobapp.commonArr[i] instanceof Company) {
										System.out.println(((Company)jobapp.commonArr[i]).getCompanyInfo());
									}
								}
								break;                
							case "3": // 특정 구직자 삭제
								 jobapp.deleteTheGujikja(sc);
								break;
							case "4": // 특정 구인회사 삭제
								 jobapp.deleteTheCompany(sc);
								break;
							case "5": // 로그아웃
								break;	
							default:
								System.out.println("1~5번중에 선택해주세요.");
								continue;
							}//end of switch
						}
						else	
							break;
						
					} while (!"5".equals(adminno));
					break;
				default:
					System.out.println("1~6번중에 선택해주세요.");
					continue;
			}//end of switch-------------------
			
			
		} while (!"6".equals(stratmenuNo));	//end of do-while---------------- 
		//입력한 메뉴번호가 6이면 빠져나온다. //프로그램 종료
		
		System.out.println("\n=== 프로그램 종료 ===");
		sc.close();

	}//end of main()------------------------







}//end of class JobMain/////////////////////////////

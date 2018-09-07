package my.day11;

import java.util.Scanner;

import my.util.MyUtil;

public class JobMain {
	
	//Gujikja 객체를 저장시키는 배열 
	Gujikja[] gujikjaArr = new Gujikja[3];

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
	
	
	// *********************초기메뉴 1. 구직자를 등록(생성)해주는 기능 ************************************ //
	
	public void registerGujikja(Scanner sc) {
		
		String userid = "";
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
			userid = sc.nextLine();
			
			
	        //---------------------- 아이디 공백 검사 --------------------------//
			boolUserid = userid.trim().isEmpty(); // boolUserid 이 참인경우는 userid가 "","   " 공백이다.
			
			 if(boolUserid) // "","   " 공백이 있으면 아이디로 쓸수없다
				 System.out.println(">>> 아이디는 공백만으로 사용불가 합니다. 다시 입력해주세요.");	
			//-----------------------------------------------------------//
			 
			 
			  
			 else { // userid가 공백이 아닌 값을 넣은경우 .. 공백검사 통과됬을때
				 
			//---------------------- 아이디 중복 검사 -------------------------//	
				 for(int i=0; i<Gujikja.count; i++) {
					 if(userid.equals(gujikjaArr[i].userid)) {
						 System.out.println("이미 사용하고 있는 아이디입니다.");
						 boolUserid = true; 
						 break;//userid가 중복이 아닌 고유한 값이라면 
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
		else if("1".equals(yn) && Gujikja.count == gujikjaArr.length) {
			System.out.println("\n>>> 정원이 초과했으므로 구직자 회원가입이 불가합니다.");
			
		}
		else {
			// Gujikja 객체 생성(회원가입) 
			// 올바른 값이 올때까지 객체를 생성하지않는다!! 그래서 구직자를 등록(생성)해주는 기능 다음에 객체를 생성한다. 
			Gujikja gujikja = new Gujikja(userid, passwd, name, birthday, gender, address, school, mobile, hopejob, hopemoney);
			
			//생성한 구직자 객체를 배열속에 넣는다
			gujikjaArr[Gujikja.count-1] = gujikja;
			System.out.println(">>> 구직자 회원가입 성공");
			System.out.println("["+Gujikja.count+" 번째/전체 :"+gujikjaArr.length+"명]");
		}
		

		
	 
	}//end of registerGujikja()*******************************************************************************
	
	
	
	
	
	
	
	//****************************초기메뉴 3. 로그인(구직자) 을 해주는 메소드 생성 *******************************************//

	public Gujikja loginGujikja(Scanner sc) {
		
		Gujikja gujikja = null;
		
		System.out.print("\n아이디 => ");
		String userid = sc.nextLine();
		
		System.out.print("암 호 => ");
		String passwd = sc.nextLine();
		
		for(int i=0; i<Gujikja.count; i++) {
			gujikja = gujikjaArr[i].login(userid, passwd);//login()메소드 호출,,gujikjaArr[i]안에 내가 입력한 아이디와 암호가 있는지
			if(gujikja != null) {
				System.out.println(">>로그인 성공");
				break;
			}
		}//end of for-------------------------------------
		if(gujikja==null)
			System.out.println(">>로그인 실패");
		return gujikja;
	}//end of loginGujikja()**************************************************************************************
	
	
	
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

		System.out.print("▷암 호 => ");
		me.passwd = sc.nextLine();
		
		System.out.print("▷이 름 => ");
		me.name = sc.nextLine();
		
		System.out.print("▷생년월일(예: 19960326) => ");
		me.birthday = sc.nextLine();
		
		System.out.print("▷성 별(1.남자/2.여자) => ");
		me.gender = Integer.parseInt(sc.nextLine());
		
		System.out.print("▷주 소 => ");
		me.address = sc.nextLine();
		
		System.out.print("▷학 력(1.대졸이상/2.초대졸/3.고졸/4.고졸미만) => ");
		me.school = Integer.parseInt(sc.nextLine());
		
		System.out.print("▷휴대폰 번호(예: 0101231234) => ");
		me.mobile = sc.nextLine();
		
		System.out.print("▷희망직종 => ");
		me.hopejob = sc.nextLine();
		
		System.out.print("▷희망연봉 => ");
		me.hopemoney = Integer.parseInt(sc.nextLine());
		
	}//end of updateGujikja()**********************************************************************************
	
	
	//****************************** 구직자 메뉴번호7. 회원탈퇴를 해주는 메소드 생성 *******************************************//
	
	public void deleteMeGujikja(String userid) {
		
		int deleteIndex = 0;
		
		for(int i=0; i<Gujikja.count; i++) {			
			if(gujikjaArr[i].userid.equals(userid)) {
				deleteIndex = i;
				break;
			}// 로그인한 아이디가 몇번방에 있는지 찾음
		}//end of for--------------------------------
		
		/*
		 	Gujikja.count가 5인 배열의 방번호가 0 1 2 3 4 
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
		
		if(deleteIndex == Gujikja.count-1) {
			gujikjaArr[deleteIndex] = null;
		}
		else {
			for(int i=0; i<(Gujikja.count-1-deleteIndex); i++) {
				gujikjaArr[deleteIndex+i] = gujikjaArr[deleteIndex+1+i];
				gujikjaArr[deleteIndex+1+i] = null;
				
			}
		}
		
		Gujikja.count--; // 구직자 카운트 수는 1감소  1 2 3 4 null,,
		System.out.println(">>> 회원탈퇴 성공");
	}//end of deleteMeGujikja()*********************************************************************************
	
	
	
	//****************************** 관리자 메뉴번호3. 특정 구직자 삭제해주는 메소드 생성 *******************************************//
	
	public void deleteTheGujikja(Scanner sc) {
		
		System.out.print("▷삭제할 구직자 ID => ");
		String userid = sc.nextLine();
		
		boolean isExists = false;
		
		for(int i=0; i<Gujikja.count; i++) {			
			if(gujikjaArr[i].userid.equals(userid)) {
				isExists = true;
				break;
			}
		}
		
		if(isExists)
			deleteMeGujikja(userid);
		else
			System.out.println(">>> 삭제하시려는 구직자 ID "+userid+" 는 존재하지 않습니다.");		
		
	}//end of deleteTheGujikja()******************************************************************************
	
		
	
		
	
	//*********************************************** main() *************************************************//
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String stratmenuNo = "";
		JobMain jobapp = new JobMain(); // 인스턴스 메소드 호출위해서 객체를 만들어야된다.
		
		//Gujikja ,,하나의 데이터형으로 생각해라
		Gujikja loginGujikja/*로그인 된 구직자*/ = null;
		
		do {
			JobMain.startMenu(); //메뉴메소드 호출
			stratmenuNo= sc.nextLine(); // 
			
			switch (stratmenuNo) {
				case "1": // 구직자 등록(생성)
					jobapp.registerGujikja(sc); // registerGujikja()메소드 호출,,메소드에 스캐너 넘겨준다
					break;
				case "2":
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
									break;
								case "4": // 구인회사 ID 검색
									break;
								case "5": // 특정 업종 채용공고 조회
									break;
								case "6": // 로그아웃
									isBreak = true;
									break; 
								case "7": // 회원탈퇴(구직자 배열 gujikjaArr에서 자신의 객체를 null로 만든다)
									jobapp.deleteMeGujikja(loginGujikja.userid);
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
				case"4":					
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
								for(int i=0; i<Gujikja.count; i++) {
									System.out.println(jobapp.gujikjaArr[i].getGujikjaInfo());
									//gujikjaArr[i] 인스턴스 객체?jobapp 
									System.out.println();
								}
								break;
							case "2": // 모든 구인회사정보 출력
								break;
							case "3": // 특정 구직자 삭제
								 jobapp.deleteTheGujikja(sc);
								break;
							case "4": // 특정 구인회사 삭제
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

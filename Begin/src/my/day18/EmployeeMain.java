package my.day18;
import java.util.*;

public class EmployeeMain implements InterEmployee{

	public static void main(String[] args) {
		/*
		 	예> 조회할 부서번호 : 10 엔터
		 	10번 부서에 근무하는 사원들만 출력
		 	
		 	예> 조회할 부서번호 : 20 엔터
		 	20번 부서에 근무하는 사원들만 출력
		*/
		
		Map<String, List<Employee>> map = new HashMap<String, List<Employee>>();//키값String 
		
		List<Employee> list_10/*10번부서에있는사람들*/ = new ArrayList<Employee>();
		List<Employee> list_20 = new ArrayList<Employee>();
		List<Employee> list_30 = new ArrayList<Employee>();
		
		list_10.add(new Employee("10","kh10001","박남정","부장",1000));
		list_10.add(new Employee("10","kh10002","박여정","과장",1500));
		list_10.add(new Employee("10","kh10003","김상원","대리",2000));
		
		list_20.add(new Employee("20","kh20001","이상원","부장",7000));
		list_20.add(new Employee("20","kh20002","이하원","과장",5000));
		list_20.add(new Employee("20","kh20003","이중원","대리",4000));
		list_20.add(new Employee("20","kh20004","이상투","대리",4000));
		
		list_30.add(new Employee("30","kh30001","홍윤성","부장",5000));
		list_30.add(new Employee("30","kh30002","홍윤별","과장",4500));
		
		map.put("10"/*키값*/, list_10);
		map.put("20"/*키값*/, list_20);
		map.put("30"/*키값*/, list_30);
		
		//부서번호 10 출력
		for(int i=0; i<map.get("10").size(); i++) {
			System.out.println(map.get("10").get(i).getEmployee());
		}
		
		EmployeeMain empMain = new EmployeeMain();//메소드 호출하려고 만들었다
				Scanner sc = new Scanner(System.in);		
		System.out.print(">>> 조회할 부서번호 : ");
		String deptno = sc.nextLine();
		
		//조회한 부서 정보 출력 showDeptInfo메소드 호출
		String info = empMain.showDeptInfo(map, deptno); 
		System.out.println(info);
		
		
		  
		// 이건 리스트를 출력해주는거 [객체1,객체2,객체3...]
		// toString을 재정의 해줘서 재정의 한 것이 나오지만 재정의 안하면
		// [객체1의 주소값,객제2의 주소값, 객체3의 주소값...] 이렇게 나와
		// System.out.println(map.get(deptno));
		
		
		
		
		//================================== 직급을 변경하고 싶어 =======================================//		
		System.out.println("-------------------------------------------");
		System.out.print("▷직급을 변경하려는 부서번호 입력 : "); 
		deptno = sc.nextLine();
		
		System.out.print("▷변경할 직급명 : ");
		String changeJik = sc.nextLine();
		
		//직급을 변경해주는 메소드 호출 changeJik 메소드호출
		empMain.changeJik(map, deptno, changeJik);
		
		//변경한 거 조회할려고 showDeptInfo메소드 호출
		info = empMain.showDeptInfo(map, deptno); 
		System.out.println(info);
		
		
		
		
		
		//================================== 급여율 변경하고 싶어 =======================================//		
		System.out.println("-------------------------------------------");
		System.out.print("▷급여를 변경하려는 부서번호 입력 : "); // 10
		deptno = sc.nextLine();
		
		System.out.print("▷급여 변경률 : "); // 사장
		double percent = Double.parseDouble(sc.nextLine());
		
		//급여율 변경해주는 메소드 호출 changeSalary 메소드 호출
		empMain.changeSalary(map, deptno, percent);
		
		//변경한 거 조회할려고 showDeptInfo메소드 호출
		System.out.println(empMain.showDeptInfo(map, deptno));
		
		
		
		
		
		
		//================================= 특정 사원의 급여율 변경하고 싶어 ==================================//
		System.out.println("-------------------------------------------");
		System.out.print("▷급여를 변경하려는 사원코드 입력 : ");
		String sawoncode = sc.nextLine();
		
		System.out.print("▷급여 변경률 : ");
		percent = Double.parseDouble(sc.nextLine());
		
		//특정 사원의 급여율변경해주는 메소드 호출 changeTheSalary 메소드 호출
		empMain.changeTheSalary(map, sawoncode, percent);
		
		
		
		//================================= 특정 사원의 직급을 변경하고 싶어 ==================================//
		System.out.println("-------------------------------------------");
		System.out.print("▷직급을 변경하려는 사원코드 입력 : ");
		sawoncode = sc.nextLine();
		
		System.out.print("▷변경할 직급명 : ");
		changeJik = sc.nextLine();
		
		//특정 사원의 급여율변경해주는 메소드 호출 changeTheSalary 메소드 호출
		empMain.changeTheJik(map, sawoncode, changeJik);
		
		
		
		sc.close();

		
		
	}//end of main()-----------------------------------------------------------------------------------

	
	
	//Map 계열에 저장된 value값을 추출하려면 key를 이용해서 가져오는데 value 값의 추출은 get(String key) 메소드를 사용한다.
	//여기서 Map<String, List<Employee>> map = 이렇게 객체를 만들었다
	
	//조회한 부서 정보출력하는 메소드
	@Override
	public String showDeptInfo(Map<String, List<Employee>> map, String deptno) {

		//자료가 저장되어진 저장소 map.. map에서 꺼내오자 get!..
		//Map 계열은 key값과 value값을 쌍으로 사용하여 저장하는데  데이터 저장시 사용되는 메소드는 put(String key, Object value)메소드를 사용한다.
		//map.get(deptno) deptno 이게 여기서 키값이야  map.put("10"/*키값*/, list_10); 이렇게 map에 넣어줬어
		
		List<Employee> empList = map.get(deptno);/*여기에 null이 들어올 수 있으면 무조건 잡아줘야되.. if로 잡아줌*/
		
		StringBuilder sbuilder = new StringBuilder();//이거는 my.day10에 있다
		String info = "";
		
		if(empList != null) {						
			for(Employee emp : empList) {
				info = sbuilder.append(emp.getEmployee()+"\n").toString();
			}          //StringBuilder는 클래스 toString으로 바꿔줘
			
			/*for(int i=0; i<empList.size(); i++) {
				sbuilder.append(empList.get(i).getEmployee());
				System.out.println(emp.toString);
			 }*/
		}
		else
			info = ">>> 검색하시려는 부서 "+deptno+"는 존재하지 않습니다.";
		
		return info;
		
	}

	//직급을 변경해주는 메소드
	@Override
	public void changeJik(Map<String, List<Employee>> map, String deptno, String changeJik) {
		List<Employee> empList = map.get(deptno);
		
		if(empList != null) {
			for(Employee emp : empList) {
			emp.setJik(changeJik);
			} 
			/*
			 	for(int i=0; i<empList.size(); i++) {
				empList.get(i).setJik(changeJik);
				}
			*/
			System.out.println(">>> 직급 변경 완료");
		}
		else
			System.out.println(">>> 직급을 변경하려는 부서번호 "+deptno+"는 존재하지 않습니다.");
	
	}
	
	//급여율 변경해주는 메소드
	@Override
	public void changeSalary(Map<String, List<Employee>> map, String deptno, double percent) {
		List<Employee> empList = map.get(deptno);
		
		if(empList != null) {
			for(Employee emp : empList) {
			emp.setSalary ((int)Math.round(emp.getSalary()*(100+percent)/100));
			} 
		}
		else
			System.out.println(">>> 급여를 변경하려는 부서번호 "+deptno+"는 존재하지 않습니다.");
	}

	//특정사원의 급여율을 변경해주는 메소드
	@Override
	public void changeTheSalary(Map<String, List<Employee>> map, String sawoncode, double percent) {
		
		Set<String> keySet = map.keySet();
		boolean bool = false;
		for(String key: keySet) {
			for(Employee emp : map.get(key)) {
				if(emp.getSawoncode().equals(sawoncode)) {
					emp.setSalary ((int)Math.round(emp.getSalary()*(100+percent)/100));
					System.out.println("변경된 사원 정보 출력");
					System.out.println(emp.getEmployee());
					bool = true;
				}
				
			}		
		}
		if(bool==false)
			System.out.println(">>> 찾으려는 사원코드가 없습니다.");
	}

	//특정사원의 직급을 변경해주는 메소드
	@Override
	public void changeTheJik(Map<String, List<Employee>> map, String sawoncode, String changeJik) {
		Set<String> keySet = map.keySet();
		boolean bool = false;
		
		for(String key : keySet) {
			for(Employee emp : map.get(key)) {
				if(emp.getSawoncode().equals(sawoncode)) {
					emp.setJik(changeJik);
					System.out.println("변경된 사원 정보 출력");
					System.out.println(emp.getEmployee());
					bool = true;
				}
			}
			
		}
		if(bool==false)
			System.out.println(">>> 찾으려는 사원코드가 없습니다.");
	}
	
	
	
		

}

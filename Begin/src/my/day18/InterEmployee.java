package my.day18;

import java.util.List;
import java.util.Map;

public interface InterEmployee {
	
	String showDeptInfo(Map<String, List<Employee>> map/* 저장소*/,String deptno);
	void changeJik(Map<String, List<Employee>> map, String deptno, String changeJik);
	void changeSalary(Map<String, List<Employee>> map, String deptno, double percent); 
	void changeTheSalary(Map<String, List<Employee>> map, String sawoncode, double percent);
	void changeTheJik(Map<String, List<Employee>> map, String sawoncode, String changeJik);
	

}

package my.day9;

import java.text.DecimalFormat;

public class Employee {

	String name;
	int[] salary;//배열도 객체이다. new ~~ 라고 해야되
	int sum;
	DecimalFormat df = new DecimalFormat("#,###");
	
	public void showEmployeeInfo() {
		System.out.println("1.성명 : "+ name);
		
		/*for(int i=0; i<salary.length; i++) {
			System.out.println(salary[i]);
		}*/
		
		
		for(int i=0; i<salary.length; i++) {
			sum += salary[i];
		}
		
		System.out.println("2.급여합계 :"+df.format(sum)+" 만원");
		System.out.println("3.1달평균급여 :"+df.format((sum)/salary.length)+" 만원");

	}
	
	
	
	public int[] getSalary() { //리턴타입을 배열타입으로
		return salary;
	}
	
	public void updateSalary(int[] newSalary) {
		salary = newSalary;
	}
}

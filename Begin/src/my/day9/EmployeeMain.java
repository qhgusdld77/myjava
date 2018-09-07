package my.day9;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.name = "한석규";
		
	//	emp1.salary = new int[12];//배열도 객체이다. new ~~ 라고 해야되
		emp1.salary = new int[]{100,200,300,400,500,600,700,800,900,1000,1100,1200};

		/*for(int i=0; i<emp1.salary.length; i++) {
			emp1.salary[i]=emp1.salary[i]*10000;
		}*/
		
		Employee emp2 = new Employee();
		emp2.name = "두석규";
		emp2.salary = new int[]{100,200,300,400,500,600};
		
		
		Employee emp3 = new Employee();
		emp3.name = "세석규";
		emp3.salary = new int[]{100,200,300,400};
		
		Employee[] empArr = {emp1,emp2,emp3};
		
		//for(int i=0; i<empArr.length; i++) 
		 for(Employee e : empArr){
			e.showEmployeeInfo();
			System.out.println();
		}
		/*
		 	1. 사원명 : 한석규
		 	2. 급여합계 :
		 	3. 1달 평균급여 :
		 	
		 	1. 사원명 : 두석규
		 	2. 급여합계 :
		 	3. 1달 평균급여 :
		 	
		 	1. 사원명 : 세석규
		 	2. 급여합계 :
		 	3. 1달 평균급여 :
		*/
		 
		 System.out.println("\n-----------------------------------");
		 int[] salArr = emp3.getSalary(); // int[] 타입으로 받아온다.
		 
		 for(int i=0; i<salArr.length; i++) {
			 String str = (i<salArr.length-1)?",":"";
			 System.out.print(salArr[i]+str);
		 }
		 //100,200,300,400
		 
		 System.out.println("\n====================================\n");
		 
		 int[] newSalary = /*new int[]생략가능*/{110,220,330,440};
		 
		 emp3.updateSalary(newSalary);
		 
		 salArr = emp3.getSalary();
		 
		 for(int i=0; i<salArr.length; i++) {
			 String str = (i<salArr.length-1)?",":"";
			 System.out.print(salArr[i]+str);
		 }
		 
		 //110,220,330,440
		 
		 
		 
		 
		 
		 

	}

}

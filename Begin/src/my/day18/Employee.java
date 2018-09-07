package my.day18;

public class Employee {
	
	private String deptno;//부서번호
	private String sawoncode;//사원코드번호
	private String ename;//사원명
	private String jik;//직급
	private int salary;//급여
	
	public Employee() {}
	
	public Employee(String deptno, String sawoncode, String ename, String jik, int salary) {
		super();
		this.deptno = deptno;
		this.sawoncode = sawoncode;
		this.ename = ename;
		this.jik = jik;
		this.salary = salary;
	}

	public String getDeptno() {
		return deptno;
	}

	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}

	public String getSawoncode() {
		return sawoncode;
	}

	public void setSawoncode(String sawoncode) {
		this.sawoncode = sawoncode;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJik() {
		return jik;
	}

	public void setJik(String jik) {
		this.jik = jik;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getEmployee() {
		String info = "▷사원코드번호 :"+sawoncode+
						"\n▷부서번호 :"+deptno+
						"\n▷사원명 :"+ename+
						"\n▷직급 :"+jik+
						"\n▷급여 :"+salary+"\n";
		return info;
	}
	
	@Override
	public String toString() {
		String info = "▶사원코드번호 :"+sawoncode+
						"\n▶부서번호 :"+deptno+
						"\n▶사원명 :"+ename+
						"\n▶직급 :"+jik+
						"\n▶급여 :"+salary+"\n";
		return info;
	}
	

}

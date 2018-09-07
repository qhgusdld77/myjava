package my.day19.sub;

public class Join3 implements Runnable, InterJoin {
	
	private String tel;
	private String addr;
	

	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}


	public String getAddr() {
		return addr;
	}


	public void setAddr(String addr) {
		this.addr = addr;
	}


	@Override
	public void run() {

		showInfo();
		
	}


	@Override
	public void showInfo() {
		System.out.println("======== Join3 ========");
		System.out.println("▶연락처 : "+tel+", 주소 : "+addr+"\n\n");
		
	}

}

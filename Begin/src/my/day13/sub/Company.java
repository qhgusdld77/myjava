package my.day13.sub;

import java.text.DecimalFormat;

public class Company extends Common{
	
	// *** Company 클래스의 속성 정하기(추상화작업)

	private String ceo;		//대표자명
	private long seedmoney;	//자본금
	private String jobtype;	//업종
	
	public Company() {
		super.count++; //부모클래스에서 가져온 클래스변수..super은 안써도 되는데 헷갈릴까봐
	}
	
	
	public Company(String id, String passwd, String name, String address, String tel
										  ,String ceo, long seedmoney, String jobtype) {
	    /*super(); 생략가능하지만 부모클래스에 있는 파라미터를 쓸때는 밑에처럼 써줘야되*/
		super(id, passwd, name, address, tel);
		this.ceo = ceo;
		this.seedmoney = seedmoney;
		this.jobtype = jobtype;
		
		super.count++;
	}


	public String getCeo() {
		return ceo;
	}


	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	
	
	


	public long Seedmoney() {
		return seedmoney;
	}


	public String getSeedmoney() {
		DecimalFormat df = new DecimalFormat("#,###");
		return df.format(seedmoney)+"만원";
	}
	
	
	public void setSeedmoney(long seedmoney) {
		this.seedmoney = seedmoney;
	}
	


	public String getJobtype() {
		return jobtype;
	}


	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}
	
	
	//구인회사의 정보를 조회할 수 있는 기능
	public String getCompanyInfo() {
		
		String info = "\n=== 회사명 "+super.getName()/*super빼도되고 this도 되고*/+" 정보 ===\n"+
						super.commonInfo().replaceAll( "성 명", "회사명")+//성명을 회사명으로 바꿔준다
						"▷ 대표자명 : "+ceo+"\n"+
						"▷ 자본금 : "+getSeedmoney()+"\n"+
						"▷ 업 종 : "+jobtype+"\n";

		return info;
		
		
	}
	


	
	
	
	
	
	
	
	
	
	
	
}

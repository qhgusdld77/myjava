// import java.long.String;
// import java.lang.*;
//import Merber1; day2 ������ ���� �ȿ� �־ ��������

public class Member1MainTest
{
	public static void main(String[] args) 
	{
		Member1 me = new Member1();
		me.userid = "bohyeon";
		me.pwd = "bobo77";
		me.name = "�躸��";
		me.age = 23;
		me.address = "�ֹ�";

		me.showInfo();

		System.out.println("");

		Member1 you = new Member1("irin","abcd70!","���̸�",22,"����� ������");
		you.showInfo();
		
	} 
}

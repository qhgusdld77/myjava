// import java.long.String;
// import java.lang.*;
//import Merber1; day2 동일한 폴더 안에 있어서 생략가능

public class Member1MainTest
{
	public static void main(String[] args) 
	{
		Member1 me = new Member1();
		me.userid = "bohyeon";
		me.pwd = "bobo77";
		me.name = "김보현";
		me.age = 23;
		me.address = "쌍문";

		me.showInfo();

		System.out.println("");

		Member1 you = new Member1("irin","abcd70!","아이린",22,"서울시 강남구");
		you.showInfo();
		
	} 
}

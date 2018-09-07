package my.day8;

import java.util.Scanner;

import my.util.MyUtil;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String[] cheapFoodArr = {"돈까스","김치볶음밥","카레라이스","라면","순두부찌게"};
		
		String[] royalFoodArr = {"추어탕","삼계탕","고기국수","스테이크"};
		

		
		System.out.println(">> 오늘의 점심메뉴는(1.싼것/2.고급진것) ==> ");
		String user = sc.nextLine();
		
		
		if("1".equals(user)) {
			int index = MyUtil.random(0, 4);
			System.out.println(cheapFoodArr[index]);
		}
		else if("2".equals(user)) {
			int index = MyUtil.random(0, 3);
			System.out.println(royalFoodArr[index]);
		}
		else {
			System.out.println("1,2 중선택");
		}


	}

}

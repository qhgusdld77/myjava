package ncs.test2;

public class BookTest {

	public static void main(String[] args) {
		Book[] bookArray = new Book[5];
		
		bookArray[0] = new Book("IT", "SQL Plus", 50000, 5);
		bookArray[1] = new Book("IT", "Java 2.0", 40000, 3);
		bookArray[2] = new Book("IT", "JSP Servlet", 60000 , 6);
		bookArray[3] = new Book("Nobel", "davincicode", 30000, 10);
		bookArray[4] = new Book("Nobel", "cloven hoof ", 50000, 15);
		
		double sum = 0.0;
		
		for(int i=0; i<bookArray.length; i++) {
			String str = bookArray[i].getCategory()+"\t"+bookArray[i].getBookName()
					+"\t"+bookArray[i].getBookPrice()+"원\t"+bookArray[i].getBookDiscountRate()+"%";
			System.out.println(str);
			sum += bookArray[i].getBookPrice();
		}
		
		System.out.println("책 가격의 합 : "+sum+"원");

	}//end of main--------------------------------

}

/*
  IT      SQL Plus     50000.0원   5.0%
  IT      Java 2.0     40000.0원   3.0%
  IT      JSP Servlet  60000.0원   6.0%
  Nobel   davincicode  30000.0원   10.0%
  Nobel   cloven hoof  50000.0원   15.0%
  책 가격의 합: 230000.0원
*/

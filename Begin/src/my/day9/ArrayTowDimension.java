/*
  	=== 2차원 배열 ===
*/

package my.day9;

public class ArrayTowDimension {

	public static void main(String[] args) {
		
		
		
		
		int [][] pointArr = new int [4][3]; //4행 3열
		
		pointArr[0][0] = 10;
		pointArr[0][1] = 20;
		pointArr[0][2] = 30;
		
		pointArr[1][0] = 40;
		pointArr[1][1] = 50;
	//	pointArr[1][2] = 60;
		
		pointArr[2][0] = 70;
		pointArr[2][1] = 80;
		pointArr[2][2] = 90;
		
		pointArr[3][0] = 100;
		pointArr[3][1] = 110;
		pointArr[3][2] = 120;
		
		System.out.println("pointArr.lenght => " +pointArr.length);
		//pointArr.lenght => 4
		
		System.out.println("pointArr[0].lenght => " +pointArr[0].length);
		//pointArr[0].lenght => 3
		
		System.out.println("pointArr[1].lenght => " +pointArr[1].length);
		//pointArr[1].lenght => 3
		
		/*
		 	10 20 30 
		 	40 50 0
		 	70 80 90
		 	100 110 120
		*/
		System.out.println("--------------------------");
		for(int i=0; i<pointArr.length; i++) {
			for(int j=0; j<pointArr[i].length; j++)
			{
				String str = (j<pointArr[i].length-1)?",":"\n";
				System.out.print(pointArr[i][j]+str);
			}
		}
		
		/*
		  	10 20 30 
		 	70 80 90
		 	100 110 120
		*/
		
		System.out.println("----------2행 제외----------");
		for(int i=0; i<pointArr.length; i++) {
			if(i==1) continue;
			for(int j=0; j<pointArr[i].length; j++)
			{
				String str = (j<pointArr[i].length-1)?",":"\n";
				System.out.print(pointArr[i][j]+str);
			}
		}
		
		System.out.println("\n##########################################\n");
		
		int[][] jumsuArr = new int[4][]; //4행 null열
	
	    /*
		    jumsuArr[0][0] = 10; // 열의 대한 배열의 크기를 설정하지 않았으므로 java.long.NullPointerException 이 발생한다.
			jumsuArr[0][1] = 20;
			jumsuArr[0][2] = 30;
			
			jumsuArr[1][0] = 40;
			jumsuArr[1][1] = 50;
			jumsuArr[1][2] = 60;
			
			jumsuArr[2][0] = 70;
			jumsuArr[2][1] = 80;
			jumsuArr[2][2] = 90;
			
			jumsuArr[3][0] = 100;
			jumsuArr[3][1] = 110;
			jumsuArr[3][2] = 120;
		*/
		
		jumsuArr[0] = new int[3];
		jumsuArr[1] = new int[2];
		jumsuArr[2] = new int[3];
		jumsuArr[3] = new int[3];
		
		
	    jumsuArr[0][0] = 10; // 열의 대한 배열의 크기를 설정하지 않았으므로 java.long.NullPointerException 이 발생한다.
		jumsuArr[0][1] = 20;
		jumsuArr[0][2] = 30;
		
		jumsuArr[1][0] = 40;
		jumsuArr[1][1] = 50;
	//	jumsuArr[1][2] = 60; // java.lang.ArrayIndexOutOfBoundsException 배열크기 초과
		
		jumsuArr[2][0] = 70;
		jumsuArr[2][1] = 80;
		jumsuArr[2][2] = 90;
		
		jumsuArr[3][0] = 100;
		jumsuArr[3][1] = 110;
		jumsuArr[3][2] = 120;
			
			
			
		System.out.println("jumsuArr.lenght => " +jumsuArr.length);
		//jumsuArr.lenght => 4
		
		System.out.println("jumsuArr[0].lenght => " +jumsuArr[0].length);
		//jumsuArr[0].lenght => 3
			
		System.out.println("jumsuArr[1].lenght => " +jumsuArr[1].length);
		//jumsuArr[1].lenght => 2
		
		
		
		
		
		System.out.println("\n##########################################\n");
		
		int[][] valArr = {{10,20,30},{40,50},{70,80,90},{100,110,120}}; 
		//4행
		//0행 3열  1행 2열  2행 3열
		
		System.out.println("valArr.lenght => " +valArr.length);
		//valArr.lenght => 4
		
		System.out.println("valArr[0].lenght => " +valArr[0].length);
		//valArr[0].lenght => 3
			
		System.out.println("valArr[1].lenght => " +valArr[1].length);
		//valArr[1].lenght => 2
	


		
	}//end of main---------------------------

}

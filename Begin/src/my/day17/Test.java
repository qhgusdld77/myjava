package my.day17;

import java.io.IOException;

public class Test {
	
	public static void main(String[] args) {
		
		try {
			int no = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String str1 = "25";
		String str2 = "똘똘이";
		
		int a1 = Integer.parseInt(str1);
		int a2 = Integer.parseInt(str2);
		
		int[] arr = {10,20,30};
		int sum = 0;
		for(int i=0; i<arr.length+1; i++) {
			int su = arr[i];
			sum += su;
		}
		
		//Checked Exception 실행하지 않아도 오류가 보인다.
		/*
		 	IOException
		*/
		
		
		
		//RutimeExceptoin  실행해보아야 오류가 보인다.
		/*  
		  	-->NumberFormatException
			-->ArrayIndexOutOfBoundsException
			-->ArithmeticException
		*/
	}
}

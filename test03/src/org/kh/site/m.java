package org.kh.site;
//연습문제
public class m {

	public static void main(String[] args) {
	/*	int num = 10;
		int num2 = 20;
		boolean result;
		result = ((num >  10) && (num2 > 10));
		System.out.println(result);
		result = ((num >  10) || (num2 > 10));
		System.out.println(result);
		System.out.println(!result);*/
		
		/*int num1 = 2;		//0010
		int num2 = 10;			//1010
		
		System.out.println(num1 & num2);		//0010
		System.out.println(num1 | num2);		//1010
		System.out.println(num1 ^ num2);		//1000
		System.out.println(~num1);*/				//111......111
		
		/*int num = 8;
		
		System.out.println(num += 10);
		System.out.println(num -= 10);
		System.out.println(num >>= 2);*/
		
		int num = 10;
		int num2 = 20;
		
		int result = (num >= 10) ? num2 + 10 : num2 - 10;
		System.out.println(result);
	}

}

package org.kh.site3;

import java.util.Scanner;

public class Loop4 {
	public static void main(String[] args) {
		/*
		 *for와 마찬가지로 조건이 만족하는 동안만 반복수행,
		 그러나 while의 괄호에 조건만 기입하고 해당 블록 안에 증감식이 기재됨.
		 
		 *초기식 ;
		 while(조건식)	{
		  		반복할 문장;
		  		증감식		*증감식은 반복할 문장 앞이나 뒤에 붙음
		  }
		 */
		int i = 0, tot = 0;
		while(i<5);	{
			i++;
			tot+=i;
		}
		System.out.println("결과 :"+tot);
		
//		해당 숫자를 입력하면 구구단 중 해당 숫자의 단을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력[2~9] :");
		int s = sc.nextInt();	
		int j = 0;				//초기식
		while(j<9);	{			//조건식
		j++;					//증감식
		System.out.println(s+ " * "+j+"="+(s*j));
	}

	}
}
	

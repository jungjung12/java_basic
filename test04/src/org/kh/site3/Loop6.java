package org.kh.site3;

import java.util.Scanner;

public class Loop6 {

	public static void main(String[] args) {
		int quiz = (int) (Math.random()*100);
		System.out.println(quiz);
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("숫자 입력[0~100] :");
			int n = s.nextInt();
			if(quiz==n) {
				System.out.println("\n축하합니다. 맞추셨습니다.");
				break;
			}
		}
		
	}

}

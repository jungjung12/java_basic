package org.kh.site2;

import java.util.Scanner;

//조건문 if~elseif (~else~)
public class Condition3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력[0~100 ] :" );
		int point = scan.nextInt();
		char result;
		//학점(result)은 점수(point)가 100~90이면 'A', 80~89이면 'B', 70~79이면 'C', 60~69이면 'D', 60 미만이면 'F'
		System.out.printf("%n당신의 점수는 %d점 입니다.", point);
		if(point>=90) {
			result = 'A';
		}if else(point>=80)
			result = 'B';
	}if else(point>=70)
		result = 'C';
}if else(point>=60)
result = 'D';
		}else {
			result = 'F';
	}

}

package org.kh.site2;

import java.util.Scanner;

public class Condition4 {

	public static void main(String[] args) {
		//조건문 다단계 if
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력[0~100 ] :" );
		int point = scan.nextInt();
		char result;
		/*학점(result)은 점수(point)가
		 *  100~97이면 'A++', 93~96이면 'A0', 
		 *  'B', 70~79이면 'C', 60~69이면 'D', 60 미만이면 'F'*/
		System.out.printf("%n당신의 점수는 %d이며 학점은 %s입니다.", point);
		if(point>=97) {
/*	result = 'A+';
		}	if else(point>=93) {
			result = 'A0';
		}	if else(point>=92) {
			result = 'A-';	*/
		} 
	}
					}
		}
	}

}

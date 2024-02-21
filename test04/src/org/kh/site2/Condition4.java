package org.kh.site2;
//보충해야 함
import java.util.Scanner;

public class Condition4 {

	public static void main(String[] args) {
		//조건문 다단계 if
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력[0~100 ] :" );
		int point = scan.nextInt();
		String result;
		/* 학점(result)은 점수(point)가
		 97~100이면 'A+', 93~96이면 'A0', 90~92이면 'A-',
		  87~89이면 'B+', 83~86이면 'B0', 80~82이면 'B-',
		  77~79이면 'C+', 73~76이면 'C0', 70~72이면 'C-',
		  67~69이면 'D+', 63~66이면 'D0', 60~62이면 'D-',
		  60 미만이면 'F'
		*/
		
		if((point%10>=7 && point%10<=9 && point>=60) || point==100) {
			result = "+";
			if(point>=90) {
				result = "A" + result;
			} else if(point>=80) {
				result = "B" + result;
			} else if (point>=70) {
				result = "C" + result;
			} else {
				result = "D" + result;
			}	
		} else if(point%10>=3 && point%10<=6 && point>=60) {
			result = "0";
			if(point>=90) {
				result = "A" + result;
			} else if(point>=80) {
				result = "B" + result;
			} else if (point>=70) {
				result = "C" + result;
			} else {
				result = "D" + result;
			}
		} else if(point%10>=0 && point%10<=2 && point>=60) {
			result = "-";
			if(point>=90) {
				result = "A" + result;
			} else if(point>=80) {
				result = "B" + result;
			} else if (point>=70) {
				result = "C" + result;
			} else {
				result = "D" + result;
			}
		} else {
			result = "F";
		}
		
		System.out.printf("%n당신의 점수는 %d이며 학점은 %s입니다.", point);
		
	}

}

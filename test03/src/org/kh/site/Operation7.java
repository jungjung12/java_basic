package org.kh.site;
//논리 연산(Logical Operation) : &&(and), ||(or), !(not)
//이진수로 따졌을  때 true = 1, false = 0
public class Operation7 {
	public static void main(String[] args) {
		int a = 26;
		int b = 25;
		int c = 27;
		//and(논리곱) 논리 : 모든 입력이 true일 경우에만 출력이 true가 된다
		System.out.println("a > b && a > c : "+(a > b && a> c));		//false(0) && false(0)	=> 0
		System.out.println("a > b && b > c : "+(a > b && b> c));		
		System.out.println("a < b && b < c : "+(a < b && b < c));
		System.out.println("a < b && b > c : "+(a < b && b > c));
		//or(논리합) 논리 : 입력이 어느 하나라도 true이면 출력이 true가 된다
		System.out.println("a > b || a > c : "+(a > b || a> c));		//true + false => 1
		System.out.println("a > b || b > c : "+(a > b || b> c));		
		System.out.println("a < b || b < c : "+(a < b || b < c));
		System.out.println("a < b || b > c : "+(a < b || b > c));
		//not(논리부정) 논리 : 입력이 true이면, 출력은 false, 입력이 false이면 출력은 true
		System.out.println("!(a > b) : "+!(a > b));
	}

}

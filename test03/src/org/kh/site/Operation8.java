package org.kh.site;
//대입 연산자 : 연산 후에 대입하는 연산자 	+=, -=, *=, /=, %=, &=, |=, >>=, <<=, >>>=(*왼쪽 시프트는 없음), ^=
//비트 연산자 : &(and), |(or), ~(complement), ^(xor), >>(right shift), <<(left shift)
public class Operation8 {
	public static void main(String[] args) {
		int a = 20;
		int b = 15;
		int tmp;		//임시 기억장소(tmp)
		a += b;			//a=35, b=15
		b -= a;			//a= 35, b=-20
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		//a와 b의 값을 맞교환
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("      교환 후");
		System.out.println("a ="+a);
		System.out.println("b ="+b);
		int x = 0b01101;
		int y = 0b01011;
		//비트 연산	(2진수 연산)
		System.out.println("x ="+Integer.toBinaryString(x));
		System.out.println("y ="+Integer.toBinaryString(y));
		System.out.println("x & y ="+Integer.toBinaryString(x & y));	//and
		System.out.println("x | y ="+Integer.toBinaryString(x | y));	//or
		System.out.println("x ^ y ="+Integer.toBinaryString(x ^ y));	//xor		*입력이 다를 경우 값이 '1'로 출력됨
		System.out.println("~x ="+Integer.toBinaryString(~x));	
		System.out.println("x >> y ="+Integer.toBinaryString(x >> y));		//나누기 원리
		System.out.println("x << y ="+Integer.toBinaryString(x << y));		//곱하기 원리
		System.out.println("    대입 연산자 " );
		
		int i= 25;	//1 1 0 0 1
		int j= 30;	//1 1 1 1 0
		i &= j;
		System.out.println("i & j : "+i);	//1 1 0 0 0 > 24
		i= 25;
		i |= j;
		System.out.println("i |= j :"+i);		//1 1 1 1 1 > 31
		i= 25;
		i ^= j;
		System.out.println("i ^= j :"+i);		//0 0 1 1 1 > 7
		j >>= 2;		//1 1 1 1 0
		System.out.println("j >>=  2 :"+j);
		j = 30;
		j <<= 2;
		System.out.println("j <<= 2 :"+j);
		j = 30;
		j >>>= 2;
		System.out.println("j >>>= 2 :"+j);
	}

}

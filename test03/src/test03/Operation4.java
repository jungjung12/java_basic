package test03;
//대입 연산 : +=, -=, *=, /=, %=
public class Operation4 {
	public static void main(String[] args) {
		int a = 0;
//		a += 2;		// a = a+2 *a의 값은 2가 됨		**int a+2 = 2 / a = 2
//		a -= 3		// a = a-3	*a의 값은 -1이 됨	
			a += 8;
			System.out.println("1. a="+a);
			a -= 3;
			System.out.println("1. a="+a);
			a *= 5;
			System.out.println("1. a="+a);
			a /= 4;
			System.out.println("1. a="+a);
			a %= 2;
			System.out.println("1. a="+a);
	}

}

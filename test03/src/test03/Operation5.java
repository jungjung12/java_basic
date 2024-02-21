package test03;
//증강 연산 : ++, --  >>  전위 연산, 후위 연산이 각각 있음
public class Operation5 {
	public static void main(String[] args) {
			int a = 10;
			int b = 10;
			//a++ = a = a + 1		**항의 값에 1을 더함
			System.out.println("전위증가 연산 :"+(++a));	//a에 먼저 1씩 증가시킨 뒤 출력
			System.out.println("후위증가 연산 :"+(b++));	//b의 값을 먼저 출력하고 1씩 증가
			System.out.println("전위감소 연산 :"+(--a));
			System.out.println("후위감소 연산 :"+(b--));
			
	}

}

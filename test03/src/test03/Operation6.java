package test03;
//관계(비교) 연산 : ==(같다), !(같지 않다)=, >(초과), >=(이상), <(미만), <=(이하) : true / fals
public class Operation6 {
	public static void main(String[] args) {
		int a = 25;
		int b = 28;
		int c = 27;
		System.out.println("a와 b가 같습니까? :"+(a==b));
		System.out.println("a와 b가 다릅니까? :"+(a!=b));
		System.out.println("a가 b보다 큽니까? :"+(a>b));
		System.out.println("b가 c보다 크거나 같습니까? :"+(b>=c));
		System.out.println("a가 b보다 작습니까? :"+(a<b));
		System.out.println("b가 c보다 작거나 같습니까? :"+(b<=c));
	}

}

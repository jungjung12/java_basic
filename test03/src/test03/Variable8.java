package test03;

public class Variable8 {

	public static void main(String[] args) {
//		var) 가변할당(동적할당) : 자료형과 무관하게 리터럴(값)에 의해 자료형이 자유롭게 변형되는 할당 방법		*웹상에서 호환할 일이 있을 때 사용
		var num1 = 23.456;
		var num2 = 34;
		var num3 = 'l';
		var num4 = "이정희";
		var num5 = true;
		num1 = 67;
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		System.out.println("num4 : "+num4);
		System.out.println("num5 : "+num5);
	}

}

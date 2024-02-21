package test03;

public class Constant1 {

	public static void main(String[] args) {
		//상수(Constant)와 리터럴(Literal)
		final int MAX_POINT = 100;
		final int MIN_POINT = 0;	
		final double PI = 3.141592;
		final String MY_NAME = "이정희";
//		MY_NAME = "리정희"		*final이 붙었기 때문에 오류가 남.
		//위와 같이 final 지시자가 선언되고, 재문자로 표기된 것을 상수라고 하며
		//항상 값이 같아 더 이상 변할 수 없는 값을 뜻함
		//변수나 상수에 대입되는 값을 리터럴(Literal)이라고 함
		//2진수, 10진수, 정수, 실수, 문자, 문자열 => 리터럴
		System.out.println("최소 정수 :"+MIN_POINT);
		System.out.println("최고 정수 :"+MAX_POINT);
		System.out.println("나의 이름 :"+MY_NAME);
		System.out.println("반지름이 10인 원의 둘레 길이 :"+(10*2*PI));
		
	}

}

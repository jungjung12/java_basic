package test03;

public class Variable4 {

	public static void main(String[] args) {
		String name = "\'이정희\'";
		short age = 27;
		float height = 150f;
		double weigth = 52;
		char init = 'l';
		
		System.out.printf("%n이름 : %s", name);
		System.out.printf("%n나이 : %d", age);
		System.out.printf("%n키 : %f", height);
		System.out.printf("%n체중 : %f", weigth);
		System.out.println("이니셜 : "+init);
		/*	이스케이프 문자
		 	\n : 줄 바꿈
		 	\t : 탭
		 	\\ : \를 출력  *명령어가 잘못 입력되는 것을 방지
		 	\" : 큰 따옴표 출력
		 	\' : 작은 따옴표 출력 
		 */
	}

}

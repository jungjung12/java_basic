package org.kh.site3;
//반복문 : for, while, do~while~
public class Loop1 {
	public static void main(String[] args) {
		int n = 0;
		/*
		n = n+1;
		n = n+1;
		n = n+1;
		n = n+1;
		n = n+1;
		n = n+1;
		n = n+1;
		n = n+1;
		n = n+1;
		n = n+1;
		*/
		/*
		 * 조건식이 참일 때 동안만 반복수행한다.
		 for(초기식(a);조건식(b);증강식(c)) {반복해야할 문장(d); }		*a > b > d > c > b > d > ...
		 */
		for(int i=0;i<10;i++) {
			n= n+1;
		}
		System.out.println("n ="+n);
		int[] nums= {80, 95, 75, 60, 100, 65, 70, 90, 85, 95};		/*배열(참조형): 비슷한 데이터를 한 곳에 묶는 것(한 개의 장소에
																	여러개의 데이터를 저장)
		 															대괄호 사용[index(;대괄호 속 번호. 0~9까지)]
		 															데이터 자체가 들어있는 것이 아닌 데이터가 저장된 주소를
		 															보관하여 그것을 참조로 데이터를 사용
		 															*/
		String[] names = {"김", "이", "박", "최", "황", "노", "강", "남궁", "오", "서"};		//[]: 데이터 주소
		int tot = 0;
		char result;
		for(int i=0;i<10;i++) {
			tot += nums[i];
			int max =0, min =nums[i];
			System.out.print("이름 :"+names[i]+","+"\t");		//[]: 데이터 주소를 기반으로 데이터 사용, 대괄호 안에 어떤 데이터인지 표기해야 함
			System.out.print("점수 :"+nums[i]+"\t");
			System.out.print("학점 :"+"\t");
//		x	System.out.print("학점 :"+result);
			if(nums[i] >=90)	{
				System.out.println("A\t\n");
			}else if(nums[i] >=80)	{
				System.out.println("B\t\n");
			}else if(nums[i] >=70)	{
				System.out.println("C\t\n");
			}else if(nums[i] >=60)	{
				System.out.println("D\t\n");
			} else	{
				System.out.println("F\t\n");}
		}	
			/*if(nums[i]>=90) {
				result = 'A';
			} else if(nums[i]>=80) {
				result = 'B';
			} else if (nums[i]>=70) {
				result = 'C';
			} else if(nums[i]>=60) {
				result = 'D';
			} else {
				result = 'F';
			}		x	*/
		System.out.println("전체 총점 :"+tot);
		System.out.println("전체 평균 :"+(tot/10.0f));
		System.out.println("최고 점수 :");
		System.out.println("최저 점수 :");
		
	}
	
}
		
			
		
		




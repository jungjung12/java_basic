package org.kh.object1;

public class Student {

		String name;	//String 기본값 = null
		int kor;		//int 기본값 = 0.0
		int eng;
		int mat;
		public int tot()	{
			return this.kor+this.eng+this.mat;
		}
		double avg()	{
			return (this.kor+this.eng+this.mat)/3;
		}
		void resulting(){
				System.out.println(this.name+", 총점 : "+this.tot()+", 평균 :"+this.avg());	
	}

}

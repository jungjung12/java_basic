package org.kh.site3;

public class Loop2 {
	public static void main(String[] args) {
			int[] ns = {80, 95, 75, 60, 100, 65, 70, 90, 85, 95};
			int max= 0, min=ns[0];
			for (int i=0;i<10;i++)	{
				if(ns[i]>max)	max = ns[i];
				if(ns[i]<min)	min = ns[i];
			}
			
		System.out.println("최고 점수 :"+max);
		System.out.println("최저 점수 :"+min);
	}

}

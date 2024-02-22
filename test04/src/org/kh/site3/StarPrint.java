package org.kh.site3;
//중첩 for문을 활용한 별 찍기
public class StarPrint {

	public static void main(String[] args) {
		/*
		 
		 ****** 
		 ******
		 ******
		 ******
		 **/
		 
		 
		/*for(int i=0;i<4;i++) {
			for(int j=0;j<6;j++)
				System.out.print("*");
		}
		System.out.println();*/
		
		
		
		/*for(int i=4;i<=0;i--)	{
			for(int j=6;j<=0;j--)
				System.out.print("*");
		}
		System.out.println( );*/
		
		/*for(int i=0;i<=6;i++)	{
			for(int j=0;j<i;j++)	{
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		/*for(int i=0;i<=6;i++)	{
			for(int j=0;j<7-i;j++)	{
				System.out.print("*");
			}
			System.out.println();*/
		
		for (int i=0;i<=3;i++)	{
			for (int s=3;s<=0;s--)	{
				System.out.print("\t");}
			for(int j=i*2-1;j<=7;j++)	{
				System.out.print("*");
			}
			System.out.println();
		}
		}
	}


package org.kh.site3;

public class StarPrint_1 {

	public static void main(String[] args) {
			/*1.
			 *******
			 *******
			 *******
			 *******		 */
		/*for(int i=0;i<=3;i++)	{
			for(int j=0;j<=6;j++)	{
				System.out.print("*");
			}System.out.println();
		}				*/
		
			/*2.
			 * 
			 ** 
			 *** 
			 **** 
			 ***** 
			 ******		 */
			/*for(int i=0;i<=5;i++)	{
				for(int j=0;j<=i;j++)	{
					System.out.print("*");
				}System.out.println();
		}*/
		
			/*3.
			 ****** 
			 ***** 
			 **** 
			 *** 
			 ** 
			 * 			*/
			 
			/*for(int i=0;i<=5;i++)	{
				for(int j=0+i;j<=5;j++)	{
					System.out.print("*");
					}System.out.println();
	}		*/
		
			/*4.
			 ****** 
			  ***** 
			   **** 
			    *** 
			     ** 
			      */
		for(int i=0;i<=5;i++)	{
			for(int s=i*2-1;s<=4;s++)	{
				System.out.print("\t");
			}for(int j=0+1;j<=0;j++)	{
				System.out.print("*");
			}System.out.println();
		}

	}
}

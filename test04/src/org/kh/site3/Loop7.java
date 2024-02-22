package org.kh.site3;

import java.util.Random;

public class Loop7 {

	public static void main(String[] args) {
		int min=1, max=45;
		Random h= new Random();
		for(int i=0;i<6;i++) {
		int var = h.nextInt(max+min)+min;
		System.out.print(var+"\t");
		}
	}

}

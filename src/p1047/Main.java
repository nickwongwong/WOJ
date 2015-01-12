package p1047;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1047 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();

		char[] a;
		char[] b;

		while (cases-- > 0) {
			a = input.next().toCharArray();
			b = input.next().toCharArray();
			int[] count = new int[b.length];
			int maxVal = 0;
			int preCount = 0;
			int tmp = 0;
			for (int i = 0; i < a.length; i++) {
				preCount = 0;
				for (int j = 0; j < b.length; j++) {
					tmp = count[j];
					if (a[i] == b[j]) {
						count[j] = preCount + 1;
						maxVal = maxVal > count[j] ? maxVal : count[j];
					} else
						count[j] = 0;
					preCount = tmp;
				}
			}
			System.out.println(maxVal);

		}
		input.close();
	}
}

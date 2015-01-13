package p1202;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1202 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		int no = input.nextInt();
		int[] a = new int[2 * no + 1];
		int i = 0;
		while (input.hasNext()) {
			a[i++] = input.nextInt();

		}
		int tmp = a[0];
		for (i = 1; i < 2 * no + 1; i++) {
			tmp ^= a[i];
		}
		System.out.print(tmp);
		input.close();
	}
}

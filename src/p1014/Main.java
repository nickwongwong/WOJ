package p1014;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1014 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int[][] a = new int[3][3];

		while (input.hasNext()) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					a[i][j] = input.nextInt();
				}
			}
			double r = a[0][0] * a[1][1] * a[2][2] + a[0][1] * a[1][2]
					* a[2][0] + a[0][2] * a[1][0] * a[2][1] - a[0][0] * a[1][2]
					* a[2][1] - a[0][1] * a[1][0] * a[2][2] - a[0][2] * a[1][1]
					* a[2][0];

			System.out.printf("%.2f", Math.abs(r));
			System.out.println();
		}
		input.close();
	}
}

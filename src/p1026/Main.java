package p1026;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1026 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();

		int i = 1;
		int[][] sum;
		int[][] dollars;
		while (i <= cases) {
			int no = input.nextInt();
			sum = new int[no + 2][no + 2];
			dollars = new int[no + 2][no + 2];
			int maxVal = 0;
			for (int k = 1; k <= no; k++)
				for (int j = 1; j <= no; j++) {
					dollars[k][j] = input.nextInt();
				}

			for (int k = 1; k <= no; k++)
				for (int j = 1; j <= no; j++) {
					sum[k][j] = Math.max(
							Math.max(sum[k - 1][j - 1], sum[k - 1][j]),
							sum[k - 1][j + 1]) + dollars[k][j];
					if (sum[k][j] > maxVal)
						maxVal = sum[k][j];
				}

			System.out.println("Case " + i + ":");
			System.out.println(maxVal);

			i++;
			if (i <= cases)
				System.out.println();
		}
		input.close();
	}
}

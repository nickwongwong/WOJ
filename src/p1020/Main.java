package p1020;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1020 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();

		int[] seq;
		int i = 1;
		int tmp1 = 0;
		int tmp2 = 0;
		while (i <= cases) {
			int no = input.nextInt();
			seq = new int[no];

			for (int j = 0; j < no; j++) {
				tmp1 = input.nextInt();
				seq[j] = tmp1 - tmp2;
				tmp2 = tmp1;
			}
			tmp2 = 0;
			tmp1 = 0;
			Arrays.sort(seq);

			System.out.println("Case " + i + ":");
			for (int j = 0; j < no; j++) {
				if (j < no - 1)
					System.out.print(seq[j] + " ");
				else
					System.out.println(seq[j]);
			}
			i++;
			if (i <= cases)
				System.out.println();
		}
		input.close();
	}
}

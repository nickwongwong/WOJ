package p1064;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1064 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int no;

		int[] seq;

		while (input.hasNext()) {
			no = input.nextInt();
			seq = new int[no];
			for (int i = 0; i < no; i++) {
				seq[i] = input.nextInt();

			}

			Arrays.sort(seq);
			System.out.print(seq[0]);
			for (int j = 1; j < no; j++) {
				if (seq[j] != seq[j - 1]) {

					System.out.print(" " + seq[j]);

				}
			}
			if (input.hasNext())
				System.out.println();

		}
		input.close();
	}
}

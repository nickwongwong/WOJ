package p1040;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1040 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();

		int[] seq;

		while (cases-- > 0) {
			int no = input.nextInt();
			seq = new int[no];

			for (int j = 0; j < no; j++) {
				seq[j] = input.nextInt();
			}

			Arrays.sort(seq);

			int l = 1, tmp = seq[0], max = 1;
			for (int i = 1; i < no; i++) {
				if (seq[i] == tmp) {
					l++;
				} else {
					tmp = seq[i];
					l = 1;
				}
				if (l > max)
					max = l;
			}
			System.out.println(max);

		}
		input.close();
	}
}

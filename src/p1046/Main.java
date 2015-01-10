package p1046;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1046 in WOJ
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
			int ans = 0;
			for (int j = 0; j < no; j++) {
				seq[j] = input.nextInt();

			}

			for (int i = 0; i < no; i++)
				for (int j = i + 1; j < no; j++)
					if (seq[i] > seq[j])
						ans++;

			System.out.println(ans);

		}
		input.close();
	}
}

package p1137;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1137 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			int m = input.nextInt();
			int min = input.nextInt();
			int tmp = 0;
			for (int i = 1; i < n; i++) {
				tmp = input.nextInt();
				if (tmp < min)
					min = tmp;
			}

			System.out.println(m / min);

		}
		input.close();
	}
}

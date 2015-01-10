package p1088;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1088 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {

	static double P(int a, int n) {
		double y = 1;
		double f = a;
		int k = n;
		while (k != 0) {
			if (k % 2 == 1)
				y *= f;
			k >>= 1;
			f *= f;
		}
		return y;
	}

	static double DP(int n, int m) {
		/*
		 * double r=0.00; for(int i=1;i<=n;i++){ r+=P(i,m); } return r;
		 */
		if (n == 1)
			return 1;

		return DP(n - 1, m) + P(n, m);
	}

	static double calc(int n, int k) {
		double d = 0.00;
		d = Math.pow(n + 0.5, k + 1) / (k + 1);
		return d;
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n, m;
		while (input.hasNext()) {

			n = input.nextInt();
			m = input.nextInt();
			if (n > 1000)
				System.out.println(new DecimalFormat("0.00E0")
						.format(calc(n, m)));

			else
				System.out
						.println(new DecimalFormat("0.00E0").format(DP(n, m)));
		}

		input.close();
	}
}

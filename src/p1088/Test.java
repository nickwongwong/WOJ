package p1088;

import java.text.DecimalFormat;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1088 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Test {

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
		double r = 0.00;
		for (int i = 1; i <= n; i++) {
			r += P(i, m);
		}
		return r;

	}

	static double calc(int n, int k) {
		double d = 0.00;
		d = Math.pow(n + 0.5, k + 1) / (k + 1);
		return d;
	}

	public static void main(String args[]) {

		int n, m;
		for (int i = 0; i < 10000; i++) {
			long tic = System.currentTimeMillis();
			n = (int) (1 + (Math.random()) * 10000000);
			m = (int) (1 + (Math.random()) * 20);

			if (n > 1000) {
				System.out.print("n:" + n + " m:" + m + " sum:"
						+ new DecimalFormat("0.00E0").format(calc(n, m)));

			} else
				System.out.print(new DecimalFormat("0.00E0").format(DP(n, m)));
			long toc = System.currentTimeMillis();
			System.out.print(" real sum:"
					+ new DecimalFormat("0.00E0").format(DP(n, m)));
			System.out.println(" time:" + (toc - tic));
		}

	}
}

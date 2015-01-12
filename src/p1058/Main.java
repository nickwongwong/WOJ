package p1058;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1058 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	static int f(int n, int m) {
		if (n == 1 || m == 1)
			return 1;

		if (n < m)
			return f(n, n);
		else if (n == m)
			return 1 + f(n, m - 1);
		else
			return f(n - m, m) + f(n, m - 1);
	}

	static long calc(int n) {
		long groupNo;
		long groupFirstNo;
		long result = 0;
		if (n % 6 == 0) {
			groupNo = n / 6;
			groupFirstNo = (3 * groupNo - 2) * groupNo;
			result = groupFirstNo + 5 * groupNo + 1;

		} else {
			groupNo = n / 6 + 1;
			groupFirstNo = (3 * groupNo - 2) * groupNo;
			result = groupFirstNo + (n % 6 - 1) * groupNo;
		}

		return result;
	}

	public static void main(String args[]) {

		for (int n = 10000; n < 10100; n++) {
			System.out.println(f(n, 3));
			System.out.println(calc(n));
		}

	}
}
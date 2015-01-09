package p1011;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1011 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	static long A(int n) {
		long r = 1;
		for (int i = 1; i <= n; i++) {
			r *= i;
		}
		return r;
	}

	static long C(int n, int k) {

		return A(n) / (A(k) * A(n - k));
	}

	static long f(int n) {
		if (n == 0)
			return 0;

		if (n == 1 || n == 2 || n == 3)
			return 1;

		long tp = 0;
		if (n % 3 != 1)
			tp = f(n - 1);
		else
			tp = 0;

		for (int i = 1; i <= n / 3; i++)
			tp = tp + f(i * 3 - 1) * f(n - i * 3) * C(n - 1, i * 3 - 1);

		return tp;

	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			System.out.println(f(input.nextInt()));
		}

		input.close();
	}

}

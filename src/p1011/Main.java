package p1011;

import java.math.BigInteger;
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
	static BigInteger A(int n) {
		BigInteger r = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			r = r.multiply(new BigInteger(i + ""));
		}
		return r;
	}

	static BigInteger C(int n, int k) {

		return A(n).divide(A(k).multiply(A(n - k)));
	}

	static BigInteger f(int n) {
		if (n == 0)
			return BigInteger.ZERO;

		if (n == 1 || n == 2 || n == 3)
			return BigInteger.ONE;

		BigInteger tp;
		if (n % 3 != 1)
			tp = f(n - 1);
		else
			tp = BigInteger.ZERO;

		for (int i = 1; i <= n / 3; i++) {
			tp = tp.add(f(i * 3 - 1).multiply(f(n - i * 3)).multiply(
					C(n - 1, i * 3 - 1)));

		}
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

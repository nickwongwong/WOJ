package p1036;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1036 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	static BigInteger calc(int n) {

		BigInteger[] r = new BigInteger[n + 2];
		r[0] = BigInteger.ONE;
		r[1] = new BigInteger(2 + "");
		r[2] = new BigInteger(4 + "");
		for (int i = 3; i < n; i++) {
			r[i] = r[i - 1].add(r[i - 2]).add(r[i - 3]);
		}
		return r[n - 1];
	}

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();
			if (n != 0) {

				System.out.println(calc(n));

			} else
				break;

		}
		input.close();
	}
}
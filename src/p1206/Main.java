package p1206;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1206 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	static long gcd(long a, long b) {
		long c;

		while (b != 0) {
			c = b;
			b = a % b;
			a = c;
		}
		return a;
	}

	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int a = input.nextInt();
			int b = input.nextInt();
			int n = input.nextInt();
			if (a == 0 && b == 0 && n == 0) {
				System.out.println("Possible!");
				continue;
			}
			if (a == 0 && b == 0 && n != 0) {
				System.out.println("Impossible!");
				continue;
			}

			long c = gcd(a, b);
			if (n % c == 0)
				System.out.println("Possible!");
			else
				System.out.println("Impossible!");
		}

		input.close();
	}
}

package p1058;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1058 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
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
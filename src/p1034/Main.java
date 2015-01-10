package p1034;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1034 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			int n = input.nextInt();

			System.out.print((long) (Math.pow(n, 3) + 5 * n + 6) / 6);
			if (input.hasNext())
				System.out.println();
		}
		input.close();
	}
}

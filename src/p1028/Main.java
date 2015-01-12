package p1028;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1028 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();

		int i = 1;

		while (i <= cases) {

			input.nextInt();

			int x1 = input.nextInt();
			int y1 = input.nextInt();
			int x2 = input.nextInt();
			int y2 = input.nextInt();

			System.out.println("Case " + i + ":");

			if ((x1 + x2) % 2 != (y1 + y2) % 2)
				System.out.println(-1);
			else {
				System.out.println(Math.max(Math.abs(x2 - x1),
						Math.abs(y2 - y1)));
			}
			i++;
			if (i <= cases)
				System.out.println();
		}
		input.close();
	}
}

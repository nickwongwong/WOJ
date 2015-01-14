package p1115;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1115 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);

		while (input.hasNext()) {
			String[] str = input.next().split("[RC]");
			int n = Integer.parseInt(str[1]);

			if (n == 0)
				break;
			int m = Integer.parseInt(str[2]);
			String s = "" + n;
			while (m > 0) {
				int tmp = m % 26;
				if (tmp == 0)
					tmp = 26;
				s = (char) (tmp + 64) + s;
				m = (m - tmp) / 26;
			}
			System.out.println(s);

		}
		input.close();
	}
}

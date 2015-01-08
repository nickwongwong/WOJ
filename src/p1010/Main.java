package p1010;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1010 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int no;
		int tmp;
		int result = 0;
		while (input.hasNext() && (no = input.nextInt()) != 0) {

			result = input.nextInt();

			for (int i = 1; i < no; i++) {
				tmp = input.nextInt();
				if (tmp > result)
					result = tmp;
			}

			result %= 2006;
			if (result < 0)
				result += 2006;
			for (int i = 1; i < no; i++) {
				result *= 2;
				result %= 2006;
			}
			System.out.println(result);
		}

		input.close();
	}
}

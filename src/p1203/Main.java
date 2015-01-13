package p1203;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1203 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);

		int num = 0;
		int loop = 0;
		int tmp = 0;
		int n = input.nextInt();
		while (n-- > 0) {
			tmp = input.nextInt();
			if (loop == 0) {
				loop++;
				num = tmp;
			} else {
				if (tmp == num)
					loop++;
				else
					loop--;
			}

		}
		System.out.println(num);
		input.close();
	}
}

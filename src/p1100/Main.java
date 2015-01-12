package p1100;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1100 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		String[] name = { "littleken", "knuthocean", "dongfangxu", "zap",
				"kittig", "robertcui", "forest", "flirly" };

		while (cases-- > 0) {
			char[] c = input.next().toCharArray();
			int maxVal = 0;
			int maxIndex = 0;
			int j = 0;
			int[] no = new int[name.length];
			while (j < c.length) {
				switch (c[j]) {
				case 'l':
					no[0]++;
					j += 9;
					break;
				case 'k':
					if (c[j + 1] == 'n') {
						no[1]++;
						j += 10;
					} else {
						no[4]++;
						j += 6;
					}
					break;
				case 'd':
					no[2]++;
					j += 10;
					break;
				case 'z':
					no[3]++;
					j += 3;
					break;
				case 'r':
					no[5]++;
					j += 9;
					break;
				case 'f':
					if (c[j + 1] == 'o') {
						no[6]++;
						j += 6;
					} else {
						no[7]++;
						j += 6;
					}
					break;

				}

			}

			for (int i = 0; i < name.length; i++) {
				if (no[i] > maxVal) {
					maxVal = no[i];
					maxIndex = i;
				}
			}

			System.out.println(name[maxIndex]);

		}
		input.close();
	}
}

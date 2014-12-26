package p1003;

import java.util.Scanner;

/* Copyright(C) 2014,Cao Qingqing , Wuhan University
 * All rights reserved.
 *	
 * This class is submitted for solving the problem 1002 
 * in WOJ
 * 
 * Author: Qingqing Cao, Computer School, Wuhan University
 * Time: 2014-12-26
 * Email: im@caoqq.net
 */
public class Main {
	private final String[] name = { "Adam", "Seth", "Enosh", "Kenan",
			"Mahalalel", "Jared", "Enoch", "Methuselah", "Lamech", "Noah",
			"Shem", "Ham", "Japheth" };
	private final int[] age = { 930, 912, 905, 910, 895, 962, 365, 969, 777, 0,
			0, 0, 0 };

	private int findSeniority(String str) {

		for (int i = 0; i < name.length; i++) {
			if (str.equals(name[i]))
				if (i > 9)
					return 10;
				else
					return i;
		}
		return -1;
	}

	private int isAncestor(String str1, String str2) {
		if (findSeniority(str1) != -1 && findSeniority(str2) != -1)
			return findSeniority(str1) < findSeniority(str2) ? 1 : 2;
		else
			return 0;
	}

	private int cmpAge(String str1, String str2) {
		int snr1 = 0, snr2 = 0;
		snr1 = findSeniority(str1);
		snr2 = findSeniority(str2);
		// 0 表示无法比较年龄大小，1表示str1比str2年龄大
		if (age[snr1] != 0 && age[snr2] != 0)
			return age[snr1] > age[snr2] ? 1 : 2;
		else
			return 0;

	}

	private void printResult() {
		Scanner input = new Scanner(System.in);
		String name1 = null, name2 = null;

		do {
			name1 = input.next();
			name2 = input.next();

			switch (isAncestor(name1, name2)) {
			case 0:
				System.out.println("No enough information");
				break;
			case 1:
				System.out.println("Yes");
				break;
			case 2:
				System.out.println("No");
				break;
			default:
				System.out.println("Error!");
			}
			switch (cmpAge(name1, name2)) {
			case 0:
				System.out.println("No enough information");
				break;
			case 1:
				System.out.println("Yes");
				break;
			case 2:
				System.out.println("No");
				break;
			default:
				System.out.println("Error!");
			}

		} while (input.hasNext());

		input.close();
	}

	public static void main(String args[]) {
		new Main().printResult();
	}

}

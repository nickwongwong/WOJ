package p1045;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1045 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int no = input.nextInt();
		String str = null;
		input.nextLine();

		while (no-- > 0) {

			str = input.nextLine();
			char[] ch = str.toCharArray();
			if (ch[0] <= 'z' && ch[0] >= 'a')
				ch[0] = (char) (ch[0] - 32);

			for (int i = 1; i < ch.length; i++) {
				if (ch[i - 1] != ' ' && ch[i] >= 'A' && ch[i] <= 'Z')
					ch[i] = (char) (ch[i] + 32);
			}
			System.out.println(ch);

		}
		input.close();
	}
}
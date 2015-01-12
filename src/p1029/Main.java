package p1029;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1029 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String str = null;
		char[] msg;
		while (input.hasNext()) {
			str = input.next();
			if (!str.equals("$")) {
				msg = str.toCharArray();
				for (int i = 0; i < msg.length; i++) {
					if ((i + 1) % 26 <= (int) (msg[i] - 'A'))
						msg[i] = (char) (msg[i] - (i + 1) % 26);
					else
						msg[i] = (char) ('Z' + 1 - ((i + 1) % 26 - (msg[i] - 'A')));
				}
				System.out.println(msg);
			}

		}
		input.close();
	}
}
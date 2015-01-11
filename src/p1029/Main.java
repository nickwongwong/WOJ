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
					msg[i] = (char) (msg[i] - (i + 1) % 26);
				}
				System.out.println(msg);
			}

		}
		input.close();
	}
}
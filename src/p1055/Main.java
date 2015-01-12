package p1055;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1055 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		String str = null;
		char[] msg;
		while (!input.nextLine().equals("ENDOFINPUT")) {

			str = input.nextLine();

			msg = str.toCharArray();
			for (int i = 0; i < msg.length; i++) {
				int pos = (int) (msg[i] - 'A');
				if (pos >= 0 && pos <= 25) {
					if (pos >= 5)
						msg[i] = (char) (msg[i] - 5);
					else
						msg[i] = (char) ('Z' + 1 - (5 - pos));
				}

			}

			System.out.println(msg);

			input.nextLine();

		}
		input.close();
	}
}
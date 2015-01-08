package p1013;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1013 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String str = input.next();

			StringBuilder strB = new StringBuilder(str);
			String result = strB.toString();
			String tmp = null;
			for (int i = 0; i < str.length(); i++) {

				tmp = strB.append(strB.charAt(0)).deleteCharAt(0).toString();
				if (tmp.compareTo(result) < 0)
					result = tmp;

			}

			System.out.println(result);
		}
		input.close();
	}
}

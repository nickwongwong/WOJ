package p1004;

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

	private double convertUnit(double input, String str) {
		if (str.equals("feet")) {
			return input / 1.5;
		} else if (str.equals("meters")) {
			return input / 0.4572;
		} else if (str.equals("centimeters")) {
			return input / 45.72;
		} else if (str.equals("inches")) {
			return input / 18;
		} else
			return input;
	}

	private void printResult() {
		Scanner input = new Scanner(System.in);
		String name1 = null, name2 = null;

		do {

		} while (input.hasNext());

		input.close();
	}

	public static void main(String args[]) {
		new Main().printResult();
	}

}

package p1004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Copyright(C) 2014,Cao Qingqing , Wuhan University
 * All rights reserved.
 *	
 * This class is submitted for solving the problem 1004 
 * in WOJ
 * 
 * Author: Qingqing Cao, Computer School, Wuhan University
 * Time: 2014-12-27
 * Email: im@caoqq.net
 */
public class Main {

	private double convertUnit(double input, String str) {
		if (str.equals("feet")) {
			return input / 1.5000;
		} else if (str.equals("meters")) {
			return input / 0.4572;
		} else if (str.equals("centimeters")) {
			return input / 45.7200;
		} else if (str.equals("inches")) {
			return input / 18.0000;
		} else
			return input;
	}

	private void printResult() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String currentLineString = null;
		double[] num = new double[3];
		String[] unit = new String[3];
		String[] tmpStr = null;

		while ((currentLineString = br.readLine()) != null) {
			int lineNo = 0;
			while (currentLineString != null && !currentLineString.equals("")) {
				tmpStr = currentLineString.split(" ");
				num[lineNo] = Double.parseDouble(tmpStr[0]);
				unit[lineNo] = tmpStr[1];
				currentLineString = br.readLine();
				lineNo++;

			}
			double length = convertUnit(num[0], unit[0]);
			double width = convertUnit(num[1], unit[1]);

			if (Math.abs(length - 6 * width) < 1e-9)
				System.out.println("Excellent");
			else if (Math.abs(length - width) < 1e-9)

				if (Math.abs(length - 6 * width) < 0.000001)
					System.out.println("Excellent");
				else if (Math.abs(length - width) < 0.000001)

					System.out.println("Spin");
				else
					System.out.println("Neither");

			System.out.println();
		}
	}

	public static void main(String args[]) throws NumberFormatException,
			IOException {
		new Main().printResult();

	}

}

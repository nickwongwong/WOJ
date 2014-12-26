package p1002;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
public class two {
	public static void main(String args[]) {
		Scanner src = new Scanner(System.in);
		src.useDelimiter("\n");

		String lineStr = src.next();
		String nextLineStr = "";
		String tmpStr = "";
		int wordsNo = 0;
		Pattern p1 = Pattern.compile("\\d:\\d+");
		Pattern p2 = Pattern.compile("[A-Z-a-z]+");

		while (src.hasNext()) {
			nextLineStr = src.next();

			Matcher mLst = p1.matcher(lineStr);
			if (mLst.find()) {
				tmpStr = mLst.group();
			}

			Matcher m2 = p2.matcher(lineStr);
			int no = 0;
			while (m2.find()) {
				// System.out.println(m2.group() + "@@");
				no++;
			}
			wordsNo = wordsNo + no;

			Matcher mNxt = p1.matcher(nextLineStr);
			if (mNxt.find()) {
				System.out.println(tmpStr + " " + wordsNo);
				wordsNo = 0;
			}

			lineStr = nextLineStr;
		}

		Matcher mLst = p1.matcher(lineStr);
		if (mLst.find()) {
			tmpStr = mLst.group();
		}

		Matcher m2 = p2.matcher(lineStr);
		int no = 0;
		while (m2.find()) {
			// System.out.println(m2.group() + "@@");
			no++;
		}
		wordsNo = wordsNo + no;
		System.out.println(tmpStr + " " + wordsNo);
		src.close();
	}
}

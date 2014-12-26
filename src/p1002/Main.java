package p1002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
public class Main {

	// 统计当前行单词数目
	private int countWords(String str) {
		if (str != null) {
			Pattern p = Pattern.compile("[A-Z-a-z]+");
			Matcher m = p.matcher(str);
			int no = 0;
			while (m.find()) {
				no++;
			}
			return no;
		}
		return 0;
	}

	// 找出1:1这种段落符号
	private String findParaFlag(String str) {
		if (str != null) {
			Pattern p = Pattern.compile("\\d:\\d+");
			Matcher m = p.matcher(str);
			if (m.find()) {
				return m.group();
			} else
				return null;
		}
		return null;
	}

	private void printResult() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int currentLineWords = 0;
		String currentLineString = null;
		String paraFlag = null;
		String tmpParaFlag = null;
		int paraWords = 0;

		while ((currentLineString = br.readLine()) != null) {

			currentLineWords = this.countWords(currentLineString);

			tmpParaFlag = this.findParaFlag(currentLineString);

			if (tmpParaFlag != null) {
				if (paraWords != 0) {
					System.out.println(paraFlag + " " + paraWords);
				}
				paraFlag = tmpParaFlag;
				paraWords = currentLineWords;
			} else {
				paraWords = currentLineWords + paraWords;
			}

		}

		System.out.println(paraFlag + " " + paraWords);

	}

	public static void main(String[] args) throws IOException {
		new Main().printResult();
	}
}

package p1162;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1162 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();

		while (cases-- > 0) {
			BigInteger a = new BigInteger(input.next());
			BigInteger b = new BigInteger(input.next());
			System.out.println(a.add(b));

		}
		input.close();
	}
}

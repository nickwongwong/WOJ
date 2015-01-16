package p1288;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1288 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {

		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		char[] a, b;
		int k;
		int[] diff;
		while (cases-- > 0) {
			a = input.next().toCharArray();
			b = input.next().toCharArray();
			k = input.nextInt();
			diff = new int[a.length];
			for (int i = 0; i < a.length; i++) {
				diff[i] = Math.abs(a[i] - b[i]);
			}
			Arrays.sort(diff);
			int sum = 0;
			for (int i = diff.length - k; i < diff.length; i++) {
				if (diff[i] == 0)
					diff[i] = 1;
				else
					diff[i] = 0;
			}
			for (int i = 0; i < diff.length; i++) {
				sum += diff[i];
			}
			System.out.println(sum);

		}
		input.close();
	}
}

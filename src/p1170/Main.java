package p1170;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1170 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		List<Integer> a = new ArrayList<Integer>();
		while (input.hasNext()) {
			int n = input.nextInt();

			if (n != 0) {

				a.add(n);
			} else {
				Integer[] b = a.toArray(new Integer[a.size()]);
				Arrays.sort(b);
				System.out.print(b[0]);
				for (int i = 1; i < b.length; i++) {
					if (!b[i].equals(b[i - 1]))
						System.out.print(" " + b[i]);
				}
				break;
			}

		}
		input.close();
	}
}
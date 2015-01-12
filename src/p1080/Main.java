package p1080;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1080 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		input.nextInt();

		while (input.hasNext()) {

			if (input.nextInt() % 14 == 0) {
				System.out.println("snoopy wins the game!");
			} else {
				System.out.println("flymouse wins the game!");
			}

		}
		input.close();
	}
}
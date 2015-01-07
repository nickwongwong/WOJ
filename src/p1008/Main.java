package p1008;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1008 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int animalNo = input.nextInt();
			int[][] feedTime = new int[8][animalNo];
			int totalTime = 0;
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < animalNo; j++) {
					feedTime[i][j] = input.nextInt();
				}
			}
			int tmp = 0;
			for (int j = 0; j < animalNo; j++) {
				for (int i = 0; i < 7; i++) {
					if (feedTime[i][j] < feedTime[i + 1][j]) {
						tmp = feedTime[i][j];
						feedTime[i][j] = feedTime[i + 1][j];
						feedTime[i + 1][j] = tmp;
					}
				}

				totalTime += feedTime[7][j];

			}
			System.out.println(totalTime);
		}
		input.close();
	}
}

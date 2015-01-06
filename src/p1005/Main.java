package p1005;

import java.util.Scanner;

/* Copyright(C) 2014,Cao Qingqing , Wuhan University
 * All rights reserved.
 *	
 * This class is submitted for solving the problem 1005 
 * in WOJ
 * 
 * Author: Qingqing Cao, Computer School, Wuhan University
 * Time: 2014-12-27
 * Email: im@caoqq.net
 */
public class Main {

	public static int knackPack(int packSize, int[] size, int[] value) {
		int no = size.length;
		int[][] V = new int[no + 1][packSize + 1];
		for (int i = 1; i <= no; i++) {
			for (int j = 1; j <= packSize; j++) {
				V[i][j] = V[i - 1][j];
				if (size[i - 1] <= j) {
					V[i][j] = Math.max(V[i][j], V[i - 1][j - size[i - 1]]
							+ value[i - 1]);
				}
			}
		}
		return V[no][packSize];
	}

	private void printResult() {
		Scanner input = new Scanner(System.in);
		int animalKinds = 0;
		int[] animalVolume;
		int[] animalPoints;
		int arkSize = 0;
		do {
			animalKinds = input.nextInt();
			animalVolume = new int[animalKinds];
			animalPoints = new int[animalKinds];
			for (int i = 0; i < animalKinds; i++) {
				animalVolume[i] = input.nextInt();
				animalPoints[i] = input.nextInt();
			}
			arkSize = input.nextInt();

			System.out.println(knackPack(arkSize, animalVolume, animalPoints));

		} while (input.hasNext());

		input.close();
	}

	public static void main(String args[]) {
		new Main().printResult();
	}

}

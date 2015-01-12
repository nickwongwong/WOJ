package p1016;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1016 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University
 * 
 */
public class Main {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int no;
		int[][] xy;

		while (input.hasNext()) {
			no = input.nextInt();
			xy = new int[2][no];
			int[] flag = new int[no];
			int sumY = 0;
			boolean isSymmetric = true;
			for (int i = 0; i < no; i++) {
				xy[0][i] = input.nextInt();
				xy[1][i] = input.nextInt();

				sumY += xy[1][i];
				flag[i] = 0;
			}
			sumY *= 2;
			double meanY = sumY / no;
			if (sumY % no != 0)
				isSymmetric = false;
			else {
				for (int i = 0; i < no; i++) {
					if (flag[i] == 0 && xy[1][i] * 2 != meanY) {
						int j = 0;
						for (j = i + 1; j < no; j++) {
							if (xy[0][j] == xy[0][i]
									&& xy[1][i] + xy[1][j] == meanY) {
								flag[i] = flag[j] = 1;
								break;
							}
						}
						if (j == no)
							isSymmetric = false;
					}
				}

			}
			if (isSymmetric)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
		input.close();
	}
}

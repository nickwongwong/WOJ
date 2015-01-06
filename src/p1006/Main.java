package p1006;

import java.util.Scanner;

/* Copyright(C) 2014,Cao Qingqing , Wuhan University
 * All rights reserved.
 *	
 * This class is submitted for solving the problem 1006 
 * in WOJ
 * 
 * Author: Qingqing Cao, Computer School, Wuhan University
 * Time: 2014-12-27
 * Email: im@caoqq.net
 */
public class Main {

	private int bfsCount(int[][] graph, int start, int end) {
		if (start == end)
			return 0;

		int[] visited = new int[graph.length];

		int[] queue = new int[graph.length];
		for (int q = 0; q < queue.length; q++) {
			queue[q] = -1;
		}

		int breadth = -1;// the breadth of the graph
		int k = 0;// the number of the total elements in the queue
		queue[k++] = start;

		int i;
		while (k > 0) {
			if (queue[0] == end) {
				return breadth;
			} else {
				i = queue[0];
				breadth++;
			}

			k--;
			int r = 0;
			do {
				queue[r] = queue[r + 1];
				r++;
			} while (r < k);

			if (visited[i] != 1) {
				visited[i] = 1;

				for (int j = 0; j < graph[i].length; j++) {
					if (graph[i][j] == 1 && visited[j] != 1) {
						queue[k++] = j;

					}
				}
			}

		}

		return breadth;
	}

	private void printResult() {
		Scanner input = new Scanner(System.in);

		int animalNo = input.nextInt();
		int[][] animalGraph = new int[animalNo][animalNo];
		int pairsNo = input.nextInt();

		int from, to;
		for (int i = 0; i < pairsNo; i++) {
			from = input.nextInt();
			to = input.nextInt();
			animalGraph[from][to] = 1;
			animalGraph[to][from] = 1;
		}
		int queryTimes = input.nextInt();
		for (int i = 0; i < queryTimes; i++) {
			from = input.nextInt();
			to = input.nextInt();

			System.out.println(bfsCount(animalGraph, from, to));
		}

		input.close();
	}

	public static void main(String args[]) {
		new Main().printResult();
	}

}

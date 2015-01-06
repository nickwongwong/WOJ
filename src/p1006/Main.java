package p1006;

import java.util.Scanner;

/**
 * Copyright(C) 2015,Cao Qingqing , Wuhan University All rights reserved.
 * 
 * This class is submitted for solving the problem 1006 in WOJ
 * 
 * @author : Qingqing Cao, Computer School, Wuhan University Time: 201-01-06
 * 
 */
public class Main {

	private static int bfsCount(int[][] graph, int start, int end) {
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
		int flag = 1;
		int top = 0;
		int pos = 1;
		while (k > 0) {

			if (queue[top] == end) {
				return breadth;
			} else {
				i = queue[top];
				visited[i] = 1;
				if (flag == 0) {
					flag = k;
				}
				flag--;
				k--;
				top++;
			}

			for (int j = 0; j < graph[i].length; j++) {
				if (graph[i][j] == 1 && visited[j] != 1) {
					queue[pos++] = j;
					k++;
					visited[j] = 1;
				}
			}

			if (flag == 0) {
				breadth++;
				flag = k;
			}
		}

		if (visited[end] != 1)
			return -1;
		else
			return breadth;
	}

	public static void main(String args[]) {

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
		// long tic = System.currentTimeMillis();
		int queryTimes = input.nextInt();
		for (int i = 0; i < queryTimes; i++) {
			from = input.nextInt();
			to = input.nextInt();

			System.out.println(bfsCount(animalGraph, from, to));
		}
		// long toc = System.currentTimeMillis();

		input.close();
		// System.out.println(toc - tic);
	}

}

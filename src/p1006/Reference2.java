package p1006;

/*original copyright by 2011301500225
 * please do not copy this code for submission!
 */
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Reference2 {

	public static int MaxValue = 200000;

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int animalCount = in.nextInt();
		int edgeCount = in.nextInt();
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < animalCount; i++) {
			ArrayList<Integer> al = new ArrayList<Integer>();
			graph.add(al);
		}
		int from, to;
		for (int i = 0; i < edgeCount; i++) {
			from = in.nextInt();
			to = in.nextInt();
			graph.get(from).add(to);
			graph.get(to).add(from);
		}
		int needCount = in.nextInt();
		for (int i = 0; i < needCount; i++) {
			from = in.nextInt();
			to = in.nextInt();
			System.out.println(getLength(graph, from, to));
		}
	}

	public static int getLength(ArrayList<ArrayList<Integer>> g, int start,
			int end) {
		int[] visit = new int[g.size()];
		Arrays.fill(visit, 0);
		if (start == end)
			return 0;
		ArrayDeque<Integer> qu = new ArrayDeque<Integer>();
		qu.addLast(start);
		visit[start] = 1;
		int element;
		while (!qu.isEmpty()) {
			element = qu.removeFirst();
			for (int node : g.get(element)) {
				if (node == end)
					return visit[element] - 1;
				if (visit[node] == 0) {
					qu.addLast(node);
					visit[node] = visit[element] + 1;
				}
			}
		}
		return -1;
	}

}

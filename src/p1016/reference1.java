package p1016;

/*original copyright by 2011301500227
 * please do not copy this code for submission!
 */
import java.util.Scanner;

public class reference1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			boolean flag = true;
			int sumy = 0;
			double x = 0, y = 0;
			int[][] arr = new int[2][n];
			for (int i = 0; i < n; i++) {
				arr[0][i] = sc.nextInt();
				arr[1][i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
				sumy += arr[1][i];
			}
			y = sumy * 1.0 / n;
			for (int i = 0; i < n; i++) {
				int temp = 0;
				int sumx = 0;
				for (int j = 0; j < n; j++) {
					if (arr[0][j] == arr[0][i]) {
						temp++;
						sumx += arr[1][j];
					}
				}
				if (temp % 2 != 0) {
					if (sumx % temp != 0) {
						flag = false;
						break;
					} else
						x = sumx * 1.0 / temp;
				} else
					x = sumx * 1.0 / temp;
				if (x != y) {
					flag = false;
					break;
				}

			}

			if (flag)
				System.out.println("YES");
			else
				System.out.println("NO");

		}

	}

}

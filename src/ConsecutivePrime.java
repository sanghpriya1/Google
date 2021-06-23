import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsecutivePrime {

	private static int prime_list(int n) {
		int final_ans = 0;
		boolean[] prime = new boolean[n + 1];
		for (int i = 0; i < n; i++)
			prime[i] = true;
		prime[0] = false;
		prime[1] = false;

		for (int i = 2; i * i <= n; ++i) {
			if (prime[i] == true) {
				for (int j = i; j * i <= n; j++) {
					prime[i * j] = false;
				}
			}
		}
		List<Integer> lst = new ArrayList<Integer>();
		for (int i = 2; i <= n; ++i) {
			if (prime[i] == true) {

				lst.add(i);
			}

		}
		int len = lst.size();
		int x = lst.get(0);
		int i = 1;
		int product = 1;
		while (i < len) {
			int ans = product;
			product = x * lst.get(i);
			x = lst.get(i);
			if (product > n) {
				final_ans = ans;
				break;
			}
			i++;
		}

		return final_ans;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int i = 0;
		while (t-- > 0) {
			int n = sc.nextInt();

			System.out.println("Case #" + ++i + ":" + " " + prime_list(n));

		}
		sc.close();

	}

}

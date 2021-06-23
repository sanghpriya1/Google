import java.util.Scanner;

public class IncreasingSubstring {
	private static void Increasing(String S) {
		int len = S.length();
		int[] arr = new int[len];
		arr[0] = 1;
		
		for(int i = 1; i< len; ++i) {
			int x = S.charAt(i-1)-'A';
			int y = S.charAt(i)-'A';
			if(y > x) {
				arr[i] = arr[i-1]+1;
				System.out.print(" ");
				System.out.print(arr[i]);
				
			}
			else {
				arr[i] = 1;
				System.out.print(" ");
				System.out.print(1);
				
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int i = 0;
		while(t-- > 0) {
			int n = sc.nextInt();
			
			String P = sc.next();
			System.out.print("Case #" + ++i + ":" + " " + 1);
			Increasing(P);
			System.out.println(" ");
			
		}
		sc.close();
	}

}

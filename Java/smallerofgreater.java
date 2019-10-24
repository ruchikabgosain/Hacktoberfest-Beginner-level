package june6;

import java.util.Scanner;

public class smallerofgreater {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t != 0) {
			int n = scn.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = scn.nextInt();
			}
			smallerofgreater(arr);
			t--;
		}

	}

	public static void smallerofgreater(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int j = i + 1;
			while (j < arr.length) {
				if (j == arr.length - 1)
					System.out.println(-1);
				if (arr[j] > arr[i]) {
					int k = j + 1;
					while (k < arr.length) {
						if (k == arr.length - 1) {
							System.out.println(-1);
						}
						if (arr[k] < arr[j]) {
							System.out.println(arr[k]);
							return;
						} else {
							k++;
						}

					}
				} else {
					j++;
				}

			}

		}
	}

}

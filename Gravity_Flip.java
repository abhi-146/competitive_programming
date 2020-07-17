package codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class Gravity_Flip {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		Arrays.parallelSort(arr);
		for(int i : arr)
			System.out.print(i+" ");

		}
		
	}



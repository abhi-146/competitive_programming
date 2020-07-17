package codeforces;

import java.util.Scanner;

public class Kelfa_and_the_First_Steps {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 var n = sc.nextInt();
		 
		 var arr = new int[n];
		 
		 for(int i =0;i<n;i++)
			 arr[i] = sc.nextInt();
		 
		 int max = 1;
		 int curr = 1;
		 
		 for(int i = 1;i<n;i++)
		 {
			 if(arr[i] >= arr[i - 1])
			 {
				curr++;
				max = Math.max(max, curr);
			 }
			 else
				 curr = 1;
		 }
		 System.out.print(max);
		 
		 sc.close();

	}

}

package codeforces;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Sort_the_Numbers {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i =0;i<n;i++)
			arr[i] = sc.nextInt();
		
		Arrays.sort(arr);
		
		 File file = new File("\\p1.txt");
	    
	      PrintStream stream = new PrintStream(file);
	      System.out.println(file.getAbsolutePath());
	      System.setOut(stream);
		
		for(int i : arr)
		System.out.print(i+ " ");
		
		sc.close();
		
	}

}

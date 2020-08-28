package codeforces;

import java.util.HashSet;
import java.util.Scanner;

public class CopyCopyCopyCopyCopy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0)
		{
			int n = sc.nextInt();
			HashSet<Integer> set = new HashSet<>();
			
			for(int i = 0;i<n;i++)
				set.add(sc.nextInt());
			
			System.out.println(set.size());
		}
	}

}

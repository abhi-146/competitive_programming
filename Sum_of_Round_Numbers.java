package codeforces;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum_of_Round_Numbers {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var t = sc.nextInt();
		while(t-- > 0) {
			var n = sc.nextInt();
			var count = 0;
			var i = 0;
			var rem = 0;
			var list = new ArrayList<Integer>();
			while(n > 0)
			{
				rem = n % 10;
				
				if(rem != 0)
				{
					count++;
					list.add((int) ((Math.pow(10, i))* rem));
				}
				
				n/=10;
				i++;
			}
			System.out.println(count);
			for(var j : list)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}

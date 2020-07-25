package codeforces;

import java.util.Scanner;

public class Raising_Bacteria {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var x = sc.nextInt();
		var bacteria = 0;
		
		while(x > 0)
		{
			var k = 0;  
			while((1 << k) <= x)
			{
				k++;
			}
			
			x = x - (1 <<(k - 1));
			bacteria++;
		}
		System.out.println(bacteria);
		sc.close();
		
	}

}

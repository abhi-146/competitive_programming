package codeforces;
import java.util.*;
public class Bear_And_Big_Brother {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int count = 0;
		while(true)
		{
			a*=3;
			b*=2;
			count++; 
			if(a > b)
				break;
			
		}System.out.print(count);
		sc.close();

	}

}

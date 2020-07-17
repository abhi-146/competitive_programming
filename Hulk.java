package codeforces;
import java.util.*;
public class Hulk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		String odd = "I hate that";
		String even = "I love that";
		String oddF = "I hate it";
		String evenF = "I love it";
		
		for(int i =1;i<=n -1;i++)
		{
			if((i & 1) == 1)
				System.out.print(odd+" ");
			else
				System.out.print(even+" ");
		}
		if((n & 1) == 1)
			System.out.print(oddF);
		else
			System.out.println(evenF);
		
		sc.close();
	}

}

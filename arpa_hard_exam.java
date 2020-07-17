package codeforces;
import java.util.*;

public class arpa_hard_exam {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = calculate(8,n,10);
		System.out.print(res);
        sc.close();
	}

	private static int calculate(int base, int power, int modulo) {
		
		int res = 1;
		while(power > 0)
		{
			if(power % 2 == 1)
			{
				power = power - 1;
				res = (res * base) % modulo;
			}
			else
			{
				power = power / 2;
				base = (base * base) % modulo;
			}
		}
		
		
		return res % modulo;
	}
	

}

package codeforces;
import java.util.Scanner;

public class AccurateLee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
			int n = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			
			int zero = 0;
			for(int i = 0;i< n;i++)
			{
				if(str.charAt(i) == '0')
					zero++;
				else
					break;
					  
			}
			int one = 0;
			
			for(int i = n - 1;i>=0;i--)
			{
				if(str.charAt(i) == '1')
					one++;
				else break;
			}
			
			if((zero + one) == n)
				System.out.println(str);
			else 
			{
				StringBuffer sb = new StringBuffer("");
				while(zero-- >= 0)
					sb.append('0');
				
				
				while(one-- > 0)
					sb.append('1');
				
				System.out.println(sb);
			}
		}
		sc.close();

	}

}

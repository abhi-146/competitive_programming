package codeforces;
import java.util.*;
public class In_Search_of_Easy_Problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String result = "EASY";
		while(n-- > 0)
		{
			if(sc.nextInt() == 1)
			{
				result = "HARD";
			}
		}
		
		System.out.print(result);
		sc.close();
		
	}

}

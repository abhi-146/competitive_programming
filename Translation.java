package codeforces;
import java.util.*;

public class Translation {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(sc.nextLine());
		
		if(str.equals(sb.reverse().toString()))
			System.out.print("YES");
			else
				System.out.print("NO");
		
		sc.close();
		

	}

}

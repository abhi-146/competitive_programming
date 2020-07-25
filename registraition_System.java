package codeforces;

import java.util.HashMap;
import java.util.Scanner;

public class registraition_System {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		HashMap<String,Integer> map = new HashMap<>();
		
		while(n-- > 0)
		{
			String str = sc.nextLine();
			
			if(map.containsKey(str))
			{
				int value = map.get(str);
				System.out.println(str +""+ value);
				map.put(str, value + 1);
			}
			else
			{
				System.out.println("OK");
				map.put(str, 1);
			}
		}
		sc.close();
	}

}

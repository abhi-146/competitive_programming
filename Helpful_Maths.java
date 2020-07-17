package codeforces;
import java.util.*;
public class Helpful_Maths {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input[] = sc.nextLine().split("\\+");
		Arrays.sort(input);
		for(int i =0 ;i<input.length-1;i++)
		{
			System.out.print(input[i]+"+");
		}
		System.out.print(input[input.length - 1]);
		sc.close();

	}

}

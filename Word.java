package codeforces;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Word {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char arr[] = str.toCharArray();
		int l = (int)str.codePoints().filter(c -> c >= 'a' && c <= 'z').count();
		int u = (int)str.codePoints().filter(c -> c >= 'A' && c <= 'Z').count();
//		for(char ch : arr)
//		{
//			if(ch >='a' && ch <= 'z')
//				l++;
//			else
//				u++;
//		}
//		
		
		
		if(l >= u)
			System.out.print(str.toLowerCase());
		else
			System.out.print(str.toUpperCase());
		
		sc.close();

	}

}

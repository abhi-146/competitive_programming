package codeforces;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class chat_room {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String regex = ".*[h+].*[e+].*[l+].*[l+].*[o+].*";
		Pattern pat = Pattern.compile(regex);
		Matcher m = pat.matcher(str);
		if(m.find())
			System.out.print("YES");
		else
			System.out.print("NO");
		sc.close();
	}


}

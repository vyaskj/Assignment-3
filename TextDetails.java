import java.util.Scanner;
public class TextDetails {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		int r = calculateWords(s);
	}
	public static int calculateWords(String r) {
		int words=0,character=0,line=0;
		for(int i=0;i<r.length();i++)
		{
			if(r.charAt(i)==' ')//Empty space in string
			{
				words++; //Total words
			}
			if(r.charAt(i)=='\n')
			{
				line++; //total Line
			}
	        character++; //total character
		}

		System.out.println("characters = "+ character+" \nwords = "+words+"\nLines = "+line);
		return line;
	}
}
import java.util.*;
public class PositiveNegative {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String"); //Input
		String r = sc.nextLine();
		sc.close();
		
		String str = checkPositive(r);
		
	}
	
	public static String checkPositive(String str) {
		for(int i=0;i<str.length()-1;i++) {
			if(str.charAt(i+1)<str.charAt(i)) //Check the character one by one in alphabetic order 
			{
				System.out.println("Not Positive String");
			}else {
				System.out.println("Positive String");
			}
	}
	return str;
	}

}
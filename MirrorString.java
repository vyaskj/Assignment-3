import java.util.*;
import java.lang.*;
public class MirrorString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=new String();
		System.out.println("Enter a string");
		str=sc.next(); //Input string
		sc.close();
		String result=getImage(str);
		System.out.println("Mirror Image is\n "+str+" | "+result);
		
	}

	private static String getImage(String str) {
		StringBuffer result= new StringBuffer(str);
		result.reverse();	//String reversing
		String reverse=result.toString();	//Convert 2 string
		return reverse;
	}
}
import java.util.*;
import java.lang.*;
public class ConstantReplace {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		sc.close();
		System.out.println("Enter a string");
		String str=new String();
		str=sc.next(); 		//input string
		String result=alterImage(str.toCharArray());
		System.out.println("After replace consonant\n"+result); 
	}

	private static String alterImage(char[] str) {
		for(int i=0;i<str.length;i++) {
			if(str[i]=='a' || str[i]=='e'|| str[i]=='i' || str[i]=='o' || str[i]=='u') { //check vowels
				str[i]=(char)str[i]; //IF Vowels Found in the String then the vowels are same
			}
			else {
				if(str[i]=='z') {  // string contain z then we replace z to b
					str[i]='b';
				}
				else {
					str[i]= (char)(str[i]+1); //next immediate alphabet.
				}
				
			}
		}
		return String.valueOf(str); //return replace all he consonant
	}
}
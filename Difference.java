import java.util.Scanner;

public class Difference {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		sc.close();
		int d = modifyNumber(num);
	}
	
	public static int modifyNumber(int d) {
		int sum=0;
		int h=d%10;
		while(d!=0) {
			int a =d%10;
			sum=sum*10 +a;
			d=d/10;
		}
		System.out.println(sum); //Reversing number
		while(sum!=0) {
			int k = sum%10;
			sum=sum/10;
			int l =sum%10;
			int result =k-l;
			System.out.println(result);
		}
		return d;
	}
}
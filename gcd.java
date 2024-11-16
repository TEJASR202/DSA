package java1;
import java.util.Scanner;

public class gcd {

	public static void main(String[] args) {
		int a,b;
		int gcd=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number:");
		a = sc.nextInt();
		System.out.println("Enter the second number:");
		b = sc.nextInt();
		for(int i=1;i<=a&& i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("GCD OF "+ a + " and " + b + " is:" + gcd);
	}
}

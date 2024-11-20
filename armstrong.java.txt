package java1;
import java.util.Scanner;
public class armstrong {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,temp,r,sum=0;
		System.out.println("Enter the number");
		n = sc.nextInt();
		temp = n;
		while(n>0)
		{
		r=n%10;
		n=n/10;
		sum=sum+r*r*r;
		}
		if(temp==sum)
		{
			System.out.println("It is armstrong number");
		}
		else
		{
			System.out.println("It is not an armstrong number");
		}
	}
}

import java.util.Scanner;
public class arrayreverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter an array of numbers:");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Reversed array:");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(arr[i] +  " ");
        }
    }
}
 
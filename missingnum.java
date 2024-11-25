import java.util.Scanner;
public class missingnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int[] nums=new int[size];
        System.out.println("Enter the elements of the array size " + size);
        for(int i=0;i<size;i++)
        {
            nums[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            sum=sum+nums[i];
        }
        size=size+1;
        int totalsum=(size*(size+1))/2;
        int miss=totalsum-sum;
        System.out.println("Missing number:" + miss);
        sc.close();
    }
}

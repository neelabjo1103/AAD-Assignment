package Assignment;
import java.util.Scanner;
import java.lang.Math;

public class assignment1_armstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try
        {
            System.out.println("Enter a number");
            int n = s.nextInt();
            int l = Integer.toString(n).length();
            
            int n1=n;
            int sum=0;
            while(n>0)
            {
                int rem=n%10;
                n/=10;
                sum+=Math.pow(rem, l);
            }

            if(sum==n1)
                System.out.println("Armstrong Number");
            else
                System.out.println("Not an armstrong number");
        }
        finally
        {
            s.close();
        }
    }
}

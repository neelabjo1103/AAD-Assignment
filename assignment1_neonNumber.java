package Assignment;
import java.util.Scanner;

public class assignment1_neonNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try
        {
            int n = s.nextInt();

            int sq = n*n;
            
            int sum=0;
            while(sq>0)
            {
                int rem=sq%10;
                sq/=10;
                sum+=rem;
            }

            if(sum==n)
                System.out.println("Neon Number");
            else
                System.out.println("Not a neon number");
        }
        finally
        {
            s.close();
        }
    }
}

package Assignment;
import java.util.Scanner;

public class assignment1_ISBNNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try
        {
            long n=s.nextLong();
            if(Long.toString(n).length() == 10)
            {
                int i=10;
                int sum=0;
                
                while(n>0)
                {
                    long rem=n%10;
                    n/=10;

                    sum+=(i*rem);
                    i--;

                }

                if(sum%11 == 0)
                    System.out.println("ISBN Number");
                else
                    System.out.println("Not an ISBN Number");
            }
        }
        finally
        {
            s.close();
        }

    }
}

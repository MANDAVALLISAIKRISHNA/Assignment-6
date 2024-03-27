import java.util.*;
public class Divisible
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        if(num%7==0 && num%13==0 )
        {
            int quotient1=num/7;
            int quotient2=num/13;
            int rem1=num%7;
            int rem2=num%13;
            System.out.println(num+"is divisible by both 7 and 13");
            System.out.println("Quotient when divided by 7 :"+quotient1);
            System.out.println("Remainder when divided by 7 :"+rem1);
            System.out.println("Quotient when divided by 13 :"+quotient2);
            System.out.println("Remainder when divided by 13 :"+rem2);
        }
        else
        {
           System.out.println(num+"is not divisible by both 7 and 13");    
        }
        sc.close();
    }
}
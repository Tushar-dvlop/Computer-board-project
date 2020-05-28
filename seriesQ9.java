//program to calculate and print each of the following series

import java.util.Scanner;

public class seriesQ9
{
    public static void main(String args[])
    {
        Scanner a=new Scanner(System.in);
        
        int sum=2-4+6-8+10-12+14-16+18-20;
        System.out.println("the answer for series one is " + sum);
        
        System.out.println("enter the value of x for the second series");
        int x=a.nextInt();
        int sum2=x/2+x/5+x/8+x/11+x/14+x/17+x/20;
        System.out.println("the answer for the second series is "+sum2);
    }
}
            
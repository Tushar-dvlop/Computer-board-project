//program to assign the stream to a student based on their

import java.util.Scanner;

public class streamQ7
{
    public static void main(String args[])
    {
        Scanner a=new Scanner(System.in);
        
        System.out.println("please enter your name");
        String name=a.nextLine();
        
        System.out.println("please enter your roll number");
        int roll=a.nextInt();
        
        System.out.println("please enter the mark of five subjects one by one out of 100");
        int sub1=a.nextInt();
        int sub2=a.nextInt();
        int sub3=a.nextInt();
        int sub4=a.nextInt();
        int sub5=a.nextInt();
        
        double avg=((sub1+sub2+sub3+sub4+sub5)*100)/500;
        if(avg>=90)
        {
            System.out.println("the stream assigned for you is science with computers");
        }
        else if(avg>=80 && avg<89)
        {
            System.out.println("the stream assigned for you is Science without computers");
        }
        else if(avg>=70 && avg<79)
        {
            System.out.println("the stream assigned for you is Commerce with maths");
        }
        else
        {
            System.out.println("the stream assigned for you is Commerce without Maths");
        }
    }
}
// program to print floyds right angle traingle using natural numbers
//int n signifies the number of rows to be entered by the user

public class floydQ1
{ 
    public static void main(int n)
    {
        int value=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(value+"\t");
                value++;
            }
            System.out.println();
        }
    }
}
        
        
        
        
   
       
 
//program to create a function to calculate the total salary by adding 50&% HRA to the salary and returns

public class employeeQ2
{
    static void info(String name)
    {
        System.out.println("the name of the employee is " + name);
    }
    static void total(int bsalary)
    {
        float tsalary=bsalary/2+bsalary;
        System.out.println("the total salary for the employee is " + tsalary);
    }
    public static void main(String args[])
    {
        info("johnny");
        total(15000);
    }
}
        
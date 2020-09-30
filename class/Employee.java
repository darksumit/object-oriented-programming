import java.util.*;
class Employee
{
    String name;
    double inc, tax;
    public Employee()
    {
        name="";
        inc=tax=0.00;
    }
    public void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        name=sc.nextLine();
        System.out.println("Enter Annual Income");
        inc=sc.nextDouble();
    }
    public void calc()
    {
        if(inc<=100000)
        {
            tax=0.00;
        }
        else if(inc>100000 && inc<=250000)
        {
            tax=0.10*inc;
        }
        else if(inc>250000 && inc<=500000)
        {
            tax=0.10*250000 + 0.15*(inc-250000);
        }
        else if(inc>500000 && inc<=1000000)
        {
            tax=0.10*inc + 0.15*250000 + 0.20*(inc-500000);
        }
        else if(inc>1000000)
        {
            tax=0.10*inc + 0.15*250000 + 0.20*500000 + 0.25*(inc-500000);
        }
    }
    public void display()
    {
        System.out.println("Name= \t\t" +name);
        System.out.println("Annual Income= \t" +inc);
        System.out.println("Tax= \t\t" +tax);
    }
    public static void main(String args[])
    {
        Employee e=new Employee();
        e.getData();
        e.calc();
        e.display();
    }
}
//Program to illustrate method overriding
import java.util.*;
class Payment
{
    String name;
    double basic;
    Scanner in=new Scanner(System.in);
    void getdata()
    {
        System.out.println("Enter name and basic pay of employee");
        name=in.next();
        basic=in.nextDouble();
    }
    void display()
    {
        System.out.println("Name of Employee: "+name+"\nBasic Pay: "+basic);
    }
}

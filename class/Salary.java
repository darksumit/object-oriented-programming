import java.util.*;
class Salary
{
    String name;
    double bs, da, ta, pf, gs;
    public Salary()
    {
        name="";
        bs=da=ta=pf=gs=0.00;
    }
    public void getData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        name=sc.nextLine();
        System.out.println("Enter Basic Salary");
        bs=sc.nextDouble();
    }
    public void calc()
    {
        if(bs<=10000)
        {
            da=0.40;
            ta=0.20;
            pf=0.10;
        }
        else
        {
            da=0.20;
            ta=0.10;
            pf=0.10;
        }
        gs=bs+ (da+ta-pf)*bs;
    }
    public void display()
    {
        System.out.println("Name= \t\t" +name);
        System.out.println("Basic Salary= \t" +bs);
        System.out.println("Gross Salary= \t" +gs);
    }
    public static void main(String args[])
    {
        Salary s=new Salary();
        s.getData();
        s.calc();
        s.display();
    }
}
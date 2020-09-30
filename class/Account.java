import java.util.*;
class Account
{
    String name, acc;
    double bal;
    Account()
    {
        name="";
        acc="";
        bal=0.00;
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        name=sc.nextLine();
        System.out.println("Enter Account No");
        acc=sc.nextLine();
        System.out.println("Enter Current Balance");
        bal=sc.nextDouble();
    }
    void deposit()
    {
        double x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount to be deposited");
        x=sc.nextDouble();
        bal+=x;
    }
    void withdrawal()
    {
        double x,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount to be withdrawn");
        x=sc.nextDouble();
        d=bal;
        bal-=x;
        if (bal<0)
        {
            System.out.println("Insufficient Balance!");
            bal=d;
        }
    }
    void display()
    {
        System.out.println("Name= " +name);
        System.out.println("Account No= " +acc);
        System.out.println("Remaining Balance= " +bal);
    }
    public static void main(String args[])
    {
    	Account ac=new Account();
        ac.input();
        ac.deposit();
        ac.withdrawal();
        ac.display();
    }
}
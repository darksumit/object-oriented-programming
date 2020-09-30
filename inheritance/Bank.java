//Program to configure a bank account and calculate the annual interest.
import java.io.*;
class Bank
{
    int a, p;
    void accept()throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        System.out.println("Enter Account No.");
        a=Integer.parseInt(in.readLine());
        System.out.println("Enter Principal Amount");
        p=Integer.parseInt(in.readLine());
    }
    void display()
    {
        System.out.println("Account No.: "+a);
        System.out.println("Principal: "+p);
    }
}
//End of Super Class

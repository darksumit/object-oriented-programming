//Program to read and display records in a text file
import java.io.*;
import java.util.*;
public class Teacher
{
    public static void main(String args[])throws IOException
    {
        //Create an output file stream and construct a file
        FileWriter fw=new FileWriter("Teacher.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        Scanner sc=new Scanner(System.in);
        int t,i;
        String ad,name,cls;
        //Enter data in the stream
        System.out.println("Details of the student");
        for(i=1;i<=5;i++)
        {
            System.out.println("Enter Admission no");
            ad=sc.next();
            System.out.println("Enter Name");
            name=sc.next();
            System.out.println("Enter Class");
            cls=sc.next();
            System.out.println("Enter Total marks");
            t=sc.nextInt();
            pw.println(ad);
            pw.println(name);
            pw.println(cls);
            pw.println(t);
        }
        pw.close();
        System.out.println("1. Display records");
        System.out.println("2. Display highest total");
        System.out.println("Enter your choice");
        int x=sc.nextInt();
        switch(x)
        {
            case 1:
            //Read and display data in the stream
            Scanner s1=new Scanner(new File("Teacher.txt"));
            System.out.println("Records of Teacher.txt");
            System.out.println("Admission No.        Name           Class       Total marks");
            while (s1.hasNext())
            {
                ad=s1.next();
                name=s1.next();
                cls=s1.next();
                t=s1.nextInt();
                System.out.println(ad+"                 "+name+"            "+cls+"         "+t);
            }
            s1.close();
            break;
            case 2:
            int max=0;
            String a="", n="", c="";
            Scanner s2=new Scanner(new File("T.txt"));
            while (s2.hasNext())
            {
                ad=s2.next();
                name=s2.next();
                cls=s2.next();
                t=s2.nextInt();
                if(max<t)
                {
                    max=t;
                    a=ad;
                    n=name;
                    c=cls;
                }
            }
            System.out.println("Highest Total");
            System.out.println("Admission No.   Name                Class       Total marks");
            System.out.println(a+"             "+n+"    "+c+"         "+max);
            break;
            default:
            System.out.println("Wrong choice!");
        }
    }
}
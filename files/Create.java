//Program to enter data in a text file
import java.io.*;
import java.util.*;
public class Create
{
    public static void main(String args[])throws IOException
    {
        //Create an output file stream and construct a file
        FileWriter out=new FileWriter("Create.txt");
        BufferedWriter ft=new BufferedWriter(out);
        PrintWriter ob=new PrintWriter(ft);
        Scanner in=new Scanner(System.in);
        int t,i;
        String ad,name,cls;
        //Enter data in the stream
        System.out.println("Details of the student");
        for(i=1;i<=10;i++)
        {
            System.out.println("Enter Admission no");
            ad=in.next();
            System.out.println("Enter Name");
            name=in.next();
            System.out.println("Enter Class");
            cls=in.next();
            System.out.println("Enter Total marks");
            t=in.nextInt();
            ob.println(ad);
            ob.println(name);
            ob.println(cls);
            ob.println(t);
        }
        out.close();
    }
}
        
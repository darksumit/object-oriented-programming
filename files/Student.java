//Program to display performance of students using Scanner Class
import java.io.*;
import java.util.*;
class Student
{
    public static void main(String args[])throws IOException
    {
        String name,g="";
        int i,p,c,m,b,n,t=0;
        double a=0;
        FileWriter fw=new FileWriter("Grade.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of students");
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            System.out.println("Enter name of student");
            name=sc.next();
            System.out.println("Enter marks in physics");
            p=sc.nextInt();
            System.out.println("Enter marks in chemistry");
            c=sc.nextInt();
            System.out.println("Enter marks in maths");
            m=sc.nextInt();
            System.out.println("Enter marks in biology");
            b=sc.nextInt();
            t=p+c+m+b;
            a=t/4;
            pw.println(name);
            pw.println(p);
            pw.println(c);
            pw.println(m);
            pw.println(b);
            pw.println(t);
            pw.println(a);
        }
        pw.close();
        bw.close();
        fw.close();
        Scanner s=new Scanner(new File("Grade.txt"));
        System.out.println("Name            Total           Average         Grade");
        while (s.hasNext())
        {
            name=s.next();
            p=s.nextInt();
            c=s.nextInt();
            m=s.nextInt();
            b=s.nextInt();
            t=s.nextInt();
            a=s.nextDouble();
            if(a>=90)
            g="A";
            if(a>=80 && a<90)
            g="B";
            if(a>=60 && a<80)
            g="C";
            if(a>=40 && a<60)
            g="D";
            if(a<40)
            g="E";
            System.out.println(name+"              "+t+"               "+a+"           "+g);
        }
        s.close();
    }
}
import java.io.*;
class Marks extends Details
{
    int p,c,m,b,e,t=0;
    double a=0;
    String g;
    void data()throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        input();
        System.out.println("Enter marks in physics");
        p=Integer.parseInt(in.readLine());
        System.out.println("Enter marks in chemistry");
        c=Integer.parseInt(in.readLine());
        System.out.println("Enter marks in maths");
        m=Integer.parseInt(in.readLine());
        System.out.println("Enter marks in biology");
        b=Integer.parseInt(in.readLine());
        System.out.println("Enter marks in english");
        e=Integer.parseInt(in.readLine());
    }
    void calculate()
    {
        t=p+c+m+b+e;
        a=t/5;
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
    }
    void display()
    {
        super.display();
        System.out.println("Marks in Physics: "+p);
        System.out.println("Marks in Chemistry: "+c);
        System.out.println("Marks in Mathematics: "+m);
        System.out.println("Marks in Biology: "+b);
        System.out.println("Marks in English: "+e);
        System.out.println("Total: "+t);
        System.out.println("Average: "+a);
        System.out.println("Grade: "+g);
    }
}
//End of derived class
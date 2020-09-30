/*Program to create a class with the basic details of a student and another class to store his marks using the concept of inheritance.*/
import java.io.*;
class Details
{
    String name;
    int rn;
    void input()throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        System.out.println("Enter name");
        name=in.readLine();
        System.out.println("Enter Roll No.");
        rn=Integer.parseInt(in.readLine());
    }
    void display()
    {
        System.out.println("Name of the student: "+name);
        System.out.println("Roll No. "+rn);
    }
}
//End of main class
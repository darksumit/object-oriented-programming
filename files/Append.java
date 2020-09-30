//Program to append data using text file concept
import java.io.*;
import java.util.*;
public class Append
{
    public static void main(String args[])throws IOException
    {
        DataInputStream in=new DataInputStream(System.in);
        FileWriter fw=new FileWriter("Text1.txt",true);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter pw=new PrintWriter(bw);
        String st;
        int x,c=0;
        System.out.println("Appending records");
        do
        {
            System.out.println("Enter a sentence");
            st=in.readLine();
            pw.println(st);
            System.out.println("Add more records? \n 1.Yes \n 2.No");
            x=Integer.parseInt(in.readLine());
        }
        while(x==1);
        pw.close();
        FileReader fr=new FileReader("Text1.txt");
        BufferedReader br=new BufferedReader(fr);
        boolean e=false;
        int i;
        while((st=br.readLine())!=null)
        c++;
        System.out.println("Number of sentences added to the file=" +c);
    }
}
            
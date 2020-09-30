import java.io.*;
class Palindrome
{
    int Palindrome(String s)
    {
        int i,l,k=0;
        char c;
        String st="";
        l=s.length();
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            st=c+st;
        }
        if(st.equalsIgnoreCase(s))
        k=1;
        return (k);
    }
    public static void main(String args[])throws IOException
    {
        int x;
        String s;
        DataInputStream in=new DataInputStream(System.in);
        System.out.println("Enter Word");
        s=in.readLine();
        Palindrome p=new Palindrome();
        x=p.Palindrome(s);
        if(x==1)
        System.out.println("The word is a Palindrome");
        else
        System.out.println("The word is not a Palindrome");
    }
}
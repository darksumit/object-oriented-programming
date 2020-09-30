import java.util.*;
class Polygon
{
    int diagonals(int x)
    {
        int d=x*(x-3)/2;
        return (d);
    }
    int degree(int x)
    {
        int s=(x-2)*180;
        return (s);
    }
    double radian(int x)
    {
        double s=(x-2)*3.1415;
        return (s);
    }
    public static void main(String args[])
    {
        int n, di, s1;
        double s2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of sides of polygon");
        n=sc.nextInt();
        if (n>2)
        {
            Polygon p=new Polygon();
            di=p.diagonals(n);
            s1=p.degree(n);
            s2=p.radian(n);
            System.out.println("Number of Diagonals= " +di);
            System.out.println("Sum of Interior Angles= " +s1 +"degrees= " +s2 +"radians");
        }
        else
        System.out.println("Not a Polygon");
    }
}
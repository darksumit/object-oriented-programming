//To Calculate Area of a Given Figure
import java.util.*;
class Area
{
    double a;
    void Circle()
    {
        double r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of radius");
        r=sc.nextDouble();
        a=3.1415*r*r;
        System.out.println("Area= " +a +" units");
    }
    void Square()
    {
        double s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of any side");
        s=sc.nextDouble();
        a=s*s;
        System.out.println("Area= " +a +" units");
    }
    void Rectangle()
    {
        double l,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of any two adjacent sides");
        l=sc.nextDouble();
        b=sc.nextDouble();
        a=l*b;
        System.out.println("Area= " +a +" units");
    }
    void Rhombus()
    {
        double d1,d2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of diagonals");
        d1=sc.nextDouble();
        d2=sc.nextDouble();
        a=d1*d2/2;
        System.out.println("Area= " +a +" units");
    }
    void Parallelogram()
    {
        double l,al;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of any side and its corresponding altitude");
        l=sc.nextDouble();
        al=sc.nextDouble();
        a=l*al;
        System.out.println("Area= " +a +" units");
    }
    void Equilateral()
    {
        double s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of any side");
        s=sc.nextDouble();
        a=Math.sqrt(3)/4*s*s;
        System.out.println("Area= " +a +" units");
    }
    void Isosceles()
    {
        double e,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of equal side and base");
        e=sc.nextDouble();
        b=sc.nextDouble();
        a=b/4*Math.sqrt(4*e*e-b*b);
        System.out.println("Area= " +a +" units");
    }
    void Scalene()
    {
        double p,q,r,s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of three sides");
        p=sc.nextDouble();
        q=sc.nextDouble();
        r=sc.nextDouble();
        s=(p+q+r)/2;
        a=Math.sqrt(s*(s-p)*(s-q)*(s-r));
        System.out.println("Area= " +a +" units");
    }
    public static void main(String args[])
    {
       Area ar=new Area();
       int x;
       Scanner sc=new Scanner(System.in);
       System.out.println("Select a Figure to Calculate Area");
       System.out.println("1.Circle \n2.Square \n3.Rectangle \n4.Rhombus \n5.Parallelogram \n6.Equilateral Triangle \n7.Isosceles Triangle \n8.Scalene Triangle");
       x=sc.nextInt();
       if(x==1)
       ar.Circle();
       else if(x==2)
       ar.Square();
       else if(x==3)
       ar.Rectangle();
       else if(x==4)
       ar.Rhombus();
       else if(x==5)
       ar.Parallelogram();
       else if(x==6)
       ar.Equilateral();
       else if(x==7)
       ar.Isosceles();
       else if(x==8)
       ar.Scalene();
       else
       System.out.println("Wrong input");
    }
}
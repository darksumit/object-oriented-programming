import java.util.*;
class Intersection
{
    int a,b,c1;
    double d,g,f,c;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Equation of Circle: x*x+y*y+2gx+2fy+c=0 \n Enter values of g,f and c");
        g=sc.nextDouble();
        f=sc.nextDouble();
        c=sc.nextDouble();
        System.out.println("Equation of Straight Line: ax+by+c1=0 \n Enter values of a,b and c1");
        a=sc.nextInt();
        b=sc.nextInt();
        c1=sc.nextInt();
    }
    void calc()
    {
        d=Math.pow(2*a*c1+2*b*b*g-2*a*b*f,2)-4*(a*a+b*b)*(c1*c1-2*b*c1*f+b*b*c);
    }
    void display()
    {
        if (d<0)
        System.out.println("Line does not intersect the circle");
        if (d==0)
        System.out.println("Line forms a Tangent");
        if (d>0)
        System.out.println("Line forms a Secant");
    }
    public static void main(String args[])
    {
       Intersection ob=new Intersection();
       ob.accept();
       ob.calc();
       ob.display();
    }
}
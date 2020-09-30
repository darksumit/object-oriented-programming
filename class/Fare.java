import java.util.*;
class Fare
{
    double d,f;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Distance in Kilometres");
        d=sc.nextDouble();
    }
    void calculate()
    {
        if (d<=2)
        {
            f=50;
        }
        else if (d>2 && d<=5)
        {
            f=50+10*(d-2);
        }
        else if (d>5 && d<=10)
        {
            f=50+10*3+5*(d-5);
        }
        else
        {
            f=50+10*3+5*5+2*(d-10);
        }
        f= (int)f;
    }
    void display()
    {
        System.out.println("Distance Travelled=" +d +"km");
        System.out.println("Fare=" +f);
    }
    public static void main(String args[])
    {
        Fare ob=new Fare();
        ob.input();
        ob.calculate();
        ob.display();
    }
}
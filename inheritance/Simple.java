import java.io.*;
class Simple extends Bank
{
    double r,t,si;
    Simple(double rate, double time)
    {
        r=rate;
        t=time;
    }
    double Interest()throws IOException
    {
        accept();
        si=p*t*r/100;
        return(si);
    }
    void display2()throws IOException
    {
        double I=Interest();
        System.out.println("Rate: "+r);
        System.out.println("Time: "+t);
        System.out.println("Interest: "+I);
    }
}
//End of Sub Class

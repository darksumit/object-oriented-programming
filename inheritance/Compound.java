import java.io.*;
class Compound extends Bank
{
    double r,t,ci;
    Compound(double rate, double time)
    {
        r=rate;
        t=time;
    }
    double Interest()throws IOException
    {
        accept();
        ci=p*Math.pow((1+r/100),t)-p;
        return(ci);
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
    
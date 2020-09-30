import java.util.*;
class Prime
{
    int x,i,k=0;
    int prime(int x)
    {
        if(x==0 || x==1)
            k=1;
        if(x==2)
            k=0;
        else
        {
            for(i=2;i<x;i++)
        	{
            	if(x%i==0)
            	{
            	    k=1;
            	    break;
            	}
            }
        }
        return (k);
    }
    double factorial(int x)
    {
        if(x==0)
        return (1);
        else
        return (x*factorial(x-1));
    }
    public static void main(String args[])
    {
        int n,p=0;
        double f=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        n=sc.nextInt();
        Prime fc=new Prime();
        p=fc.prime(n);
        if(p==0)
        System.out.println("It is a Prime Number");
        else
        {
            f=fc.factorial(n);
            System.out.println("Not a Prime Number \nFactorial= " +f);
        }
    }
}
class Gross extends Payment
{
    double da,hra,gross;
    void calculate()
    {
        getdata();
        da=0.1*basic;
        hra=0.2*basic;
        gross=basic+da+hra;
    }
    void display()
    {
        System.out.println("DA: "+da+"\nHRA: "+hra+"\nGross: "+gross);
    }
    void test()
    {
        calculate();
        super.display();
        //Calling display method of base class (Payment)
        display();
        //Calling display method of sub class salary
    }
}
    
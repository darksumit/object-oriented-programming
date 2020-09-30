import java.io.*;
class Overload
{
    double v;
    double Volume(double r)
    {
        v=4/3*3.1415*Math.pow(r,3);
        return (v);
    }
    double Volume(double r, double l)
    {
        v=1/3*3.1415*r*r*l;
        return (v);
    }
    double Volume(double r, float h)
    {
        v=3.1415*r*r*h;
        return (v);
    }
    double Volume(float x, float y, float z)
    {
        v=x*y*z;
        return (v);
    }
    double Volume(float x)
    {
        v=Math.pow(x,3);
        return (v);
    }
    public static void main(String args[])throws IOException
    {
        int ch;
        float h0,x0,y0,z0;
        double r0,l0,vol;
        DataInputStream in=new DataInputStream(System.in);
        Overload ob=new Overload();
        System.out.println("1.Sphere \n2.Cone \n3.Cylinder \n4.Cuboid \n5.Cube");
        System.out.println("Enter your choice");
        ch=Integer.parseInt(in.readLine());
        switch (ch)
        {
            case 1:
            System.out.println("Enter Radius");
            r0=Double.parseDouble(in.readLine());
            System.out.println("Volume= " +ob.Volume(r0));
            break;
            case 2:
            System.out.println("Enter Radius and Length");
            r0=Double.parseDouble(in.readLine());
            l0=Double.parseDouble(in.readLine());
            System.out.println("Volume= " +ob.Volume(r0,l0));
            break;
            case 3:
            System.out.println("Enter Radius and Height");
            r0=Double.parseDouble(in.readLine());
            h0=Float.parseFloat(in.readLine());
            System.out.println("Volume= " +ob.Volume(r0,h0));
            break;
            case 4:
            System.out.println("Enter Length, Breadth and Height");
            x0=Float.parseFloat(in.readLine());
            y0=Float.parseFloat(in.readLine());
            z0=Float.parseFloat(in.readLine());
            System.out.println("Volume= " +ob.Volume(x0,y0,z0));
            break;
            case 5:
            System.out.println("Enter Side");
            x0=Float.parseFloat(in.readLine());
            System.out.println("Volume= " +ob.Volume(x0));
            break;
            default:
            System.out.println("Wrong Input");
        }
    }
}               
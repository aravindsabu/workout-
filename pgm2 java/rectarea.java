import java.util.*;
class rectangle
{
    double length;
    double breadth;

    rectangle(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    double getArea()
    {
        return length * breadth;
    }

    double getPerimeter()
    {
        return 2 * (length + breadth);
    }
}
 class rectarea
{
    public static void main(String args[])
    {
		System.out.println("\n Enter the length and breadth of the rectangle");
	    Scanner sc = new Scanner(System.in);
		double l=sc.nextDouble();
        double b=sc.nextDouble();		
        rectangle rect = new rectangle(l, b);
        System.out.println("\tLength    = " + rect.length);
        System.out.println("\tBreadth   = " + rect.breadth);
        System.out.println("\tArea      = " + rect.getArea());
        System.out.println("\tPerimeter = " + rect.getPerimeter());
    
    }
}
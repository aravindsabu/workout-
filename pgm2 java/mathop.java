import java.util.*;
import java.lang.Math;
class mathoperation
	 {
    int x,y;
	double r;
    void init()
		   {
	         System.out.println("\n Enter two numbers");
			 Scanner sc = new Scanner(System.in);		
		     x=sc.nextInt();
		     y=sc.nextInt();
		   }
    double add()
		   {
		     r=x+y;
			 return r;
		     //System.out.println("\n  sum of "+x +" and "+y +" = "+r );
		   }
    double multiply()
		   {
		     r=x*y;
			 return r;
		     //System.out.println("\n  product of "+x +" and "+y +" = "+r );
		   }
    double power()
		   {
		     r=(Math.pow(x,y));
			 return r;
		     //System.out.println("\n  power of "+x +" and "+y +" = "+r  );
		   }
	void display()
	       { 
		     System.out.println("\n \tResult is shown below");
			 System.out.println("\n  Sum of "+x +" and "+y +"      = "+add() );
			 System.out.println("\n  Product of "+x +" and "+y +"  = "+multiply() );
			 System.out.println("\n  Power of "+x +" and "+y +"    = "+power() );
            }
  }
  
  public class mathop
  {
    public static void main(String args[])
      {
        try 
		    { 	
              mathoperation mo = new mathoperation();
	          mo.init();
			  mo.display();
			  mo.add();
			  mo.multiply();
			  mo.power();
	        } catch (Exception e){}
      }
  }
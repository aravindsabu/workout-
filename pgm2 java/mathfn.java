import java.util.*;
class mathfunction
	 {
    void multiply(int a,int b)
		   {
		     int x=a;
			 int y=b;
	         System.out.println("\n Product of "+x +" and "+y+" is :"+( x*y));
		   }
    void multiply(double a,double b)
		   {
		     double x=a;
			 double y=b;
		     System.out.println("\n Product of "+x +" and "+y+" is :"+( x*y));
		   }
    void multiply(double a,int b)
		   {
		     double x=a;
			 int y=b;
		     System.out.println("\n Product of "+x +" and "+y+" is :"+( x*y));
		   }
  }
  
  public class mathfn
  {
    public static void main(String args[])
      {
        try 
		    { 	  
              mathfunction mf = new mathfunction();
	          mf.multiply(5,6);
			  mf.multiply(10.0,5.0);
			  mf.multiply(5.0,20);
	        } catch (Exception e){}
      }
  }
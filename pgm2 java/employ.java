import java.util.*;
class employee
  {  
    static int empno;
	static double salary,total_salary;
	
    employee(double salary)
		   {
	         empno++;
			 this.salary=salary;
			 total_salary=salary+total_salary;
		   }
    void show()
		   {
		     System.out.println("\n Employee Number : "+empno);
			 System.out.println("\n Total salary    : "+total_salary);
		   }
   }
class employ
   {
     public static void main(String args[])
	       {
		     float s1,s2,s3,s4;
	     	 System.out.println("\n\n Enter first person salary");
			 Scanner sc = new Scanner(System.in);		
		     s1=sc.nextFloat();
			 employee e1=new employee(s1);
			 e1.show();
			 System.out.println("\n\n Enter second person salary");		
		     s2=sc.nextFloat();
			 employee e2=new employee(s2);
			 e2.show();
			 System.out.println("\n\n Enter third person salary");		
		     s3=sc.nextFloat();
			 employee e3=new employee(s3);
			 e3.show();
			 System.out.println("\n\n Enter fourth person salary");		
		     s4=sc.nextFloat();
			 employee e4=new employee(s4);
			 e4.show();
			 

		   }
   }
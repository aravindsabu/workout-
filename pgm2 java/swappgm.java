import java.util.*;
class swappgm
{
  int x,y;
  swappgm(){}
  swappgm(int a,int b)
    {
      x = a;
      y = b;
     }
  void swap(int x,int y)
     { 
	   System.out.println("\n  Call by Value");
       System.out.println(" Before Swapping: X =" +x+ " and Y = " +y);
       int temp = x ;
           x = y;
           y = temp;
       System.out.println(" After Swapping: X =" +x+ " and Y = " +y);
     }
  void swapref(swappgm v1)
     { 
	   System.out.println("\n  Call by Reference");
       System.out.println(" Before Swapping: X =" +x+ " and Y = " +y);
       int temp;
       temp=v1.x;
       v1.x=v1.y;
       v1.y=temp;
       System.out.println(" After Swapping: X =" +v1.x+ " and B = " +v1.y);
     }
  public static void main(String[] args)
     { 
	    System.out.println("\nEnter two numbers");
	    Scanner sc = new Scanner(System.in);
	    int c =sc.nextInt();
        int d =sc.nextInt();		
        swappgm s1 = new swappgm();
        s1.swap(c,d);
        swappgm s2 = new swappgm(c,d);
        s2.swapref(s2);
     }
}
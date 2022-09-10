import java.util.*;
class no_object
  {
     static int count;
	 no_object()
	   {
	     count+=1;
	   }
	 public static void main(String args[])
	  {
	    no_object ob1=new no_object();
		no_object ob2=new no_object();
		no_object ob3=new no_object();
	    no_object ob4=new no_object();
		no_object ob5=new no_object();
		System.out.println("\n Number of object = "+count);
	  }
   }